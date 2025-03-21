package service.test.TiendaServices;
import model.Computador;
import service.ITiendaService;
import java.util.ArrayList;
import java.util.List;

public class TiendaServiceImpl implements ITiendaService {
    private List<Computador> computadores = new ArrayList<>();

    @Override
    public void agregarComputador(Computador computador) {
        computadores.add(computador);
    }

    @Override
    public boolean eliminarComputador(String marca) {
        return computadores.removeIf(c -> c.getMarca().equals(marca));
    }

    @Override
    public Computador buscarComputador(String marca) {
        return computadores.stream()
                .filter(c -> c.getMarca().equals(marca))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Computador> listarComputadores() {
        return new ArrayList<>(computadores);
    }
}
