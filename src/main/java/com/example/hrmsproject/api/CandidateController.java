package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.CandidateService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Candidate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/candidtes")
public class CandidateController {

     private CandidateService candidateService ;

     public CandidateController ( CandidateService candidateService){
         this.candidateService = candidateService ;
     }


     @GetMapping("/getall")
    DataResult<List<Candidate>> getAll (){
         return this.candidateService.getAll();
    }

    @PostMapping ("/add")
    Result add ( @RequestBody Candidate  candidate){
         return this.candidateService.add(candidate);
    }











}
