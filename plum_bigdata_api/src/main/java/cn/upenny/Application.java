package cn.upenny;

import cn.upenny.listener.EventListener;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Collections;
import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("cn.upenny")
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {


        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        EventListener.setApplicationContext(applicationContext);

    }



    @Override
    public  void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter =  new FastJsonHttpMessageConverter();
        converter.setFeatures(SerializerFeature. PrettyFormat );
        converters.add(converter);


        MappingJackson2HttpMessageConverter converter2 = new MappingJackson2HttpMessageConverter();
        converter2.setObjectMapper(new ObjectMapper());
        converter2.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));

        converters.add(converter2);

        super.configureMessageConverters(converters);
    }



}
