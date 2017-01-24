package cn.upenny.config;

import cn.upenny.listener.EventListener;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 17/1/20.
 */
@Configuration
public class EventBusConfig {



    @Bean
    public EventBus eventBus(){
        EventBus eventBus = new EventBus();
        eventBus.register(new EventListener());
        return eventBus;
    }

}
