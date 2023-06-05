package com.convenient.store.modelling.store.servicesImplementation;

import com.convenient.store.modelling.store.model.Cashier;
import com.convenient.store.modelling.store.model.Manager;
import com.convenient.store.modelling.store.sevices.ManagerService;

public class ManagerServiceImp implements ManagerService {
    @Override
    public String hireCashier(Cashier cashier, Manager manager) {
        //manager.getCashiers().add(cashier);
        if (cashier.getRating() >= 4 ) {
            manager.getCashiers().add(cashier);
            return ("Cashier " + cashier.getName() + " has been hired.");
        }else {
            return ("Not Qualify " + cashier.getName());
        }
    }

    @Override
    public String listCashiers(Manager manager) {
        System.out.println("Current Cashiers:");
        System.out.println();
        for (Cashier cashier : manager.getCashiers()) {
            System.out.println(cashier);
        }
        return null;

    }
}
