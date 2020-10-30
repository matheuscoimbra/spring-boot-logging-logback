package com.log.springbootlogging;

import com.log.springbootlogging.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    @Autowired
    private LogService service;

    @Autowired
    private LogService2 service2;

    @GetMapping("/")
    public String index() {

        service.log();
        service2.log();
        return "Howdy! Check out the Logs to see the output...";
    }


}
