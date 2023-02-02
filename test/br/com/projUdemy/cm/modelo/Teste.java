package br.com.projUdemy.cm.modelo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public final class Teste {

    @Test
    public void testarSeIgualADois() {
        int a = 1 + 1;

        assertEquals(2, a);
    }
    @Test
    public void testarSeIgualAtres() {
        int x = 2 + 10 - 9;

        assertEquals(3, x);
    }
}
