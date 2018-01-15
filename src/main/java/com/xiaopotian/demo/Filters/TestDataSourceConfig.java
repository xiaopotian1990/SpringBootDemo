package com.xiaopotian.demo.Filters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

public class TestDataSourceConfig {
    /**
     * 注入test数据源
     */
    @Autowired
    @Qualifier("testDataSource")
    private DataSource testDataSource;
    /**
     * 注入jpa配置实体
     */
    @Autowired
    private JpaProperties jpaProperties;

    /**
     * 配置EntityManager实体
     * @param builder
     * @return
     */
    @Primary
    @Bean(name = "entityManagerTest")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder){
        return entityManagerFactoryTest(builder).getObject().createEntityManager();
    }

    /**
     * 配置EntityManager工厂实体
     * @param builder
     * @return
     */
    @Primary
    @Bean(name = "entityManagerFactoryTest")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTest(EntityManagerFactoryBuilder builder){
        return builder
                .dataSource(testDataSource)
                .properties(getProperties(testDataSource))
                .packages(new String[]{""})
                .persistenceUnit("testPersistenceUnit")
                .build();
    }

    //获取JPA配置信息
    private Map<String,String> getProperties(DataSource dataSource){
        return jpaProperties.getHibernateProperties(dataSource);
    }
}
