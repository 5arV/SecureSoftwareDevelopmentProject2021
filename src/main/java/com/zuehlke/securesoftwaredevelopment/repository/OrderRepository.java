package com.zuehlke.securesoftwaredevelopment.repository;

import com.zuehlke.securesoftwaredevelopment.domain.*;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private DataSource dataSource;

    public OrderRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<Food> getMenu(int id) {
        List<Food> menu = new ArrayList<>();
        String sqlQuery = "SELECT id, name FROM food WHERE restaurantId=" + id;
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sqlQuery)) {
            while (rs.next()) {
                menu.add(createFood(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menu;
    }

    private Food createFood(ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        return new Food(id, name);
    }

    public void insertNewOrder(NewOrder newOrder, int userId) {
        LocalDate date = LocalDate.now();
        String sqlQuery = "INSERT INTO delivery (isDone, userId, restaurantId, addressId, date, comment)" +
                "values (FALSE, " + userId + ", " + newOrder.getRestaurantId() + ", " + newOrder.getAddress() + "," +
                "'" + date.getYear() + "-" + date.getMonthValue() + "-" + date.getDayOfMonth() + "', '" + newOrder.getComment() + "')";
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);

            sqlQuery = "SELECT MAX(id) FROM delivery";
            ResultSet rs = statement.executeQuery(sqlQuery);

            if (rs.next()) {

                int deliveryId = rs.getInt(1);
                sqlQuery = "INSERT INTO delivery_item (amount, foodId, deliveryId)" +
                        "values";
                for (int i = 0; i < newOrder.getItems().length; i++) {
                    FoodItem item = newOrder.getItems()[i];
                    String deliveryItem = "";
                    if (i > 0) {
                        deliveryItem = ",";
                    }
                    deliveryItem += "(" + item.getAmount() + ", " + item.getFoodId() + ", " + deliveryId + ")";
                    sqlQuery += deliveryItem;
                }
                System.out.println(sqlQuery);
                statement.executeUpdate(sqlQuery);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public Object getAddresses(int userId) {
        List<Address> addresses = new ArrayList<>();
        String sqlQuery = "SELECT id, name FROM address WHERE userId=" + userId;
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sqlQuery)) {
            while (rs.next()) {
                addresses.add(createAddress(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }

    private Address createAddress(ResultSet rs) throws SQLException {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        return new Address(id, name);

    }
}
