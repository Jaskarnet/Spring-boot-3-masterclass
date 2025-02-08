package net.jaskar.aopdemo.dao;

import net.jaskar.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    // add a new method findAccounts()
    List<Account> findAccounts();

    List<Account> findAccounts(boolean tripWire);

    void addAccount(Account account, boolean vipFlag);

    String getName();

    void setName(String name);

    String getServiceCode();

    void setServiceCode(String serviceCode);
}
