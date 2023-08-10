package com.in28minutes.springboot.soap.web.services.example.endpoint;

import com.in28minutes.springboot.soap.web.services.example.service.BirthdayService;
import com.in28minutes.students.GetAgeResponse;
import com.in28minutes.students.GetBirthdayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BirthdayEndpoint {

    private static final String NAMESPACE = "http://www.webservicesoap.org/birthday";

    @Autowired
    private BirthdayService service;

    @PayloadRoot(localPart = "getBirthdayRequest", namespace = NAMESPACE)
    @ResponsePayload
    public GetAgeResponse getBirthdayRequest(@RequestPayload GetBirthdayRequest request) {
        System.out.println("request payload " + request);
        return service.age(request);
    }


}
