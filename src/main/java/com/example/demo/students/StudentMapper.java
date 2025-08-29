package com.example.demo.students;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student toStudent(StudentRecord studentRecord){
      Student student = new Student();
      student.setFirst_name(studentRecord.first_name());
      student.setLast_name(studentRecord.last_name());
      student.setFirst_name(studentRecord.first_name());
      student.setFirst_name(studentRecord.first_name());

    }
}
