package com.mec.service;

import com.mec.domain.Account;

import java.util.List;

public interface Accountservice {
    public List<Account> findall();
    public void saveAccount(Account account);

}
