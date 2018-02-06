package com.dzone.albanoj2.refactoring.hockey;

public class Game {

    public final double minutesPlayed;
    public final int goalsAgainst;
    public final int shotsOnGoalAgainst;

    public Game(int goalsAgainst, int shotsOnGoalAgainst, double minutesPlayed) {
        this.goalsAgainst = goalsAgainst;
        this.shotsOnGoalAgainst = shotsOnGoalAgainst;
        this.minutesPlayed = minutesPlayed;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getShotsOnGoalAgainst() {
        return shotsOnGoalAgainst;
    }

    public double getMinutesPlayed() {
        return minutesPlayed;
    }
}
