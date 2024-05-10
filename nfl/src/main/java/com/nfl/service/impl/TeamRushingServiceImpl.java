package com.nfl.service.impl;

import com.nfl.dto.TeamRushingDto;
import com.nfl.entity.TeamRushingSeason;
import com.nfl.exception.ResourceNotFoundException;
import com.nfl.mapper.TeamRushingMapper;
import com.nfl.repository.TeamRushingRepository;
import com.nfl.service.TeamRushingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamRushingServiceImpl implements TeamRushingService {

    private final TeamRushingRepository teamRushingRepository;

    @Autowired
    public TeamRushingServiceImpl(TeamRushingRepository teamRushingRepository) {
        this.teamRushingRepository = teamRushingRepository;
    }

    @Override
    public TeamRushingDto createTeamRushingSeason(TeamRushingDto teamRushingDto) {

        TeamRushingSeason teamRushingSeason = TeamRushingMapper.mapToTeamRushingSeason(teamRushingDto);
        TeamRushingSeason savedTeamRushingSeason = teamRushingRepository.save(teamRushingSeason);

        return TeamRushingMapper.mapToTeamRushingDto(savedTeamRushingSeason);
    }

    @Override
    public TeamRushingDto getTeamRushingById(int id) {
        TeamRushingSeason teamRushingSeason = teamRushingRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("TeamRushing does not exist with given id : "+id));

        return TeamRushingMapper.mapToTeamRushingDto(teamRushingSeason);
    }

    @Override
    public List<TeamRushingDto> getAllTeamRushingSeasons(int id) {
        List<TeamRushingSeason> teamRushingDtoList = teamRushingRepository.findAllByTeamId(id);

        return teamRushingDtoList.stream().map(TeamRushingMapper::mapToTeamRushingDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TeamRushingDto> getAllRushingSeasons() {
        List<TeamRushingSeason> teamRushingDtoList = teamRushingRepository.findAll();

        return teamRushingDtoList.stream().map(TeamRushingMapper::mapToTeamRushingDto)
                .collect(Collectors.toList());
    }


}
