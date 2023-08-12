package com.husseinabdallah.endpoint;


import com.husseinabdallah.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.husseinabdallah.birthday.GetAgeResponse;
import com.husseinabdallah.birthday.GetBirthdayRequest;

@Endpoint
public class BirthdayEndpoint {

    private static final String NAMESPACE = "http://husseinabdallah.com/birthday";

    @Autowired
    private BirthdayService service;

    @PayloadRoot(localPart = "getBirthdayRequest", namespace = NAMESPACE)
    @ResponsePayload
    public GetAgeResponse getBirthdayRequest(@RequestPayload GetBirthdayRequest request) {
        System.out.println("request payload " + request);
        return service.age(request);
    }

}
