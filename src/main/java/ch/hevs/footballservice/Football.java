package ch.hevs.footballservice;

import ch.hevs.businessobject.League;
import ch.hevs.businessobject.Player;
import ch.hevs.businessobject.Team;
import ch.hevs.businessobject.Trainer;

import javax.ejb.Local;
import java.util.List;

@Local
public interface Football {
    List<League> getLeagues();
    List<Team> getTeams();
    List<Player> getPlayers();
    List<Trainer> getTrainers();
}
