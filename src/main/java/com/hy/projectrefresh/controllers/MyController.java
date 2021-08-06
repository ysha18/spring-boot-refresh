package com.hy.projectrefresh.controllers;

import com.hy.projectrefresh.customevents.CustomEventPublisher;
import com.hy.projectrefresh.services.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MyController {

  private final MyService myService;
  private final CustomEventPublisher eventPublisher;

  @GetMapping("/displayExtProperty")
  public void displayStuff() {
    myService.displayExtProperty();
  }

  @GetMapping("/demonstrateCustomEvents")
  public void publishEvent() {
    eventPublisher.publishEvent("Testing custom events");
  }

}
