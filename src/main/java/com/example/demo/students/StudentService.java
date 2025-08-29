package com.example.demo.students;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentMapper studentMapper;
    private final StudentRepo studentRepo;

    public StudentService(StudentMapper studentMapper, StudentRepo studentRepo) {
        this.studentMapper = studentMapper;
        this.studentRepo = studentRepo;
    }
    public List<StudentReco> getAllStudents(){
        return studentRepo.findAll().stream().map(studentMapper::toStudentGet).collect(Collectors.toList());
    }
    public StudentReco getStudentByID(int id){
        return studentRepo.findById(id).stream().map(studentMapper::toStudentGet).findAny().orElse(null);
    }
    public StudentReco addStudent(StudentRecord studentRecord){
        Student student = studentMapper.toStudent(studentRecord);
        Student saveStudent = studentRepo.save(student);
        return studentMapper.toStudentGet(saveStudent);
    }
    public void deleteStudentByID(int id){
        studentRepo.deleteById(id);
    }
}
