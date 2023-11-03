package com.husseinabdallah;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;

public class BritamNotification {
    public static void main(String[] args) throws SOAPException, IOException {
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
        headerElement.addNamespaceDeclaration("wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        headerElement.setMustUnderstand(true);

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
    }
}
