package com.pl.premierzone;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerControler {

    private final PlayerService playerservice;

    public PlayerControler(PlayerService playerservice) {
        this.playerservice = playerservice;
    }

    @GetMapping
    public List<player> getplayer(
            @RequestParam(required = false) String playername,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String nation
            ){
            if(playername == null && position == null && team == null && nation == null){
                return playerservice.getAllPlayers();
            } else if (playername != null) {
                return playerservice.findPlayerByName(playername);
            } else if (position != null) {
                return playerservice.getPlayersByPosition(position);
            } else if (team != null) {
                return playerservice.getPlayersByTeam(team);
            } else if(nation != null) {
            return playerservice.getPlayersByNation(nation);
            }
            return null;
    }

    @PostMapping
    public player addplayer(@RequestBody player player){
        return playerservice.addPlayer(player);
    }

    @PutMapping
    public player updateplayer(@RequestBody player player){
        return playerservice.updatePlayer(player);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteplayer(@RequestBody player player){
        playerservice.deletePlayer(player);
        return new ResponseEntity<>("PLAYER DELETED SCCESFULLY",HttpStatus.OK);
    }

}
