package com.pl.premierzone;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    /*
    public Optional<player> getPlayer(String playername) {
        return playerRepository.findByName(playername);
        this is the better way just to know the other way we cept them
    }
    */
    public List<player> findPlayerByName(String name){
        return playerRepository.findByName(name)
                .map(List::of)
                .orElseGet(List::of);
    }

    public List<player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public List<player> getPlayersByTeam(String team){
        return playerRepository.findByTeam(team);
    }

    public List<player> getPlayersByPosition(String position){
        return playerRepository.findByPos(position);
    }


    public List<player> getPlayersByNation(String nation){
        return playerRepository.findByNation(nation);
    }

    public player addPlayer(player player){
        playerRepository.save(player);
        return player;
    }


    public player updatePlayer(player Updatedplayer){
        Optional<player> existingPlayer = playerRepository.findByName(Updatedplayer.getName());
        if(existingPlayer.isPresent()){
            player playerupdate = existingPlayer.get();
            playerupdate.setName(Updatedplayer.getName());
            playerupdate.setTeam(Updatedplayer.getTeam());
            playerupdate.setNation(Updatedplayer.getNation());
            playerupdate.setPos(Updatedplayer.getPos());
            playerRepository.save(playerupdate);
            return playerupdate;
        }
        return null;

    }

    @Transactional
    public void deletePlayer(player player){
        playerRepository.deleteByName(player.getName());
    }

}
