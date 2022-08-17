package com.my.maybank.submission.testsubmissionservice.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${carlos.spring.datasource.jdbcUrl}")
    public String dbUrl;

    @Value("${carlos.spring.datasource.driver-class-name}")
    public String driverClassName;

    @Value("${carlos.spring.datasource.username}")
    public String userName;

    @Value("${carlos.spring.datasource.password}")
    public String password;

    @Value("${carlos.spring.jpa.hibernate.dialect}")
    public String dialect;

    @Value("${carlos.spring.datasource.maximum-pool-size}")
    public Integer maxPoolSize;

    @Value("${carlos.spring.datasource.minimum-idle}")
    public Integer minIdleConnections;

    @Primary
    @Bean(name = "carlosDataSource", destroyMethod = "")
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(dbUrl);
        dataSource.setUsername(userName);
//		String decodedPassword2 = new String(Base64.decodeBase64((password).getBytes(StandardCharsets.UTF_8)));
        dataSource.setPassword(password);
        dataSource.setMaximumPoolSize(maxPoolSize);
        dataSource.setMinimumIdle(minIdleConnections);
        return dataSource;
    }
}
