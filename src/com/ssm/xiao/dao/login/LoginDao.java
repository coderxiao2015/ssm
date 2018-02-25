package com.ssm.xiao.dao.login;

import com.ssm.xiao.common.BaseDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/2/25.
 */
@Repository
@Scope(value = "prototype")
public class LoginDao extends BaseDao{

    public int findUserInfo(HashMap<String,Object>  param){
        String queryStr="login.findUserInfo";
      return super.getSqlSession().select(queryStr,param);
    }

}
