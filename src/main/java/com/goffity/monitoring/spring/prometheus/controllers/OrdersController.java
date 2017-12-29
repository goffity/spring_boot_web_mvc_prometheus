package com.goffity.monitoring.spring.prometheus.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
    private Log logging = LogFactory.getLog(OrdersController.class);

    @RequestMapping("/orders")
    public String index() {
        logging.info("index()");
        return "index()";
    }
}
