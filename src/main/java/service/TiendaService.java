package service;
import model.*;
import java.util.*;
public class TiendaService  implements ITiendaService{
    private Tienda tienda;

    public TiendaService(Tienda tienda) {
        this.tienda = tienda;
    }  
    @Override
    public void agregarComputador(Computador computador) {
        tienda.getComputadores().add(computador);
    }
     @Override
    public List<Computador> listarComputadores() {
        return tienda.getComputadores();
    }
    @Override
    public boolean eliminarComputador(String marca) {
        return tienda.getComputadores().removeIf(c -> c.getMarca().equals(marca));
    }
    @Override
    public Computador buscarComputador(String marca) {
        return tienda.getComputadores().stream()
                .filter(c -> c.getMarca().equals(marca))
                .findFirst()
                .orElse(null);
    }
}
