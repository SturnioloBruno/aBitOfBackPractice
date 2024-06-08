package dev.br1botcompany.content_calendar;

import dev.br1botcompany.content_calendar.config.ContentCalendarProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
