package com.hy.projectrefresh.customevents;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

  private String message;

  public CustomEvent(Object source) {
    super(source);
  }

  public CustomEvent(Object source, String message) {
    super(source);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
