package demo.cloudconfigclient.api;

import demo.cloudconfigclient.MyConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final MyConfig myConfig;
}
