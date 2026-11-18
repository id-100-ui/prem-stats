package com.pl.premierzone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<player, String> {

    void deleteByName(String playername);

    Optional<player> findByName(String playername);

    List<player> findByTeam(String team);

    List<player> findByPos(String pos);

    List<player> findByNation(String nation);
}
