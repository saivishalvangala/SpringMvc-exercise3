package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView control(){
        System.out.println("controlling");

        User u=new User();

        ModelAndView mv= new ModelAndView();
        mv.addObject("result",u);
        mv.setViewName("index");

        return mv;
    }
}
