package com.zuehlke.securesoftwaredevelopment.controller;

import com.zuehlke.securesoftwaredevelopment.config.AuditLogger;
import com.zuehlke.securesoftwaredevelopment.domain.Restaurant;
import com.zuehlke.securesoftwaredevelopment.repository.Customer;
import com.zuehlke.securesoftwaredevelopment.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class PersonsController {

    private static final Logger LOG = LoggerFactory.getLogger(PersonsController.class);
    private static final AuditLogger auditLogger = AuditLogger.getAuditLogger(Customer.class);

    private final Customer customer;

    public PersonsController(Customer customer) {
        this.customer = customer;
    }

    @GetMapping("/customers-and-restaurants")
    public String customersAndRestaurants(Model model) {
        model.addAttribute("customers", customer.getCustomers());
        model.addAttribute("restaurants", customer.getRestaurants());
        return "customers-and-restaurants";
    }

    @GetMapping("/restaurant")
    public String getRestaurant(@RequestParam(name = "id", required = true) String id, Model model) {
        model.addAttribute("restaurant", customer.getRestaurant(id));
        return "restaurant";
    }

    @DeleteMapping("/restaurant")
    public String deleteRestaurant(@RequestParam(name = "id", required = true) String id) {
        customer.deleteRestaurant(id);
        return "customers-and-restaurants";
    }

    @PostMapping("/update-restaurant")
    public String updateRestaurant(@RequestBody Restaurant restaurant) {
        customer.updateRestaurant(restaurant);
        return "customers-and-restaurants";
    }
}
