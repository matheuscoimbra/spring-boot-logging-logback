package com.log.springbootlogging;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LogService2 {

    public void log(){
        log.trace("A TRACE Message2");
        log.debug("A DEBUG Message2");
        log.info("An INFO Message2");
        log.warn("A WARN Message2");
        log.error("An ERROR Message2");
    }
}
