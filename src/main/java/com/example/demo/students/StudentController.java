package com.example.demo.students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/getAllStudents")
    public List<StudentReco> getAllStudents(){
       return studentService.getAllStudents();
    }
    @GetMapping("/getStudentByID/{id}")
    public StudentReco getStudentByID(@PathVariable("id") int id){
        return studentService.getStudentByID(id);
    }
    @PostMapping("/addStudent")
    public StudentReco addStudent(@RequestBody StudentRecord studentRecord){
        return studentService.addStudent(studentRecord);
    }
    @DeleteMapping("/deleteStudentByID/{id}")
    public void deleteStudentByID(@PathVariable("id") int id){
        studentService.deleteStudentByID(id);
    }
}
