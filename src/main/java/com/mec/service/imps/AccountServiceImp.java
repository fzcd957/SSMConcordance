package com.mec.service.imps;

import com.mec.dao.AccountDao;
import com.mec.domain.Account;
import com.mec.service.Accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("accountServiceImp")
public class AccountServiceImp implements Accountservice {


    @Autowired
    private AccountDao accountDao;

    public List<Account> findall() {
        System.out.println("业务层：查询所有账户...");
        return accountDao.findall();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");
        accountDao.saveAccount(account);
    }
}
