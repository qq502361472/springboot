package com.hjrpc.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "spring.datasource.spring")
@Component
@Data
public class DBConfig1 {
    private String driverClassName;
    private String jdbcUrl;
    private String username;
    private String password;
}