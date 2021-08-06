package com.hy.projectrefresh;

import com.hy.projectrefresh.services.ApplicationProperties;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class ProjectRefreshApplication {

	private final Environment env;

	public ProjectRefreshApplication(Environment env) {
		this.env = env;
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication((ProjectRefreshApplication.class));
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}
