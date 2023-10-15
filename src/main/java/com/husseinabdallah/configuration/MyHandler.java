package com.husseinabdallah.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.Set;

@Configuration
public class MyHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyHandler.class);

    private String username;

    private String password;
    @Override
    public Set<QName> getHeaders() {
        LOGGER.debug("getHeaders has been invoked.");
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try {
            SOAPMessage message = context.getMessage();
            System.out.println(message);
            SOAPHeader header = message.getSOAPHeader();
            SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
            if (header == null) {
                header = envelope.addHeader();
            }
            QName qNameUserCredentials = new QName("http://husseinabdallah.com/students", "UserCredentials");
            SOAPHeaderElement userCredentials = header.addHeaderElement(qNameUserCredentials);

            QName qNameUsername = new QName("http://husseinabdallah.com/students", "Username");
            SOAPHeaderElement username = header.addHeaderElement(qNameUsername );
            username.addTextNode(this.username);

            userCredentials.addChildElement(username);
            userCredentials.addChildElement(password);

            message.saveChanges();
            //TODO: remove this writer when the testing is finished
            StringWriter writer = new StringWriter();
            message.writeTo(new StringOutputStream(writer));
            LOGGER.debug("SOAP message: \n" + writer.toString());

        } catch (SOAPException e) {
            LOGGER.error("Error occurred while adding credentials to SOAP header.", e);
        } catch (IOException e){
            LOGGER.error("Error occurred while writing message to output stream.", e);
        }

        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext soapMessageContext) {
        LOGGER.debug("handleFault has been invoked.");
        return true;
    }

    @Override
    public void close(MessageContext messageContext) {
        LOGGER.debug("close has been invoked.");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //TODO: remove this class after testing is finished
    private static class StringOutputStream extends OutputStream {

        private StringWriter writer;

        public StringOutputStream(StringWriter writer) {
            this.writer = writer;
        }

        @Override
        public void write(int b) throws IOException {
            writer.write(b);
        }
    }
}


