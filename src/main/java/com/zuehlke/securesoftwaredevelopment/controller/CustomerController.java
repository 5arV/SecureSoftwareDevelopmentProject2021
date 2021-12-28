package com.zuehlke.securesoftwaredevelopment.controller;

import com.zuehlke.securesoftwaredevelopment.config.AuditLogger;

import com.zuehlke.securesoftwaredevelopment.domain.Address;
import com.zuehlke.securesoftwaredevelopment.domain.CustomerUpdate;
import com.zuehlke.securesoftwaredevelopment.domain.NewAddress;
import com.zuehlke.securesoftwaredevelopment.domain.RestaurantUpdate;
import com.zuehlke.securesoftwaredevelopment.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);
    private static final AuditLogger auditLogger = AuditLogger.getAuditLogger(CustomerController.class);

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers-and-restaurants")
    public String customersAndRestaurants(Model model) {
        model.addAttribute("customers", customerRepository.getCustomers());
        model.addAttribute("restaurants", customerRepository.getRestaurants());
        return "customers-and-restaurants";
    }

    @GetMapping("/restaurant")
    public String getRestaurant(@RequestParam(name = "id", required = true) String id, Model model) {
        model.addAttribute("restaurant", customerRepository.getRestaurant(id));
        return "restaurant";
    }

    @DeleteMapping("/restaurant")
    public String deleteRestaurant(@RequestParam(name = "id", required = true) String id) {
        customerRepository.deleteRestaurant(id);
        return "/customers-and-restaurants";
    }

    @PostMapping("/api/restaurant/update-restaurant")
    public String updateRestaurant(RestaurantUpdate restaurantUpdate, Model model) {
        customerRepository.updateRestaurant(restaurantUpdate);
        customersAndRestaurants(model);
        return "/customers-and-restaurants";
    }

    @GetMapping("/customer")
    public String getCustomer(@RequestParam(name = "id", required = true) String id, Model model) {
        model.addAttribute("customer", customerRepository.getCustomer(id));
        model.addAttribute("addresses", customerRepository.getAddresses(id));
        return "customer";
    }

    @DeleteMapping("/customer")
    public String deleteCustomer(@RequestParam(name = "id", required = true) String id) {
        customerRepository.deleteCustomer(id);
        return "/customers-and-restaurants";
    }

    @PostMapping("/api/customer/update-customer")
    public String updateCustomer(CustomerUpdate customerUpdate, Model model) {
        customerRepository.updateCustomer(customerUpdate);
        customersAndRestaurants(model);
        return "/customers-and-restaurants";
    }

    @DeleteMapping("/customer/address")
    public String deleteCustomerAddress(@RequestParam(name = "id", required = true) String id) {
        customerRepository.deleteCustomerAddress(id);
        return "/customers-and-restaurants";
    }

    @PostMapping("/api/customer/address/update-address")
    public String updateCustomerAddress(Address address, Model model) {
        customerRepository.updateCustomerAddress(address);
        customersAndRestaurants(model);
        return "/customers-and-restaurants";
    }

    @PostMapping("/customer/address")
    public String putCustomerAddress(NewAddress newAddress, Model model){
        customerRepository.putCustomerAddress(newAddress);
        customersAndRestaurants(model);
        return "/customers-and-restaurants";
    }
}
