package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.JobTitleService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/job_titles")

public class JobTitleController {
    private JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService){
        this.jobTitleService = jobTitleService;
    }

    @GetMapping("/getall")
    DataResult<List<JobTitle>> getAll(){
        return this.jobTitleService.getAll();
    }


   @PostMapping("/add")
    Result add( @RequestBody JobTitle jobTitle){
        return this.jobTitleService.add(jobTitle);
    }

    @GetMapping("/listjobpositions")
    List<JobTitle> listJobPositions (){
        return this.jobTitleService.listJobPositions();
    }
}
