package com.springboot_mybatis.wx_uax.config.dao;

import org.springframework.context.annotation.Bean;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;
@Configuration
@MapperScan("com.springboot_mybatis.wx_uax.dao")
public class DataSourceConfiguration {
    //

    @Value("${jdbc.driver}")
    private String jdbcDriverClass;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String jdbcUser;

    @Value("${jdbc.password}")
    private String jdbcPwd;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPwd);
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
