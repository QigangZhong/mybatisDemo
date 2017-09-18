package com.qigang;

import com.qigang.dao.CustomerLoginLogMapper;
import com.qigang.dao.CustomerMapper;
import com.qigang.dao.UserMapper;
import com.qigang.model.Customer;
import com.qigang.model.CustomerLoginLog;
import com.qigang.model.User;
import com.qigang.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            //insertUser(sqlSession);
            //User user = selectUserById(sqlSession,5);

            CustomerLoginLog log=getLoginLogBySysNo(sqlSession,87711);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            sqlSession.close();
        }
    }

    private static CustomerLoginLog getLoginLogBySysNo(SqlSession sqlSession, int i) {
        CustomerLoginLogMapper mapper=sqlSession.getMapper(CustomerLoginLogMapper.class);
        CustomerLoginLog log = mapper.selectByPrimaryKey(i);
        System.out.println(log.getCustomersysno());
        return log;
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
