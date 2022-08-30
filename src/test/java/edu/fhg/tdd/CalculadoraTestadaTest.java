package edu.fhg.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTestadaTest {

    private CalculadoraTestada target;

    @BeforeEach
    void setUp() {
        target = new CalculadoraTestada();
    }

    @Test
    void deveSomar2Mais2Igual4() {

        Assertions.assertEquals(4, target.somar(2, 2));
    }

    @Test
    void deveSomar3Mais3Igual6() {

        Assertions.assertEquals(6, target.somar(3, 3));
    }

    @Test
    void deveSomarValorFracionado() {

        Assertions.assertEquals(5.5, target.somar(2.5, 3));
    }
}