package com.qigang.dao;

import com.qigang.model.CustomerLoginLog;

public interface CustomerLoginLogMapper {
    int deleteByPrimaryKey(Integer sysno);

    int insert(CustomerLoginLog record);

    int insertSelective(CustomerLoginLog record);

    CustomerLoginLog selectByPrimaryKey(Integer sysno);

    int updateByPrimaryKeySelective(CustomerLoginLog record);

    int updateByPrimaryKey(CustomerLoginLog record);
}