package dev.computer;
import service.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("TechStore", "Juan Perez", "123456789");
        TiendaService tiendaService = new TiendaService(tienda);

        tiendaService.agregarComputador(new Computador("Dell", 16, "Intel i7", "Windows 10", 1500.0));
        tiendaService.agregarComputador(new Computador("HP", 8, "AMD Ryzen 5", "Windows 11", 1200.0));

        System.out.println("Computadores en la tienda:");
        tiendaService.listarComputadores().forEach(System.out::println);
    }

}
