package com.aaditya.MVC.controller;

import com.aaditya.MVC.model.Rggp;
import com.aaditya.MVC.service.RggpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    RggpService rggp;

    @GetMapping("/")
    public String home(){
        return "Hello";
    }

    @GetMapping("/students")
    public List<Rggp> getStudents(){
        return  rggp.getProducts();
    }

    @GetMapping("/student/{roll}")
    public Rggp getStudent(@PathVariable int roll){
        return rggp.getStudent(roll);
    }

    @PostMapping("/student")
    public Rggp addStudent(@RequestBody Rggp newRggp){
        return rggp.addStudent(newRggp);
    }

    @PutMapping("/student")
    public Rggp updateStudent(@RequestBody Rggp newRggp){
        return rggp.updateStudent(newRggp);
    }

    @DeleteMapping("/student/{roll}")
    public void deleteStudent(@PathVariable int roll){
        rggp.deleteStudent(roll);
    }
}
