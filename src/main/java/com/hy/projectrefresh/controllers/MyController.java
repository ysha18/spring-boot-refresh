package com.hy.projectrefresh.controllers;

import com.hy.projectrefresh.services.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MyController {

  private final MyService myService;

  @GetMapping("/test/display")
  public void displayStuff(){
    myService.display();
  }

}
