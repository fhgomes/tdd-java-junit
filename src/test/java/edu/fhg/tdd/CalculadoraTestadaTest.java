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
        //arrange
        int valorA = 2;
        int valorB = 2;

        //act
        double result = target.somar(valorA, valorB);

        //assert
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deveSomar3Mais3Igual6() {

        //arrange
        int valorA = 3;
        int valorB = 3;

        //act
        double result = target.somar(valorA, valorB);

        //assert
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void deveSomarValorFracionado() {

        //arrange
        double valorA = 2.5;
        double valorB = 3;

        //act
        double result = target.somar(valorA, valorB);

        //assert
        double expected = 5.5;
        Assertions.assertEquals(expected, result);
    }
}