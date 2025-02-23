package service;
import model.*;
import java.util.*;

public interface ITiendaService {
    void agregarComputador(Computador computador);
    boolean eliminarComputador(String marca);
    Computador buscarComputador(String marca);
    List<Computador> listarComputadores();

}
