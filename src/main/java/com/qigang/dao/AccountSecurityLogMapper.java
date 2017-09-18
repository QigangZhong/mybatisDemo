package com.qigang.dao;

import com.qigang.model.AccountSecurityLog;

public interface AccountSecurityLogMapper {
    int insert(AccountSecurityLog record);

    int insertSelective(AccountSecurityLog record);
}