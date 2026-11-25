package org.example;

public class ScoreAdapter extends ScoreBureauExterno {

    private IScoreCredito scoreCooperativa;

    public ScoreAdapter(IScoreCredito scoreCooperativa) {
        this.scoreCooperativa = scoreCooperativa;
    }

    public double recuperarScoreCooperativa() {
        scoreCooperativa.setScore(this.getPontos() / 100.0);
        return scoreCooperativa.getScore();
    }

    public void salvarNoBureau() {
        this.setPontos((int) (scoreCooperativa.getScore() * 100));
    }
}
