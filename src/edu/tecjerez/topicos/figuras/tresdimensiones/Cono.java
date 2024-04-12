package edu.tecjerez.topicos.figuras.tresdimensiones;

public class Cono{
    private double radio;
    private double altura;

    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    public double calcularAreaBase() {
        return Math.PI * Math.pow(radio, 2);
    }
    public double calcularAreaLateral() {
        return Math.PI * radio * Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
    }

    public double calcularAreaTotal() {
        return calcularAreaBase() + calcularAreaLateral();
    }
    public double calcularVolumen() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }

   
}
