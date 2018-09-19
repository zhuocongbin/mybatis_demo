package com.zcb.demo.mybatis.component;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by zhuocongbin
 * date 2018/9/19
 */
@Slf4j
public class SQLSessionFactory {

    private static SqlSessionFactory sessionFactory;
    static {
        initSessionFactory();
    }
    private static void initSessionFactory() {
        try {
            sessionFactory = new SqlSessionFactoryBuilder().
                    build(Resources.getResourceAsStream(SQLSessionFactory.class.getClassLoader(), "mybatis-config.xml"));
        } catch (IOException e) {
            log.error("sqlsessionFactory init error");
            System.exit(0);
        }
    }
    public static SqlSession getSession() {
        return sessionFactory.openSession(true);
    }

}
