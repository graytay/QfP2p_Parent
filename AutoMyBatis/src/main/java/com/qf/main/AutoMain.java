package com.qf.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoMain {
    public static void main(String[] args) throws InvalidConfigurationException, InterruptedException, SQLException, IOException, XMLParserException {
        List<String> warns=new ArrayList<>();

        Configuration configuration=new ConfigurationParser(warns).parseConfiguration(
                new File(AutoMain.class.getResource("/").getPath(),"/generatorConfig.xml"));
        DefaultShellCallback callback=new DefaultShellCallback(true);
        MyBatisGenerator generator=new MyBatisGenerator(configuration,callback,warns);
        generator.generate(null);
        System.out.println(warns);
        System.out.println("OK");
    }
}
