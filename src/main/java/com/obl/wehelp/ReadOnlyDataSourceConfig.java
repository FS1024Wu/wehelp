package com.obl.wehelp;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.obl.wehelp.romapper", sqlSessionFactoryRef = "readOnlySqlSessionFactory")
public class ReadOnlyDataSourceConfig {

    @Bean(name = "readOnlyDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.read-only")
    public DataSource readOnlyDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "readOnlyTransactionManager")
    public DataSourceTransactionManager readOnlyTransactionManager(@Qualifier("readOnlyDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "readOnlySqlSessionFactory")
    public SqlSessionFactory readOnlySqlSessionFactory(@Qualifier("readOnlyDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }
}