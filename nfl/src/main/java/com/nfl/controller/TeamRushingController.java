package com.nfl.controller;

import com.nfl.dto.TeamRushingDto;
import com.nfl.service.TeamRushingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamRushingController {

    private TeamRushingService teamRushingService;

    @Autowired
    public TeamRushingController(TeamRushingService teamRushingService) {
        this.teamRushingService = teamRushingService;
    }
    // Post Team Rushing Season
    @PostMapping("/rushing")
    public ResponseEntity<TeamRushingDto> createTeamRushingSeason(@RequestBody TeamRushingDto teamRushingDto) {
        TeamRushingDto savedTeamRushing = teamRushingService.createTeamRushingSeason(teamRushingDto);
        return new ResponseEntity<>(savedTeamRushing, HttpStatus.CREATED);
    }

    // Get Team Rushing Season by id
    @GetMapping("/rushing/{id}")
    public ResponseEntity<TeamRushingDto> getTeamRushingSeason(@PathVariable("id") Integer id) {
        TeamRushingDto teamRushingDto = teamRushingService.getTeamRushingById(id);
        return new ResponseEntity<>(teamRushingDto, HttpStatus.OK);
    }

    @GetMapping("/rushing/all/{id}")
    public ResponseEntity<List<TeamRushingDto>> getAllTeamRushingSeasons(@PathVariable("id") Integer id) {
        List<TeamRushingDto> teamRushingList = teamRushingService.getAllTeamRushingSeasons(id);
        return new ResponseEntity<>(teamRushingList, HttpStatus.OK);
    }

    @GetMapping("/rushing/all")
    public ResponseEntity<List<TeamRushingDto>> getAllRushingSeasons() {
        List<TeamRushingDto> teamRushingList = teamRushingService.getAllRushingSeasons();
        return new ResponseEntity<>(teamRushingList, HttpStatus.OK);
    }
}
