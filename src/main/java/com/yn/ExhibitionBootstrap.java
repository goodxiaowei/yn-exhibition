package com.yn;

//import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: xw
 * @Description:
 * @Date: 17:00 2018/9/8
 */
@ComponentScan("com.yn.module.*")
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
@MapperScan("com.yn.module.mapper")
//@EnableSwagger2Doc
@RestController
public class ExhibitionBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ExhibitionBootstrap.class).web(true).run(args);
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

}
