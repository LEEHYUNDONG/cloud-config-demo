package demo.cloudconfigclient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2022. CJ OliveNetworks Co. all rights reserved.
 *
 * @author :
 * @date :
 * @description : OO 기능을 구현한 Class
 * @issues :
 * -----------------------------------------------------------
 * DATE              AUTHOR             MAJOR_ISSUE
 * -----------------------------------------------------------
 * 생성
 * -----------------------------------------------------------
 */

@Getter
@Setter
@ConfigurationProperties("com.easttwave")
@Configuration
@RefreshScope
@ToString
public class MyConfig {
    private String profile;
    private String region;
}
