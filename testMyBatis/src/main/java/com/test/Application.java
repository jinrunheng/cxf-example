package com.test;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.test.controller.TestCxfController;
import com.test.filter.CustomCorsFilter;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.feature.Feature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.rs.security.cors.CrossOriginResourceSharingFilter;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author Dooby Kim
 * @Date 2024/1/19 9:33 下午
 * @Version 1.0
 */
// @MapperScan("com.test.mapper")
@SpringBootApplication
@ImportResource(locations = { "classpath:spring.xml" })
public class Application implements CommandLineRunner {



    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus bus() {
        SpringBus bus = new SpringBus();
        return bus;
    }

    @Bean
    public Server server() {
        JAXRSServerFactoryBean bean = new JAXRSServerFactoryBean();
        bean.setBus(bus());
        bean.setAddress("/");
        bean.setServiceBeans(Collections.singletonList(new TestCxfController()));//如果有多个服务，这里可以接收List
//        CrossOriginResourceSharingFilter filter = new CrossOriginResourceSharingFilter();
//        filter.setAllowCredentials(true);
//        filter.setAllowOrigins(Arrays.asList("*"));
//        CustomCorsFilter customCorsFilter = new CustomCorsFilter();
//        customCorsFilter.setAllowOrigins(Arrays.asList("*"));
//        customCorsFilter.setAllowCredentials(true);
//        customCorsFilter.setAllowHeaders(Arrays.asList("*"));
        return bean.create();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
