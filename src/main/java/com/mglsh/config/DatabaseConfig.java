package com.mglsh.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Value("${mysql://zq4nr53hy1auy529:sxw1koadu7g7xm3s@b8rg15mwxwynuk9q.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/zw0zfxcbeqwdox0e}")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}