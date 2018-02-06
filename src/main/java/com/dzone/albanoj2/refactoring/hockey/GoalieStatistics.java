package com.dzone.albanoj2.refactoring.hockey;

import java.util.List;

public class GoalieStatistics {

    private final Season season;

    public GoalieStatistics(Season season) {
        this.season = season;
    }

    public double getGoalsAgainstAverage() {

        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            List<Game> games = season.getGames();
            int tga = season.getTotalGoalsAgainst();
            double mins = getTotalMinutesPlayed(games);

            return (tga / mins) * 60;
        }
    }

	private double getTotalMinutesPlayed(List<Game> games) {
		double mins = 0;

		for (Game game: games) {
		    mins += game.getMinutesPlayed();
		}
		return mins;
	}

    public double getSavePercentage() {

        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            List<Game> games = season.getGames();
            int g = season.getTotalGoalsAgainst();

            int tsoga = 0;

            for (Game game: games) {
                tsoga += game.getShotsOnGoalAgainst();
            }

            return ((double) tsoga - g) / tsoga;
        }
    }
}
