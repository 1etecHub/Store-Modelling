package com.convenient.store.modelling.store.sevices;

import com.convenient.store.modelling.store.model.Customer;
import com.convenient.store.modelling.store.model.Product;

public interface CustomerService {
    public void addToCart(Product product, Customer customer);
}
