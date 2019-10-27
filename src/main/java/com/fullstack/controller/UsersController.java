package com.fullstack.controller;

import com.fullstack.model.TrainingsDTO;
import com.fullstack.model.UsersDTO;
import com.fullstack.service.TrainingsService;
import com.fullstack.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private TrainingsService trainingsService;


}
