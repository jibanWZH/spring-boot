package com.dsy.controller;

import com.dsy.model.user;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeMarkerController {

  @RequestMapping("freemarker")
  public String freeMarker(Model model) {
    List<user> list = new ArrayList<>();
    list.add(new user(12,"章三",122));
    list.add(new user(14,"章sdsd",11));
    list.add(new user(15,"sdad",14));
    model.addAttribute("List",list);
    return  "userList";
  }
}
