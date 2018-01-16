package com.xiaopotian.demo.controller;

import com.xiaopotian.demo.dao.CustomerMapper;
import com.xiaopotian.demo.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/getCustomers")
    public List<Customer> getCustomers() {
        List<Customer> users = customerMapper.getAll();
        return users;
    }

    @RequestMapping("/getCustomer")
    public Customer getCustomer(Long id) {
        Customer user = customerMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(Customer user) {
        customerMapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(Customer user) {
        customerMapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        customerMapper.delete(id);
    }
}
