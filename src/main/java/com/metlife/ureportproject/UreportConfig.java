package com.metlife.ureportproject;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

/**
 * @description:
 * @version: 1.0
 * @author: kui.fang@hand-china.com
 * @date: 2020/1/14 12:00
 */
@ImportResource("classpath:context.xml")
@EnableAutoConfiguration
@Configuration
public class UreportConfig {

    @Bean
    public ServletRegistrationBean<Servlet> buildUreportServlet() {
        return new ServletRegistrationBean<Servlet>(new UReportServlet(),
                "/ureport/*");
    }
}
