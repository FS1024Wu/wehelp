package com.obl.wehelp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class TransactionManagerConfig {

    @Bean
    @Primary
    public PlatformTransactionManager transactionManager(@Qualifier("writeOnlyDataSource")DataSource primaryDataSource) {
        return new DataSourceTransactionManager(primaryDataSource);
    }

    @Bean
    public PlatformTransactionManager secondaryTransactionManager(@Qualifier("readOnlyDataSource")DataSource secondaryDataSource) {
        return new DataSourceTransactionManager(secondaryDataSource);
    }
}