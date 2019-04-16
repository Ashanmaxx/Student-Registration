package com.databaseconnectedexample.demo;

import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    List<Student> ss=new ArrayList<>(Arrays.asList(
//            new Student(1,"Anne",3),
//            new Student(1,"Shihan",3),
//            new Student(1,"Malen",3)
//            ));

    public List<Student> getStudent(){
        //return ss;
        List<Student> list = studentRepository.findAll();
        return  list;
    }
    public Optional<Student> getOneStudent(int id){
        //return  ss.stream().filter(t-> Objects.equals(t.getSid(), id)).findFirst().get();
        return studentRepository.findById(id);
    }
    public void addStudent(Student student){

        //ss.add(student);
       studentRepository.save(student);
    }

    public void updateStudent(Student student){
//        for(int i=0;i<ss.size();i++){
////            Student t=ss.get(i);
////            if(t.getSid()==id){
////                ss.set(i,student);
////            }
////        }
        studentRepository.save(student);

    }

    public void deleteStudent(int id){
        //ss.removeIf(t->t.getSid()==id);
        //studentRepository.delete(id);
        studentRepository.deleteById(id);
    }
}
