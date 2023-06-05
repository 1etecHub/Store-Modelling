package com.convenient.store.modelling.store.servicesImplementation;

import com.convenient.store.modelling.store.model.Customer;
import com.convenient.store.modelling.store.model.Product;
import com.convenient.store.modelling.store.sevices.CustomerService;

public class CustomerServiceImp implements CustomerService {

    @Override
    public void addToCart(Product product, Customer customer) {

            customer.getCart().add(product);


        }

    }

