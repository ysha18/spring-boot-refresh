package com.hy.projectrefresh.customevents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

  @Autowired
  private ApplicationEventPublisher publisher;

  public void publishEvent(final String message){
    CustomEvent event = new CustomEvent(this, message);
    publisher.publishEvent(event);
  }
}
