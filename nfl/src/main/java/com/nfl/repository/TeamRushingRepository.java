package com.nfl.repository;

import com.nfl.entity.TeamPassingSeason;
import com.nfl.entity.TeamRushingSeason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRushingRepository extends JpaRepository<TeamRushingSeason, Integer> {
    List<TeamRushingSeason> findAllByTeamId(int teamId);
}
