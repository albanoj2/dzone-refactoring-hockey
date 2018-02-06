package com.dzone.albanoj2.refactoring.hockey;

public class GoalieStatistics {

    private final Season season;

    public GoalieStatistics(Season season) {
        this.season = season;
    }

    public double getGoalsAgainstAverage() {

        if (!hasStarted()) {
            return 0.0;
        }
        else {
            int totalGoalsAgainst = season.getTotalGoalsAgainst();
            double totalMinutesPlayed = season.getTotalMinutesPlayed();

            return (totalGoalsAgainst / totalMinutesPlayed) * 60;
        }
    }

	private boolean hasStarted() {
		return !season.getGames().isEmpty();
	}

    public double getSavePercentage() {

        if (!hasStarted()) {
            return 0.0;
        }
        else {
            int totalGoalsAgainst = season.getTotalGoalsAgainst();
            int totalSogAgainst = season.getTotalShotsOnGoalAgainst();

            return ((double) totalSogAgainst - totalGoalsAgainst) / totalSogAgainst;
        }
    }
}
