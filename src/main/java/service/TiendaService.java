package service;
import model.*;
import java.util.*;
public class TiendaService {
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

}
