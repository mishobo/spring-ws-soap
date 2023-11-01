package com.husseinabdallah.endpoint;

import com.husseinabdallah.britam.*;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.swing.text.html.HTMLDocument;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.soap.*;
import java.util.Iterator;

@Endpoint
public class BritamSmsEndpoint {

    @PayloadRoot(namespace = "http://husseinabdallah.com/britam", localPart = "SendBritamSmsRequest")
    @ResponsePayload
    public PushNotifications britamSMS(@RequestPayload SendBritamSmsRequest request, MessageContext messageContext) throws JAXBException, SOAPException {
//        System.out.println("payload request :" + request.setPhoneNo("+254703933944"));
//        System.out.println("payload request :" + request.setText("preAuth"));

        Arg0 args = new Arg0();
        args.setNotificationType("SMS");
        args.setLOBSrc(100);
        args.setCompanyCode(8);
        args.setCountryCode("KE");
        args.setContent("preAuth");
        args.setDestination("+254703933944");
        args.setIsProcessed(0);
        args.setCreationDate("2021-09-25T00:15:00.142Z");
        args.setNotificationCode("odsStaging");
        args.setPriority(1);

        PushNotifications notifications = new PushNotifications();
        notifications.setArg0(args);

        //Create Response Body and Header
        SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
        SoapHeader soapResponseHeader = soapResponse.getSoapHeader();

//        SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
        SOAPMessage soapMessage = soapResponse.getSaajMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();
        SOAPHeader header = soapMessage.getSOAPHeader();
        SOAPBody body = soapMessage.getSOAPBody();
        SOAPFault fault = body.getFault();

        envelope.removeNamespaceDeclaration(envelope.getPrefix());
        envelope.addNamespaceDeclaration("soapenv", "http://schemas.xmlsoap.org/soap/envelope/");
        envelope.addNamespaceDeclaration("ws", "http://ws.britam/");
        envelope.setPrefix("soapenv");
        header.setPrefix("soapenv");
        body.setPrefix("soapenv");



        if (fault != null) {
            fault.setPrefix("soapenv");
        }

        UsernameToken token = new UsernameToken();
        token.setUsername("portal");
        token.setPassword("portal@2017");
        token.setNonce("8t1PVAvItMU8+WWRTzIOgw==");
        token.setCreated("2021-09-24T21:03:56.385Z");

        Security security = new Security();
        security.setUsernameToken(token);

        //Send Response back (Classes marshalled)
        JAXBContext jaxbContext = JAXBContext.newInstance(Security.class);
        jaxbContext.createMarshaller().marshal(security, soapResponseHeader.getResult());

        return notifications;
    }

}
