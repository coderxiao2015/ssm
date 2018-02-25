package com.ssm.xiao.common;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 创建一个基础Dao,所有的dao继承这个dao,免去创建SqlSession
 */
public class BaseDao {

    /*
    * 为什么要将SqlSessionFactory 交给spring 托管，spring 托管的bean是无状态的bean 是单例，
    * SqlSessionFactory 的session 工厂，不能每次访问数据库的时候就创建一个实例，这样过多的实例是没有效果的，
    * 只会增加虚拟机的内存消耗
    * */
    public SqlSession getSqlSession(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        SqlSessionFactory sessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession=sessionFactory.openSession();
        return sqlSession;
    }

}
