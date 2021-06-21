package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.JobAdvertisementService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.JobAdvertisement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job_advertisements")
public class JobAdvertisementsController {

    private JobAdvertisementService jobAdvertisementService ;

    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }


  @GetMapping("/getByEmployerId ")
    public DataResult<List<JobAdvertisement>> getByEmployerId ( @RequestParam int employerId){ // get mapping de eğer parameetre varsa request param ver
        return this.jobAdvertisementService.getByEmployerId(employerId) ;
    }
 @GetMapping("/getAllByCreatedAtAndActive")
    public DataResult<List<JobAdvertisement> > getAllByCreatedAtAndActive(){ // asc kullandığın methodun controller i kontrol et
        return this.jobAdvertisementService.getAllByCreatedAtAndActive();
    }

    @GetMapping("/findAllById")
     public DataResult<List<JobAdvertisement> > findAllById(@RequestParam int id){
        return this.jobAdvertisementService.findAllById(id);
    }

    @PostMapping("/add")
    Result add (@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }
}
