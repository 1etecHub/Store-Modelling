package com.convenient.store.modelling.store.sevices;

import com.convenient.store.modelling.store.model.Cashier;
import com.convenient.store.modelling.store.model.Manager;

public interface ManagerService {
    public String hireCashier(Cashier cashier, Manager manager);

    public String listCashiers(Manager manager);
}
