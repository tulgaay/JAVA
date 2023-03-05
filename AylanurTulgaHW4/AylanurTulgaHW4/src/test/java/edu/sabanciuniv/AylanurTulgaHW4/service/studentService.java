package edu.sabanciuniv.AylanurTulgaHW4.service;

import edu.sabanciuniv.AylanurTulgaHW4.model.Student;
import edu.sabanciuniv.AylanurTulgaHW4.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {
    @Autowired
    private studentRepository StudentRepository;

    public static Student addNewStudent(Student student){
        if (student.getName().length() > 100){
            throw new IllegalArgumentException("The student name can not be longer than 100 characters");
        }
        return studentRepository.save(student);
    }

    public static List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    public static Optional<Student> getSpecificId(){
        return studentRepository.findById(getSpecificId().getId());
    }

    public static Student updateExistingStudentList(Student student) {

        return studentRepository.save(student);
    }


    public static Student deleteGivenStudent(Student student) {

        studentRepository.delete(student);
    }
}
