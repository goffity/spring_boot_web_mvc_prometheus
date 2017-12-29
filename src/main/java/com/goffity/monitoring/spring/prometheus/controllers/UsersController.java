package com.goffity.monitoring.spring.prometheus.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    private Log logging = LogFactory.getLog(UsersController.class);

    @RequestMapping("/users")
    public @ResponseBody
    String getAllUsers() {
        logging.info("getAllUsers()");
        return "getAllUsers()";
    }
}
