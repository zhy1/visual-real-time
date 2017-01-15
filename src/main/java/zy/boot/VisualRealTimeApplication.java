package zy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * Created by zy on 2017/1/14.
 */
@EnableWebSocket
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan(basePackages = {"zy"})
public class VisualRealTimeApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(VisualRealTimeApplication.class, args);
    }
}
