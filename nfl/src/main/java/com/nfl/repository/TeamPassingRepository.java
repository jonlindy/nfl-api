package com.nfl.repository;

import com.nfl.entity.TeamPassingSeason;
import com.nfl.entity.TeamRushingSeason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamPassingRepository extends JpaRepository<TeamPassingSeason, Integer> {
    List<TeamPassingSeason> findAllByTeamId(int teamId);
}
