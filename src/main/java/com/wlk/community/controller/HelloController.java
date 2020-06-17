package com.wlk.community.controller;

import com.wlk.community.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public User hello(@RequestParam("id") Integer id, @RequestParam("name") String name, Model model){
        System.out.println(id+"--------"+name);
        model.addAttribute("id",id);
        model.addAttribute("name",name);
        System.out.println(model);
        User u=new User();
        u.setId(id);
        u.setName(name);

        return u;
    }
}
