package com.husseinabdallah.endpoint;

import com.husseinabdallah.students.GetStudentDetailsRequest;
import com.husseinabdallah.students.GetStudentDetailsResponse;
import com.husseinabdallah.students.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;

@Endpoint
public class StudentDetailsEndpoint {

    @PayloadRoot(namespace = "http://husseinabdallah.com/students", localPart = "GetStudentDetailsRequest")
    @ResponsePayload
    public GetStudentDetailsResponse processCourseDetailsRequest(@RequestPayload GetStudentDetailsRequest request) {
        System.out.println("payload request :" + request);

        GetStudentDetailsResponse response = new GetStudentDetailsResponse();

        StudentDetails student1 = new StudentDetails();
        student1.setId(1);
        student1.setName("Adam");
        student1.setPassportNumber("E1234567");

        StudentDetails student2 = new StudentDetails();
        student2.setId(2);
        student2.setName("Abdallah");
        student2.setPassportNumber("987654321");

        StudentDetails student3 = new StudentDetails();
        student3.setId(3);
        student3.setName("Hussein");
        student3.setPassportNumber("121211");

        ArrayList<StudentDetails> students = new ArrayList<StudentDetails>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        response.setStudentDetails(students);
        return response;
    }



}
