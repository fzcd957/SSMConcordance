package com.mec.dao;

import com.mec.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findall();
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
