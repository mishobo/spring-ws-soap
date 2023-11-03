package com.husseinabdallah;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage();

        MimeHeaders mimeHeader = message.getMimeHeaders();
        mimeHeader.setHeader("SOAPAction", "http://tempuri.org/Add");

        SOAPBody body = message.getSOAPBody();
        SOAPHeader header = message.getSOAPHeader();

        QName bodyName = new QName("http://tempuri.org/", "Add", "tmp");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

        SOAPElement intA = bodyElement.addChildElement(new QName("http://tempuri.org/", "intA", "tmp"));
        intA.addTextNode("123");

        SOAPElement intB = bodyElement.addChildElement(new QName("http://tempuri.org/", "intB", "tmp"));
        intB.addTextNode("456");

        message.writeTo(System.out);
        System.out.println();

        // -----------------> Now changing the prefix before making the call
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        envelope.removeNamespaceDeclaration(envelope.getPrefix());

        String prefix = "soapenv";
        envelope.addNamespaceDeclaration(prefix, "http://schemas.xmlsoap.org/soap/envelope/");
        envelope.setPrefix(prefix);
        header.setPrefix(prefix);
        body.setPrefix(prefix);

        message.writeTo(System.out);
        System.out.println();

    }

}
