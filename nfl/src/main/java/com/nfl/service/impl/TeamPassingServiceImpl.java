package com.nfl.service.impl;

import com.nfl.dto.TeamPassingDto;
import com.nfl.entity.TeamPassingSeason;
import com.nfl.exception.ResourceNotFoundException;
import com.nfl.mapper.TeamPassingMapper;
import com.nfl.repository.TeamPassingRepository;
import com.nfl.service.TeamPassingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamPassingServiceImpl implements TeamPassingService {

    private final TeamPassingRepository teamPassingRepository;

    @Autowired
    public TeamPassingServiceImpl(TeamPassingRepository teamPassingRepository) {
        this.teamPassingRepository = teamPassingRepository;
    }

    @Override
    public TeamPassingDto createTeamPassingSeason(TeamPassingDto teamPassingDto) {

        TeamPassingSeason teamPassingSeason = TeamPassingMapper.mapToTeamPassingSeason(teamPassingDto);
        TeamPassingSeason savedTeamPassingSeason = teamPassingRepository.save(teamPassingSeason);

        return TeamPassingMapper.mapToTeamPassingDto(savedTeamPassingSeason);
    }

    @Override
    public TeamPassingDto getTeamPassingById(int id) {
        TeamPassingSeason teamPassingSeason = teamPassingRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("TeamPassing does not exist with given id : "+id));

        return TeamPassingMapper.mapToTeamPassingDto(teamPassingSeason);
    }

    @Override
    public List<TeamPassingDto> getAllTeamPassingSeasons(int id) {
        List<TeamPassingSeason> teamPassingDtoList = teamPassingRepository.findAllByTeamId(id);

        return teamPassingDtoList.stream().map(TeamPassingMapper::mapToTeamPassingDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<TeamPassingDto> getAllPassingSeasons() {
        List<TeamPassingSeason> teamPassingDtoList = teamPassingRepository.findAll();

        return teamPassingDtoList.stream().map(TeamPassingMapper::mapToTeamPassingDto)
                .collect(Collectors.toList());
    }


}
