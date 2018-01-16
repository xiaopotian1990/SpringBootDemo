package com.xiaopotian.demo.dao;

import com.xiaopotian.demo.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    List<Customer> getAll();

    Customer getOne(Long id);

    void insert(Customer user);

    void update(Customer user);

    void delete(Long id);
}
