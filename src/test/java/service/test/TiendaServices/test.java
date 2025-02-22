package service.test.TiendaServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
import model.Tienda;
import service.TiendaService;
import model.Computador;

public class test {
    private Tienda tienda;
    private TiendaService tiendaService;

    @BeforeEach
    public void setUp() {
        tienda = new Tienda("TechStore", "Juan Perez", "123456789");
        tiendaService = new TiendaService(tienda);
    }
@Test
    public void testAgregarComputador() {
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1500.0);
        tiendaService.agregarComputador(computador);

}
}
