package model.test.Computador;
import org.junit.jupiter.api.Test;
import model.Computador;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
class modelComputertTest {

    @Test
    void testComputadorConstructorAndGetters() {
        // Create a Computador object
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 11", 1500.0);

        // Verify the attributes using Hamcrest matchers
        assertThat(computador.getMarca(), equalTo("Dell"));
        assertThat(computador.getMemoria(), is(16));
        assertThat(computador.getProcesador(), equalTo("Intel i7"));
        assertThat(computador.getSistemaOp(), equalTo("Windows 11"));
        assertThat(computador.getPrecio(), is(1500.0));
    }

    @Test
    void testComputadorEquality() {
        // Create two Computador objects with the same attributes
        Computador computador1 = new Computador("Dell", 16, "Intel i7", "Windows 11", 1500.0);
        Computador computador2 = new Computador("Dell", 16, "Intel i7", "Windows 11", 1500.0);

       // They are not the same instance
        assertThat(computador1.getMarca(), equalTo(computador2.getMarca()));
        assertThat(computador1.getMemoria(), equalTo(computador2.getMemoria()));
        assertThat(computador1.getProcesador(), equalTo(computador2.getProcesador()));
        assertThat(computador1.getSistemaOp(), equalTo(computador2.getSistemaOp()));
        assertThat(computador1.getPrecio(), equalTo(computador2.getPrecio()));
    }
}

