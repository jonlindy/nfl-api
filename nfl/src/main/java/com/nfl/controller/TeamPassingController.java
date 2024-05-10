package com.nfl.controller;

import com.nfl.dto.TeamPassingDto;
import com.nfl.service.TeamPassingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamPassingController {

    private TeamPassingService teamPassingService;

    @Autowired
    public TeamPassingController(TeamPassingService teamPassingService) {
        this.teamPassingService = teamPassingService;
    }
    // Post Team Passing Season
    @PostMapping("/passing")
    public ResponseEntity<TeamPassingDto> createTeamPassingSeason(@RequestBody TeamPassingDto teamPassingDto) {
        TeamPassingDto savedTeamPassing = teamPassingService.createTeamPassingSeason(teamPassingDto);
        return new ResponseEntity<>(savedTeamPassing, HttpStatus.CREATED);
    }

    // Get Team Passing Season by id (team_id + year)
    @GetMapping("/passing/{id}")
    public ResponseEntity<TeamPassingDto> getTeamPassingSeason(@PathVariable("id") Integer id) {
        TeamPassingDto teamPassingDto = teamPassingService.getTeamPassingById(id);
        return new ResponseEntity<>(teamPassingDto, HttpStatus.OK);
    }
    // Get all Team Passing Seasons for a certain team
    @GetMapping("/passing/all/{id}")
    public ResponseEntity<List<TeamPassingDto>> getAllTeamPassingSeasons(@PathVariable("id") Integer id) {
        List<TeamPassingDto> teamPassingList = teamPassingService.getAllTeamPassingSeasons(id);
        return new ResponseEntity<>(teamPassingList, HttpStatus.OK);
    }
    // Get Team Passing data for all seasons
    @GetMapping("/passing/all")
    public ResponseEntity<List<TeamPassingDto>> getAllPassingSeasons() {
        List<TeamPassingDto> teamPassingList = teamPassingService.getAllPassingSeasons();
        return new ResponseEntity<>(teamPassingList, HttpStatus.OK);
    }
}
