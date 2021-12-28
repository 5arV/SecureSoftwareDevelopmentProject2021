package com.zuehlke.securesoftwaredevelopment.controller;

import com.zuehlke.securesoftwaredevelopment.domain.Food;
import com.zuehlke.securesoftwaredevelopment.domain.NewOrder;
import com.zuehlke.securesoftwaredevelopment.domain.User;
import com.zuehlke.securesoftwaredevelopment.repository.CustomerRepository;
import com.zuehlke.securesoftwaredevelopment.repository.OrderRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    public OrderController(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/order")
    public String order(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();

        model.addAttribute("restaurants", customerRepository.getRestaurants());
        model.addAttribute("addresses", orderRepository.getAddresses(user.getId()));
        return "order";
    }


    @GetMapping(value = "/api/menu", produces = "application/json")
    @ResponseBody
    public List<Food> getMenu(@RequestParam(name="id") String id){
        return orderRepository.getMenu(id);
    }

    @PostMapping(value = "/api/new-order", consumes = "application/json")
    @ResponseBody
    public String newOrder(@RequestBody NewOrder newOrder){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
        orderRepository.insertNewOrder(newOrder, user.getId());
        return "";
    }
}
