package com.qigang.generator;

import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class TestGenerator {
    private File configFile;

    @Before
    public void before() {
        //读取mybatis参数
        configFile = new File("E:\\GitHub\\mybatisDemo\\src\\main\\resources\\generatorConfig.xml");
    }

    @Test
    public void test() throws Exception{
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null,null,null,true);
    }
}
