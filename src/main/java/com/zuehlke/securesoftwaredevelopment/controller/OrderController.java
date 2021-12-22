package com.zuehlke.securesoftwaredevelopment.controller;

import com.zuehlke.securesoftwaredevelopment.domain.Food;
import com.zuehlke.securesoftwaredevelopment.domain.NewOrder;
import com.zuehlke.securesoftwaredevelopment.repository.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/order")
    public String order(Model model){
        model.addAttribute("restaurants", orderRepository.getRestaurants());

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
        System.out.println(newOrder);
        return "";
    }
}
