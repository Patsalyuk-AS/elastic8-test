package com.github.aspatsalyuk.elastic8test.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.elasticsearch.rest")
@Getter
@Setter
public class ElasticProperties {

    private String[] uris;

    private String username;

    private String password;
}
