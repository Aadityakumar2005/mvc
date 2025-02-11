package com.aaditya.MVC.service;

import com.aaditya.MVC.model.Rggp;
import com.aaditya.MVC.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RggpService {
    @Autowired
    Repo repo;


    public List<Rggp> getProducts() {
        return repo.findAll();
    }

    public Rggp getStudent(int roll) {
        return repo.findById(roll).orElse(new Rggp());
    }

    public Rggp addStudent(Rggp newRggp) {
        return repo.save(newRggp);
    }

    public Rggp updateStudent(Rggp newRggp) {
        return repo.save(newRggp);
    }

    public void deleteStudent(int roll) {
        repo.deleteById(roll);
    }
}
