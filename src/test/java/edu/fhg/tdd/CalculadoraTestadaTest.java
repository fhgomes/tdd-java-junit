package edu.fhg.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTestadaTest {

    private CalculadoraTestada target;

    @BeforeEach
    void setUp() {
        target = new CalculadoraTestada();
    }

    @Nested
    class TestesSomaBasica {
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

        @ParameterizedTest
        @CsvSource({
                "2, 2, 4",
                "3, 3, 6",
                "2.5, 3, 5.5"
        })
        void deveSomarDiferentesValoresValorFracionado(
                double valorA,
                double valorB,
                double esperado) {
            double result = target.somar(valorA, valorB);

            Assertions.assertEquals(esperado, result);
        }
    }

    @Nested
    class TestesSomaMultiplos {

        @Test
        void deveSomar3Valores() {
            //arrange
            int valorA = 2;
            int valorB = 3;
            int valorC = 4;

            //act
            double result = target.somarMultiplos(valorA, valorB, valorC);

            //assert
            int expected = 9;
            Assertions.assertEquals(expected, result);
        }

    }

}