package com.databaseconnectedexample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    private StudentService SService;

    @RequestMapping(value = "/student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getStudent() {
        return ResponseEntity.ok(SService.getStudent());
    }
    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public   ResponseEntity<Optional<Student>> getOneStudent(@PathVariable int id) {
        return ResponseEntity.ok(SService.getOneStudent(id));
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    private void addStudent(@RequestBody Student student) {
        SService.addStudent(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    private void updateStudent(@RequestBody Student student) {
        SService.updateStudent(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    private void deleteStudent(@PathVariable int id) {
        SService.deleteStudent(id);
    }
}
