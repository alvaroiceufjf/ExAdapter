package org.example;

public class Associado {

    private IScoreCredito score;
    private ScoreAdapter adapter;

    public Associado() {
        this.score = new ScoreCooperativa();
        this.adapter = new ScoreAdapter(score);
    }

    public void setScore(double valor) {
        score.setScore(valor);
        adapter.salvarNoBureau();
    }

    public double getScore() {
        return adapter.recuperarScoreCooperativa();
    }

    public int getPontosBureau() {
        return adapter.getPontos();
    }
}
