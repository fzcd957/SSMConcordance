package com.mec.controller;

import com.mec.domain.Account;
import com.mec.service.Accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/*
    用户web层
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private Accountservice as;

    @RequestMapping("findall")
    public String finall(Model model){
        System.out.println("表现层:findall");
        List<Account> list = as.findall();
        model.addAttribute("list", list);
        return "findall";
    }

    @RequestMapping("save")
    public void finall(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        as.saveAccount(account);
        System.out.println(request.getContextPath()+"!!!!");
        response.sendRedirect(request.getContextPath()+"/account/findall");
//        return "findall";
    }
}
