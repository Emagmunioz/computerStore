package model.test.Computador.Tienda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Tienda;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class test {
    private Tienda tienda;
    @BeforeEach
    public void setUp() {
        tienda = new Tienda("TechStore", "Juan Perez", "123456789");
    }
    @Test
    public void testCrearTienda() {
        
        assertThat(tienda.getNombre(), is("TechStore"));
        assertThat(tienda.getPropietario(), is("Juan Perez"));
        assertThat(tienda.getIdTributario(), is("123456789"));
        assertThat(tienda.getComputadores(), is(empty()));
    }
}
