package com.note.developers.controllers;


import com.note.developers.models.dtos.UserInfoDTO;
import com.note.developers.repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    private UserInfoRepository userRepo;

    @Autowired
    public UserController(UserInfoRepository repo){
        this.userRepo = repo;
    }
    @GetMapping(path = "all")
    public Iterable<UserInfoDTO> getAll(){
        Iterable<UserInfoDTO> users = this.userRepo.findAll();
        return users;
    }


}
