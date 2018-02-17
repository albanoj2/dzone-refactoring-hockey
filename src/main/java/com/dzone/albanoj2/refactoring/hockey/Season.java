package com.dzone.albanoj2.refactoring.hockey;

import java.util.ArrayList;
import java.util.List;

public class Season {

    private final List<Game> games;

    public Season(List<Game> games) {
        this.games = new ArrayList<>(games);
    }

    public Season() {
        this.games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public List<Game> getGames() {
        return games;
    }

    public GoalieStatistics getGoalieStatistics() {
        return new GoalieStatistics(this);
    }
    
    public int getTotalGoalsAgainst() {
        return games.stream().mapToInt(game -> game.getGoalsAgainst()).sum();
    }

	public int getTotalShotsOnGoalAgainst() {
		return games.stream().mapToInt(game -> game.getShotsOnGoalAgainst()).sum();
	}
    
    public double getTotalMinutesPlayed() {
		return games.stream().mapToDouble(game -> game.getMinutesPlayed()).sum();
	}
    
    public boolean hasStarted() {
		return !games.isEmpty();
	}
}
