package demo.cloudconfigclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CloudConfigClientApplicationTests {

    @Autowired
    private MyConfig myConfig;

    @Test
    void contextLoads() {
        assertThat(myConfig.getProfile()).isEqualTo("demo");
    }


}
