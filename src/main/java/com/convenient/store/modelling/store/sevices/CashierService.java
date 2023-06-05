package com.convenient.store.modelling.store.sevices;

import com.convenient.store.modelling.store.model.Customer;
import com.convenient.store.modelling.store.model.Product;
import com.convenient.store.modelling.store.model.Store;

import java.util.ArrayList;

public interface CashierService {
    String providesReceipt(Customer customer, ArrayList<Product> cart);

    public String sellProduct(Customer customer, Product product, Store store);
}
