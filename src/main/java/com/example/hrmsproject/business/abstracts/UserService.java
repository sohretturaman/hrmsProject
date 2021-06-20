package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.User;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    Result add (User user) ;

}
