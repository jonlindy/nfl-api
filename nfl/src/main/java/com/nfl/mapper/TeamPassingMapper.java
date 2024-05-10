package com.nfl.mapper;

import com.nfl.dto.TeamPassingDto;
import com.nfl.entity.TeamPassingSeason;


public class TeamPassingMapper {

    public static TeamPassingDto mapToTeamPassingDto(TeamPassingSeason teamPassingSeason) {
        return new TeamPassingDto(
                teamPassingSeason.getId(),
                teamPassingSeason.getTeamId(),
                teamPassingSeason.getAtt(),
                teamPassingSeason.getCmp(),
                teamPassingSeason.getCmpPct(),
                teamPassingSeason.getYardsAtt(),
                teamPassingSeason.getYards(),
                teamPassingSeason.getTd(),
                teamPassingSeason.getInterceptions(),
                teamPassingSeason.getRate(),
                teamPassingSeason.getFirsts(),
                teamPassingSeason.getFirstPct(),
                teamPassingSeason.getTwentyPlus(),
                teamPassingSeason.getFortyPlus(),
                teamPassingSeason.getLongYard(),
                teamPassingSeason.getSack(),
                teamPassingSeason.getSackYards(),
                teamPassingSeason.getYear()
        );
    }

    public static TeamPassingSeason mapToTeamPassingSeason(TeamPassingDto teamPassingDto){
        return new TeamPassingSeason(
                teamPassingDto.getId(),
                teamPassingDto.getTeamId(),
                teamPassingDto.getAtt(),
                teamPassingDto.getCmp(),
                teamPassingDto.getCmpPct(),
                teamPassingDto.getYardsAtt(),
                teamPassingDto.getYards(),
                teamPassingDto.getTd(),
                teamPassingDto.getInterceptions(),
                teamPassingDto.getRate(),
                teamPassingDto.getFirsts(),
                teamPassingDto.getFirstPct(),
                teamPassingDto.getTwentyPlus(),
                teamPassingDto.getFortyPlus(),
                teamPassingDto.getLongYard(),
                teamPassingDto.getSack(),
                teamPassingDto.getSackYards(),
                teamPassingDto.getYear()
        );
    }
}
