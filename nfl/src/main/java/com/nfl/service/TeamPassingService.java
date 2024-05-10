package com.nfl.service;

import com.nfl.dto.TeamPassingDto;

import java.util.List;

public interface TeamPassingService {
    TeamPassingDto createTeamPassingSeason(TeamPassingDto teamPassingDto);

    TeamPassingDto getTeamPassingById(int id);

    List<TeamPassingDto> getAllTeamPassingSeasons(int id);

    List<TeamPassingDto> getAllPassingSeasons();
}
