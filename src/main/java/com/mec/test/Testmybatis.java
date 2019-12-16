package com.mec.test;

import com.mec.dao.AccountDao;
import com.mec.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Testmybatis {
    @Test
    public void run1() throws Exception {

        //加载配置文件
       InputStream in =  Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建sqlsessionfactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        //创建Session对象
        SqlSession ss = ssf.openSession();
        //得到代理对象
        AccountDao ad = ss.getMapper(AccountDao.class);
        Account ac = new Account();
        ac.setName("张飞");
        ac.setMoney(10000);
        ad.saveAccount(ac);

        //事务需要提交
        ss.commit();
        System.out.println("成功");

        ss.close();
        in.close();

    }
    @Test
    public void run2() throws Exception {
        InputStream in =  Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        SqlSession ss = ssf.openSession();
        AccountDao ad = ss.getMapper(AccountDao.class);
        List<Account> list = ad.findall();
        for(Account ac : list){
            System.out.println(ac);
        }

        ss.close();
        in.close();

    }


}
