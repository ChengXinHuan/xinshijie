package com.itheima.web.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author 程新寰
 */
@RestController
@RequestMapping("/boot")
public class BootController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(BootController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String printInfo(){
        System.out.println("spring running");

        log.info("info...");
        log.warning("warning...");

        return "hello springboot";
    }
}
