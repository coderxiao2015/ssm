package com.xiao.dao.login;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import com.common.BaseDao;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/2/25.
 */
@Repository
@Scope(value = "prototype")
public class LoginDao extends BaseDao{

    public List<HashMap<String,Object>> findUserInfo(HashMap<String,Object>  param){
        String queryStr="login.findUserInfo";
      return super.getSqlSession().selectList(queryStr,param);
    }

}
