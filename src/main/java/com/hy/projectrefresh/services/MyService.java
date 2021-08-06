package com.hy.projectrefresh.services;

import com.hy.projectrefresh.data.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MyService {

  private final MyRepository myRepository;
  private final Environment environment;

  public void display(){
    System.out.println(environment.getProperty("myprops.isDemoApp"));
  }

}


