package com.qigang.app;

import com.qigang.model.CustomerLoginLog;
import com.qigang.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args) {
        SqlSession session = MyBatisUtil.getSqlSession();
        CustomerLoginLog log = session.selectOne("com.qigang.mapper.loginLogMapper.getLoginLog", 1);
        MyBatisUtil.closeSqlSession(session);
        System.out.println(log);
    }
}
