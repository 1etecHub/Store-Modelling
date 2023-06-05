package com.convenient.store.modelling.store.servicesImplementation;

import com.convenient.store.modelling.store.model.Customer;
import com.convenient.store.modelling.store.model.Product;
import com.convenient.store.modelling.store.model.Store;
import com.convenient.store.modelling.store.sevices.CashierService;

import java.util.ArrayList;

public class CashierServiceImp implements CashierService {
    @Override
    public String providesReceipt(Customer customer, ArrayList<Product> cart) {

            System.out.println("Reciept for "+ customer.getName());

            double total = 0;
            double currentWallet  = 0;
        for (Product product : customer.getCart()) {
                System.out.println(product.getName() + ": $" + product.getPrice() + " - "   + product.getBrand());
                System.out.println("-----------------------------------");
                total += product.getPrice();
            }
            if (customer.getWalletAmount() >= total) {
                System.out.println("Total: $" + total);
                System.out.println("payment successful");
                System.out.println("---------------------");
                System.out.println("---------------------");

                //currentWallet += customer.getWalletAmount() - total;


            }else {
                return ("C payment failed...Customer funds is insufficient");

            }
            return null;
        }

        @Override
        public String sellProduct(Customer customer, Product product, Store store) {
            return ("Sold " + product.getName() + " to " + customer.getName());
        }

    }

