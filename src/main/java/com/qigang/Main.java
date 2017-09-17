package com.qigang;

import com.qigang.dao.CustomerMapper;
import com.qigang.model.Customer;
import com.qigang.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        try {
            CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
            Customer c = mapper.selectByPrimaryKey(1);

            System.out.println(c.getName());
        } finally {
            sqlSession.close();
        }
    }
}
