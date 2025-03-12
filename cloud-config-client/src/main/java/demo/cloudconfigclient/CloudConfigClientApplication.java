package demo.cloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("com.easttwave")
public class CloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }

}
