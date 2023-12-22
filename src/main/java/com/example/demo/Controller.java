package com.example.demo;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    public static Logger logger = LoggerFactory.getLogger(Controller.class);
    @GetMapping
    public String sayHello(){
        logger.info("the app is executed");
        return "Hello World!";
    }
}
