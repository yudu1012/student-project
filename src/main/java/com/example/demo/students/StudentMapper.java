package com.example.demo.students;

import com.example.demo.schools.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {

    public Student toStudent(StudentRecord studentRecord){
      Student student = new Student();
      student.setFirst_name(studentRecord.first_name());
      student.setLast_name(studentRecord.last_name());
      student.setMiddle_name(studentRecord.middle_name());
      student.setBirth_date(studentRecord.birth_date());
      student.setGender(studentRecord.gender());
        School school = new School();
        school.setId(studentRecord.school_id());
        student.setSchool(school);
        return student;
    }
    public StudentReco toStudentGet(Student student){
        return new StudentReco(student.getFirst_name(),student.getLast_name(),student.getMiddle_name(),student.getBirth_date(),student.getGender());
    }
}
