package com.xiaopotian.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by zoulu on 2017-12-25.
 */
@RestController
public class SessionController {
    @RequestMapping("/uid")
    public String uid(HttpSession session){
        UUID uid=(UUID)session.getAttribute("uid");
        if(uid==null){
            uid=UUID.randomUUID();
        }

        session.setAttribute("uid",uid);

        return session.getId();
    }
}
