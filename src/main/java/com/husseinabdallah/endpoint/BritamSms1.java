package com.husseinabdallah.endpoint;


import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ClientHttpRequest;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("britam")
public class BritamSms1 {


    @RequestMapping(value = "/notification", method = RequestMethod.GET, produces = { "text/xml" })
    public String soapMessage() throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage();

        MimeHeaders mimeHeader = message.getMimeHeaders();
        mimeHeader.setHeader("SOAPAction", "http://tempuri.org/Add");

        SOAPBody body = message.getSOAPBody();
        SOAPHeader header = message.getSOAPHeader();

        QName security = new QName(
                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
                "Security",
                "wsse");

        SOAPHeaderElement headerElement = header.addHeaderElement(security);
        headerElement.addAttribute(QName.valueOf("soapenv:mustUnderstand"), "1");
        headerElement.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");


        SOAPElement usernameToken = headerElement.addChildElement( "UsernameToken" , "wsse");
        usernameToken.addAttribute(QName.valueOf("wsu:Id"),"UsernameToken-572A4869F6F8181D9916325174364021");

        SOAPElement username = usernameToken.addChildElement("Username", "wsse");
        username.addTextNode("portal");

        SOAPElement password = usernameToken.addChildElement("Password", "wsse");
        password.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        password.addTextNode("portal@2017");

        SOAPElement nonce = usernameToken.addChildElement("Nonce", "wsse");
        nonce.addAttribute(QName.valueOf("EncodingType"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
        nonce.addTextNode("8t1PVAvItMU8+WWRTzIOgw==");

        SOAPElement created = usernameToken.addChildElement("Created", "wsu");
        created.addTextNode("2021-09-24T21:03:56.385Z");

        QName bodyName = new QName("", "pushNotifications", "ws");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

        SOAPElement arg0 = bodyElement.addChildElement(new QName("", "arg0", ""));

        SOAPElement notificationType = arg0.addChildElement(new QName("notificationType"));
        notificationType.addTextNode("SMS");


        SOAPElement lOBSrc = arg0.addChildElement(new QName("lOBSrc"));
        lOBSrc.addTextNode("100");

        SOAPElement companyCode = arg0.addChildElement(new QName("companyCode"));
        companyCode.addTextNode("8");

        SOAPElement countryCode = arg0.addChildElement(new QName("countryCode"));
        countryCode.addTextNode("KE");

        SOAPElement content = arg0.addChildElement(new QName("content"));
        content.addTextNode("preAuth");

        SOAPElement destination = arg0.addChildElement(new QName("destination"));
        destination.addTextNode("+254703933944");

        SOAPElement isProcessed = arg0.addChildElement(new QName("isProcessed"));
        isProcessed.addTextNode("0");

        SOAPElement creationDate = arg0.addChildElement(new QName("creationDate"));
        creationDate.addTextNode("2021-09-25T00:15:00.142Z");

        SOAPElement processingStatus = arg0.addChildElement(new QName("processingStatus"));
        processingStatus.addTextNode("0");

        SOAPElement processingDate = arg0.addChildElement(new QName("processingDate"));
        processingDate.addTextNode("2021-09-25T00:15:00.142Z");

        SOAPElement notificationCode = arg0.addChildElement(new QName("notificationCode"));
        notificationCode.addTextNode("odsStaging");

        SOAPElement priority = arg0.addChildElement(new QName("priority"));
        priority.addTextNode("1");


        // -----------------> Now changing the prefix before making the call
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        envelope.removeNamespaceDeclaration(envelope.getPrefix());

        String prefix = "soapenv";
        envelope.addNamespaceDeclaration(prefix, "http://schemas.xmlsoap.org/soap/envelope/");
        envelope.addNamespaceDeclaration("ws", "http://ws.britam/");
        envelope.setPrefix(prefix);
        header.setPrefix(prefix);
        body.setPrefix(prefix);


        message.writeTo(System.out);
        System.out.println();

        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        message.writeTo(outstream);
        String strMsg = new String(outstream.toByteArray());

        return strMsg;
    }


    @RequestMapping(value = "/soap-message", method = RequestMethod.GET, produces = {"text/xml"})
    public String createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("acme", "http://samples.saaj.jms");

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("employee", "acme");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("id", "acme");
        soapBodyElem1.addTextNode("10");

        soapMessage.saveChanges();

        System.out.println("Request SOAP Message = ");
        soapMessage.writeTo(System.out);
        System.out.println();


        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        soapMessage.writeTo(outstream);
        String strMsg = new String(outstream.toByteArray());

        return strMsg;

    }



}
