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
@MapperScan(basePackages = "com.obl.wehelp.mapper", sqlSessionFactoryRef = "writeOnlySqlSessionFactory")
public class WriteOnlyDataSourceConfig {

    @Bean(name = "writeOnlyDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.write-only")
    public DataSource writeOnlyDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "writeOnlyTransactionManager")
    public DataSourceTransactionManager writeOnlyTransactionManager(@Qualifier("writeOnlyDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "writeOnlySqlSessionFactory")
    public SqlSessionFactory writeOnlySqlSessionFactory(@Qualifier("writeOnlyDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }
}