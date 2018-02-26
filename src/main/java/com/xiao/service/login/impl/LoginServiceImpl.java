package com.xiao.service.login.impl;

import com.xiao.dao.login.LoginDao;
import com.xiao.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/2/25.
 */
@Service
@Scope(value = "prototype")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public List<HashMap<String,Object>> findUserInfo(HashMap<String, Object> param) {
        return loginDao.findUserInfo(param);
    }
}
