package model;

public class Computador {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOp;
    private double precio;

    public Computador(String marca, int memoria, String procesador, String sistemaOp, double precio) 

    {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOp = sistemaOp;
        this.precio = precio;
    }
    public String getMarca() { return marca; }
    public int getMemoria() { return memoria; }
    public String getProcesador() { return procesador; }
    public String getSistemaOp() { return sistemaOp; }
    public double getPrecio() { return precio; }



}
