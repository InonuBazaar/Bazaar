package com.Ino.Inobazaar.base.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(
        basePackages = {"com.Ino.Inobazaar"},
        repositoryFactoryBeanClass = CustomerDbJpaRepositoryFactoryBean.class)
@EnableTransactionManagement
public class DatabaseConfiguration {

}
