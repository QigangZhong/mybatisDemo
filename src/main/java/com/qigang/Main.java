package com.qigang;

import com.qigang.dao.CustomerMapper;
import com.qigang.dao.UserMapper;
import com.qigang.model.Customer;
import com.qigang.model.User;
import com.qigang.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            //insertUser(sqlSession);
            User user = selectUserById(sqlSession,5);
        } finally {
            sqlSession.close();
        }
    }

    private static User selectUserById(SqlSession sqlSession, int i) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        User u = um.selectByPrimaryKey(i);
        System.out.println(u.getUsername());
        sqlSession.commit();

        return u;
    }

    private static void insertUser(SqlSession sqlSession) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        User u = new User("zhangsan", "123456", new BigDecimal(100));
        um.insert(u);
        sqlSession.commit();
    }


}
