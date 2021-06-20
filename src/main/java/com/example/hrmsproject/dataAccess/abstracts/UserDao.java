package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
