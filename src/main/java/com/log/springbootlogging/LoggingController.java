package com.log.springbootlogging;

import com.log.springbootlogging.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoggingController {


    private final LogService service;

    private final LogService2 service2;

    @GetMapping("/")
    public String index() {

        service.log();
        service2.log();
        return "Howdy! Check out the Logs to see the output...";
    }


}
