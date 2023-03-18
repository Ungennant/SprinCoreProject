package org.serf.project.lesson18.controller;

import org.serf.project.lesson18.model.Participant;
import org.serf.project.lesson18.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParticipantController {


    private final ParticipantService participantService;

    @Autowired
    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @GetMapping("/")
    public String init(HttpServletRequest req) {
        req.setAttribute("participants", participantService.findAll());
        req.setAttribute("mode", "PARTICIPANT_VIEW");
        return "index";
    }

    @GetMapping("/new")
    public String newParticipant(HttpServletRequest req) {
        req.setAttribute("mode", "PARTICIPANT_CREATE");
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Participant participant, HttpServletRequest req) {
        participantService.create(participant);
        req.setAttribute("participants", participantService.findAll());
        req.setAttribute("mode", "PARTICIPANT_VIEW");
        return "index";
    }

    @GetMapping("/delete")
    public String deleteParticipant(@RequestParam int id, HttpServletRequest req) {
        participantService.deleteById(id);
        req.setAttribute("participants", participantService.findAll());
        req.setAttribute("mode", "PARTICIPANT_VIEW");
        return "index";
    }
}
