package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.EmployerService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")

public class EmployerController {

    private EmployerService employerService ;

    @Autowired
    public EmployerController ( EmployerService employerService ){
        this.employerService = employerService ;
    }

    @GetMapping("/getall")
    DataResult<List<Employer>> getAll (){
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    Result add ( @RequestBody Employer employer){
        return this.employerService.add(employer);
    }

    @GetMapping("/listemployers")
    List<Employer > listEmployers(){
        return this.employerService.listEmployers();
    }
}
