package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.EmployeeService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("api/employees")

public class EmployeeController {

    private EmployeeService employeeService ;

    @Autowired
    public EmployeeController ( EmployeeService employeeService){
        this.employeeService = employeeService ;
    }

    // bu katmana service interfacesindeki metodları kopyalayıp çalıştırabilirsin zatean işimiz gören ve com.example.hrmsproject.business in conceretes paketinde tüm iş kodalrının yazıldığı yer orası

    @GetMapping("/getall")
    DataResult<List<Employee>> getAll (){
        return this.employeeService.getAll();
    }


    @PostMapping("/add")
    Result add (@RequestBody Employee employee){
        return this.employeeService.add(employee);
    }


    @GetMapping("/listEmployees")
    List<Employee> lİstEmployees (){
      return   this.employeeService.lİstEmployees();
    }
}
