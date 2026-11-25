package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssociadoTest {

    @Test
    void deveRetornarScoreCooperativaConvertido() {
        Associado associado = new Associado();
        associado.setScore(8.5);

        assertEquals(8.5, associado.getScore(), 0.01);
    }

    @Test
    void deveRetornarPontosDoBureauExterno() {
        Associado associado = new Associado();
        associado.setScore(8.5);

        assertEquals(850, associado.getPontosBureau());
    }
}
