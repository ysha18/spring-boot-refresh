package com.hy.projectrefresh.customevents;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent> {

  private Logger log =  LoggerFactory.getLogger(this.getClass().getCanonicalName());

  @Override
  public void onApplicationEvent(CustomEvent event) {
    log.info("Listener activated");
    System.out.println(event.getMessage());
  }
}
