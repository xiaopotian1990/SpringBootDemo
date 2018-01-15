package com.xiaopotian.demo.Filters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    /**
     * test数据源
     * @return
     */
    @Bean(name = "testDataSource")//装配该方法返回值为testDataSource管理bean
    @Qualifier("testDataSource")//spring装配bean唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.first")//yml文件内配置数据源的前缀
    @Primary//配置该数据源为主数据源
    public DataSource testDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * test2数据源
     * @return
     */
    @Bean(name = "test2DataSource")//装配该方法返回值为testDataSource管理bean
    @Qualifier("test2DataSource")//spring装配bean唯一标识
    @ConfigurationProperties(prefix = "spring.datasource.second")//yml文件内配置数据源的前缀
    public DataSource test2DataSource(){
        return DataSourceBuilder.create().build();
    }
}
