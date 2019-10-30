package com.fullstack.controller;

import com.fullstack.model.*;
import com.fullstack.service.TrainingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class ApplicationController {


    @Autowired
    private TrainingsService trainingsService;

    /**
     * Trainings
     * @param request
     * @return
     */
    @RequestMapping("/currentMentorTrainings")
    public List<TrainingsDTO> currentTrainings(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        List<TrainingsDTO> list = trainingsService.getMentorCurrentTraining(Long.valueOf(userId));
        return list;
    }

    @RequestMapping("/completedMentorTrainings")
    public List<TrainingsDTO> completedTrainings(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        List<TrainingsDTO> list = trainingsService.getMentorCompletedTraining(Long.valueOf(userId));
        return list;
    }



}
