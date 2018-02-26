package com.xiao.service.login;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/2/25.
 */
public interface LoginService {
    public List<HashMap<String,Object>> findUserInfo(HashMap<String,Object> param);
}
