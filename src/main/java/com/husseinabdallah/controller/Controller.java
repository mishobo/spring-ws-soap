package com.husseinabdallah.controller;

import com.husseinabdallah.students.StudentDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @RequestMapping(value = "/students", method = RequestMethod.GET )
    public List<StudentDetails> students() {
        StudentDetails student = new StudentDetails();
        student.setId(1);
        student.setName("Adam");
        student.setPassportNumber("E1234567");


        StudentDetails student1 = new StudentDetails();
        student1.setId(2);
        student1.setName("Abdallah");
        student1.setPassportNumber("31875595");

        StudentDetails student2 = new StudentDetails();
        student2.setId(3);
        student2.setName("Mishobo");
        student2.setPassportNumber("231100");

        ArrayList<StudentDetails> students = new ArrayList<StudentDetails>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        return students;
    }

}
