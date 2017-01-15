package zy.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by zy on 2017/1/14.
 */
@Configuration
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(systemWebSocketHandler(), "/websocket").setAllowedOrigins("*");
//        registry.addHandler(systemWebSocketHandler(), "/websocket/sockjs").setAllowedOrigins("*").withSockJS();
        //registry.addHandler(systemWebSocketHandler(),"/webSocketServer").addInterceptors(new WebSocketHandshakeInterceptor());
        //registry.addHandler(systemWebSocketHandler(), "/sockjs/webSocketServer").addInterceptors(new WebSocketHandshakeInterceptor()).withSockJS();
        //registry.addHandler(systemWebSocketHandler(), "/webSocketServer/sockjs").withSockJS();
		 /*registry.addHandler(systemWebSocketHandler(),"/ws").addInterceptors(new WebSocketHandshakeInterceptor());
	        registry.addHandler(systemWebSocketHandler(), "/ws/sockjs").addInterceptors(new WebSocketHandshakeInterceptor())
	                .withSockJS();*/
    }

    @Bean
    public WebSocketHandler systemWebSocketHandler() {
        return new SystemWebSocketHandler();
    }
}