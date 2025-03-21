package service.test.TiendaServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
import model.Tienda;
import service.TiendaService;
import model.Computador;

public class TiendaServiceTest {
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

        
        tienda.getComputadores().add(computador);

        
        assertThat(tienda.getComputadores(), hasSize(1));
        assertThat(tienda.getComputadores().get(0).getMarca(), is("Dell"));
    }
    @Test
    public void testListarComputadores() {
        
        tienda.getComputadores().add(new Computador("Asus", 16, "Intel i5", "Windows 10", 1000.0));
        tienda.getComputadores().add(new Computador("Acer", 8, "AMD Ryzen 3", "Windows 11", 800.0));

    
        var computadores = tienda.getComputadores();

        
        assertThat(computadores, hasSize(2));
        assertThat(computadores.get(0).getMarca(), is("Asus"));
        assertThat(computadores.get(1).getMarca(), is("Acer"));
    }

    @Test
    public void testEliminarComputador() {
        
        Computador computador = new Computador("HP", 8, "AMD Ryzen 5", "Windows 11", 1200.0);
        tienda.getComputadores().add(computador);

        
        boolean eliminado = tienda.getComputadores().removeIf(c -> c.getMarca().equals("HP"));

    
        assertThat(eliminado, is(true));
        assertThat(tienda.getComputadores(), hasSize(0));
    }

    @Test
    public void testBuscarComputador() {
        
        Computador computador = new Computador("Lenovo", 32, "Intel i9", "Linux", 2000.0);
        tienda.getComputadores().add(computador);

        
        Computador encontrado = tienda.getComputadores().stream()
                .filter(c -> c.getMarca().equals("Lenovo"))
                .findFirst()
                .orElse(null);

        
        assertThat(encontrado, is(notNullValue()));
        assertThat(encontrado.getMarca(), is("Lenovo"));
    }

}
   

