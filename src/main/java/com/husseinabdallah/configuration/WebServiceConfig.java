package com.husseinabdallah.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(messageDispatcherServlet, "/ws/*");
    }

    @Bean
    public XsdSchema studentsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("student.xsd"));
    }

    @Bean(name = "students")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema studentsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("StudentPort");
        definition.setTargetNamespace("http://husseinabdallah.com/students");
        definition.setLocationUri("/ws");
        definition.setSchema(studentsSchema);
        return definition;
    }

    @Bean
    public XsdSchema schema() {
        return new SimpleXsdSchema(new ClassPathResource("birthday.xsd"));
    }


    @Bean(name = "birthday")
    public DefaultWsdl11Definition defaultWsdl11Definition1(XsdSchema schema){
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setSchema(schema);
        definition.setLocationUri("/ws");
        definition.setPortTypeName("BirthdayServicePort");
        definition.setTargetNamespace("http://husseinabdallah.com/birthday");
        return definition;
    }


    @Bean(name = "country")
    public DefaultWsdl11Definition defaultWsdl11Definition2(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://husseinabdallah.com/country");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("country.xsd"));
    }

}