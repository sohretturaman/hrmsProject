package com.example.hrmsproject.api;

import com.example.hrmsproject.business.abstracts.UserService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/users")

public class UserController {

    private UserService userService ;

    @Autowired
    public UserController ( UserService userService){
        this.userService = userService ;
    }

    @GetMapping ("/getall")
    DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }

    @PostMapping("/add")
    Result add ( @RequestBody User user){
        return this.userService.add(user);
    }



}
