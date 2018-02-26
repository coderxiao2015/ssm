package com.xiao.controller.login;

import com.xiao.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/2/25.
 */
@Controller
@Scope(value = "prototype")
public class LoginAction {

    @Autowired
    private LoginService loginService;

    public void findUserInfo(){
        String userId="11";
        HashMap<String,Object> map=new HashMap<>();
        map.put("id",userId);
        loginService.findUserInfo(map);
    }

}
