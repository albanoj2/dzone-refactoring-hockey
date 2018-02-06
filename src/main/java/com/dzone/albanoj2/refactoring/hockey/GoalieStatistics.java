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
            int tga = getTotalGoalsAgainst(games);

            double mins = 0;

            for (Game game: games) {
                mins += game.getMinutesPlayed();
            }

            return (tga / mins) * 60;
        }
    }

    private int getTotalGoalsAgainst(List<Game> games) {
        return games.stream().mapToInt(game -> game.getGoalsAgainst()).sum();
    }

    public double getSavePercentage() {

        if (season.getGames().isEmpty()) {
            return 0.0;
        }
        else {
            List<Game> games = season.getGames();
            int g = getTotalGoalsAgainst(games);

            int tsoga = 0;

            for (Game game: games) {
                tsoga += game.getShotsOnGoalAgainst();
            }

            return ((double) tsoga - g) / tsoga;
        }
    }
}
