package com.xiaopotian.demo.controller;

import com.xiaopotian.demo.domain.NeoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoulu on 2017-12-19.
 */
@RestController
public class HelloWorldController {
    @Autowired
    NeoProperties neoProperties;
    @RequestMapping("/hello")
    public String index() {
        return neoProperties.getTitle()+neoProperties.getDescription();
    }
}
