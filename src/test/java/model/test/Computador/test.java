package model.test.Computador;
import org.junit.jupiter.api.Test;

import model.Computador;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class test {
    @Test
    public void testCrearComputador() {
        
        String marca = "Dell";
        int memoria = 16;
        String procesador = "Intel i7";
        String sistemaOp = "Windows 10";
        double precio = 1500.0;
        Computador computador = new Computador(marca, memoria, procesador, sistemaOp, precio); 
        assertThat(computador.getMarca(), is(marca));
        assertThat(computador.getMemoria(), is(memoria));
        assertThat(computador.getProcesador(), is(procesador));
        assertThat(computador.getSistemaOp(), is(sistemaOp));
        assertThat(computador.getPrecio(), is(precio));
    } 
}

