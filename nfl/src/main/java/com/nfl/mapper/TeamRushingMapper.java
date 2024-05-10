package com.nfl.mapper;

import com.nfl.dto.TeamRushingDto;
import com.nfl.entity.TeamRushingSeason;

public class TeamRushingMapper {

    public static TeamRushingDto mapToTeamRushingDto(TeamRushingSeason teamRushingSeason) {
        return new TeamRushingDto(
                teamRushingSeason.getId(),
                teamRushingSeason.getTeamId(),
                teamRushingSeason.getAtt(),
                teamRushingSeason.getYards(),
                teamRushingSeason.getYpc(),
                teamRushingSeason.getTd(),
                teamRushingSeason.getTwentyPlus(),
                teamRushingSeason.getFortyPlus(),
                teamRushingSeason.getLongRush(),
                teamRushingSeason.getFirsts(),
                teamRushingSeason.getFirstPct(),
                teamRushingSeason.getFum(),
                teamRushingSeason.getYear()
        );
    }

    public static TeamRushingSeason mapToTeamRushingSeason(TeamRushingDto teamRushingDto){
        return new TeamRushingSeason(
                teamRushingDto.getTeamId(),
                teamRushingDto.getTeamId(),
                teamRushingDto.getAtt(),
                teamRushingDto.getYards(),
                teamRushingDto.getYpc(),
                teamRushingDto.getTd(),
                teamRushingDto.getTwentyPlus(),
                teamRushingDto.getFortyPlus(),
                teamRushingDto.getLongRush(),
                teamRushingDto.getFirsts(),
                teamRushingDto.getFirstPct(),
                teamRushingDto.getFum(),
                teamRushingDto.getYear()
        );
    }
}
