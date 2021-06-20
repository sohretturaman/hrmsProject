package com.example.hrmsproject.business.concretes;


import com.example.hrmsproject.business.abstracts.UserService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.core.utilities.results.SuccessDataResult;
import com.example.hrmsproject.core.utilities.results.SuccessResult;
import com.example.hrmsproject.dataAccess.abstracts.UserDao;
import com.example.hrmsproject.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
  // bu projeye delete fonksiyonu ekle ve sahte simülasyonlarla birliklte if komutlarında errordataresult ve errorResult kullan
@Service
public class UserManager implements UserService {
  private UserDao userDao ;

  @Autowired
  public UserManager ( UserDao userDao){
      this.userDao = userDao ;
  }


    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult< List<User>>(this.userDao.findAll());
    }

    @Override
    public Result add(User user) {
        this.userDao.save( user) ;
        return new SuccessResult("bu kullanıcı eklendi");
    }
}
