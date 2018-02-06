package com.dzone.albanoj2.refactoring.hockey;

public class GoalieStatistics {

    private final Season season;

    public GoalieStatistics(Season season) {
        this.season = season;
    }

    public double getGoalsAgainstAverage() {

        if (season.hasStarted()) {
            int totalGoalsAgainst = season.getTotalGoalsAgainst();
            double totalMinutesPlayed = season.getTotalMinutesPlayed();

            return (totalGoalsAgainst / totalMinutesPlayed) * 60;
        }
        else {
            return 0.0;
        }
    }

    public double getSavePercentage() {

        if (season.hasStarted()) {
            int totalGoalsAgainst = season.getTotalGoalsAgainst();
            int totalSogAgainst = season.getTotalShotsOnGoalAgainst();

            return ((double) totalSogAgainst - totalGoalsAgainst) / totalSogAgainst;
        }
        else {
            return 0.0;
        }
    }
}
