package org.mycompany.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by boris on 4/7/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.mycompany.hello"})
public class RootConfig
{
//    @Bean(name = "/helloworld")
//    public HelloController helloController()
//    {
//        return new HelloController();
//    }

}
