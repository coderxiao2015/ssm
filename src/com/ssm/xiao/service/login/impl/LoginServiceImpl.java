package com.ssm.xiao.service.login.impl;

import com.ssm.xiao.dao.login.LoginDao;
import com.ssm.xiao.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/2/25.
 */
@Service
@Scope(value = "prototype")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public int findUserInfo(HashMap<String, Object> param) {
        return 0;
    }
}
