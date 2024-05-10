package com.nfl.service;

import com.nfl.dto.TeamRushingDto;

import java.util.List;

public interface TeamRushingService {
    TeamRushingDto createTeamRushingSeason(TeamRushingDto teamRushingDto);

    TeamRushingDto getTeamRushingById(int id);

    List<TeamRushingDto> getAllTeamRushingSeasons(int id);

    List<TeamRushingDto> getAllRushingSeasons();
}
