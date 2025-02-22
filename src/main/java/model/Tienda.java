package model;
import java.util.ArrayList;
import java.util.List;
public class Tienda {
    private String nombre;
    private String propietario;
    private String idTributario;
    private List<Computador> computadores;

    public Tienda(String nombre, String propietario, String idTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.idTributario = idTributario;
        this.computadores = new ArrayList<>();
    }  

}
