package demo.cloudconfigclient.api;

import demo.cloudconfigclient.MyConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final MyConfig myConfig;

    @GetMapping("/my-config")
    public ResponseEntity<String> getConfig() {
        return ResponseEntity.ok(myConfig.toString());
    }

}
