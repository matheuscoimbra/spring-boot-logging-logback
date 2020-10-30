package com.log.springbootlogging.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Slf4j
@Service
public class LogService {

    public void log(){

        log.info(String.format("%s: %s---%s---%s---%s","2020-10-20 14:00:00","fulano","1566544","fulano paciente","teste"));
    }
}
