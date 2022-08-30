package edu.fhg.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTestadaTest {

    @Test
    void deveSomar2Mais2Igual4() {
        CalculadoraTestada target = new CalculadoraTestada();

        Assertions.assertEquals(4, target.somar(2, 2));
    }

    @Test
    void deveSomar3Mais3Igual6() {
        CalculadoraTestada target = new CalculadoraTestada();

        Assertions.assertEquals(6, target.somar(3, 3));
    }
}