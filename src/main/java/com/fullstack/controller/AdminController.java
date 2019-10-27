package com.fullstack.controller;

import com.fullstack.model.TechnologiesDTO;
import com.fullstack.model.UsersDTO;
import com.fullstack.service.TechnologiesService;
import com.fullstack.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class AdminController {

    @Autowired
    private TechnologiesService technologiesService;

    @Autowired
    private UsersService usersService;

    @RequestMapping("/listUsers")
    public List listUsers() {
        List<UsersDTO> list = new ArrayList<UsersDTO>();
        list = usersService.findAll();
        return list;
    }

    @RequestMapping("/changeStatus")
    public void changeStatus() {
        //user id,  status
        UsersDTO usersDTO = new UsersDTO();
        usersService.editUser(usersDTO);
    }

    @RequestMapping("/listTechnologies")
    public List<TechnologiesDTO> findAllTechnologies() {
        List<TechnologiesDTO> list = technologiesService.getAllTechnologies();
        return list;
    }

    @RequestMapping("/addTechnology")
    public void addTechnology() {
        TechnologiesDTO technologiesDTO = new TechnologiesDTO();
        technologiesDTO.setTechnologyName("HTML5");
        technologiesDTO.setFee("100");
        technologiesDTO.setTotalHours("12");
        technologiesService.addTechnologies(technologiesDTO);
    }

    @RequestMapping("/editTechnology")
    public void editTechnology() {
        TechnologiesDTO technologiesDTO = new TechnologiesDTO();
        technologiesDTO.setId(1l);
        technologiesDTO.setTechnologyName("ES6");
        technologiesDTO.setFee("100");
        technologiesDTO.setTotalHours("12");
        technologiesService.editTechnologies(technologiesDTO);
    }

    @RequestMapping("/deleteTechnology")
    public void deleteTechnology() {
        long technologyId = 1l;
        technologiesService.deleteTechnology(technologyId);
    }
}
