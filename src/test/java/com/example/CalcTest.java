package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private final Calc calc = new Calc();

    @Test void somar_ok() { assertEquals(7, calc.somar(3,4)); }
    @Test void subtrair_ok() { assertEquals(-1, calc.subtrair(3,4)); }
    @Test void multiplicar_ok() { assertEquals(12, calc.multiplicar(3,4)); }
    @Test void dividir_ok() { assertEquals(2.5, calc.dividir(5,2)); }
    @Test void dividir_porZero_erro() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5,0));
    }
}
