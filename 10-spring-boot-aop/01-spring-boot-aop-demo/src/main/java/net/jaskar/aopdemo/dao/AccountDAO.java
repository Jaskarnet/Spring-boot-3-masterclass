package net.jaskar.aopdemo.dao;

import net.jaskar.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);
}
