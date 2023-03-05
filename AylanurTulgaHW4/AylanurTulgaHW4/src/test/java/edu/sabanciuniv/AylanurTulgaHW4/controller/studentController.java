package edu.sabanciuniv.AylanurTulgaHW4.controller;

import edu.sabanciuniv.AylanurTulgaHW4.model.Student;
import edu.sabanciuniv.AylanurTulgaHW4.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class studentController {
    @Autowired
    private studentService StudentService;

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){

        return studentService.addNewStudent(student);

    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students")
    public Optional<Student> getSpecificId(){
        return studentService.getSpecificId();
    }

    @PutMapping("/students")
    public Student updateStudentList(@RequestBody Student student){
        return studentService.updateExistingStudentList(student);
    }

    @DeleteMapping("/students")
    public void deleteGivenStudent(@RequestBody Student student){
        studentService.deleteGivenStudent(student);
    }


}
