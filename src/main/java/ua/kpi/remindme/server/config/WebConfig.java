package ua.kpi.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Evgeniy on 24.03.2018.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ua.kpi.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
