package com.src.school.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

  @RequestMapping("/jsp")
    public String test(ModelAndView modelAndView) {
        
        return "jsp-spring-boot";
  }
    
}