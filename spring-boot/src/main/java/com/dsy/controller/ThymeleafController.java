package com.dsy.controller;

import com.dsy.model.user;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
  @RequestMapping("/show")
  public String show(Model model) {

    model.addAttribute("msg","第一个Thymeleaf");
   return "index";
  }
  @RequestMapping("/show2")
  public String show2(Model model) {
    List<user> list = new ArrayList<>();
    list.add(new user(12,"章三",122));
    list.add(new user(14,"章sdsd",11));
    list.add(new user(15,"sdad",14));
    model.addAttribute("List",list);
    return "index2";
  }
  @RequestMapping("/show3")
  public String show3(Model model) {
    Map<String,user> map = new HashMap<>();
    map.put("u1",new user(12,"章三",122));
    map.put("u2",new user(14,"章sdsd",11));
    map.put("u3",new user(15,"sdad",14));
    model.addAttribute("map",map);
    return "index3";
  }

}
