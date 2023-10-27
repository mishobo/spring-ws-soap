package com.husseinabdallah.endpoint;

import com.husseinabdallah.britam.*;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Endpoint
public class BritamSmsEndpoint {

    @PayloadRoot(namespace = "http://husseinabdallah.com/britam", localPart = "SendBritamSmsRequest")
    @ResponsePayload
    public PushNotifications britamSMS(@RequestPayload SendBritamSmsRequest request, MessageContext messageContext) throws JAXBException {
        System.out.println("payload request :" + request.getPhoneNo());
        System.out.println("payload request :" + request.getText());

        Arg0 args = new Arg0();
        args.setNotificationType("SMS");
        args.setLOBSrc(100);
        args.setCompanyCode(8);
        args.setCountryCode("KE");
        args.setContent(request.getText());
        args.setDestination(request.getPhoneNo());
        args.setIsProcessed(0);
        args.setCreationDate("2021-09-25T00:15:00.142Z");
        args.setNotificationCode("odsStaging");
        args.setPriority(1);

        PushNotifications notifications = new PushNotifications();
        notifications.setArg0(args);

        //Create Response Body and Header
        SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
        SoapHeader soapResponseHeader = soapResponse.getSoapHeader();

        UsernameToken token = new UsernameToken();
        token.setUsername("portal");
        token.setPassword("portal@2017");
        token.setNonce("8t1PVAvItMU8+WWRTzIOgw==");
        token.setCreated("2021-09-24T21:03:56.385Z");

        Security security = new Security();
        security.setUsernameToken(token);

        Header header = new Header();
        header.setSecurity(security);

        //Send Response back (Classes marshalled)
        JAXBContext jaxbContext = JAXBContext.newInstance(Header.class);
        jaxbContext.createMarshaller().marshal(header, soapResponseHeader.getResult());

        return notifications;
    }

}
