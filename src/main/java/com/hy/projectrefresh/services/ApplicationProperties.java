package com.hy.projectrefresh.services;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

  private Boolean isDemoApp;

  public Boolean getDemoApp() {
    return isDemoApp;
  }

  public void setDemoApp(Boolean demoApp) {
    isDemoApp = demoApp;
  }
}
