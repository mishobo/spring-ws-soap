package com.husseinabdallah.endpoint;

import com.husseinabdallah.configuration.MyHandler;
import com.husseinabdallah.students.*;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.*;



@Endpoint
@RequiredArgsConstructor
public class StudentDetailsEndpoint {

    private final MyHandler handler;

    @PayloadRoot(namespace = "http://husseinabdallah.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request, MessageContext messageContext) throws JAXBException {
        System.out.println("payload request :" + request.getId());

        //Create Response Body and Header
        SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
        SoapHeader soapResponseHeader = soapResponse.getSoapHeader();

//        New UsernameHeader Object
        UsernameHeader usernameToken = new UsernameHeader();
        usernameToken.setUsername("SandyAPI");
        usernameToken.setPassword("Test_Password");

        //Create SecurityHeader Object that will contain the UsernameHeader Object
        SecurityHeader securityHeader = new SecurityHeader();
        securityHeader.setUsernameHeader(usernameToken);

        GetStudentDetailsResponse response = new GetStudentDetailsResponse();
        ArrayList<StudentDetails> students = new ArrayList<StudentDetails>();
        StudentDetails student = new StudentDetails();
        student.setId(1);
        student.setName("Adam");
        student.setPassportNumber("E1234567");

        StudentDetails student1 = new StudentDetails();
        student1.setId(2);
        student1.setName("Mishobo");
        student1.setPassportNumber("onfj5kkkdd");

        StudentDetails student2 = new StudentDetails();
        student2.setId(3);
        student2.setName("Abdallah");
        student2.setPassportNumber("9999222");

        students.add(student);
        students.add(student1);
        students.add(student2);

        response.setStudentDetails(students);

        //Send Response back (Classes marshalled)
        JAXBContext jaxbContext = JAXBContext.newInstance(SecurityHeader.class);
        jaxbContext.createMarshaller().marshal(securityHeader, soapResponseHeader.getResult());
        return response;
    }



}
