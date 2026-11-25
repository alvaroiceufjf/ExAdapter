package org.example;

public class ScoreCooperativa implements IScoreCredito {

    private double score;

    @Override
    public double getScore() {
        return this.score;
    }

    @Override
    public void setScore(double score) {
        this.score = score;
    }
}
