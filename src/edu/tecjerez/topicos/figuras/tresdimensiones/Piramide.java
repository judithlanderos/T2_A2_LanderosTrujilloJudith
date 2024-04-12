package edu.tecjerez.topicos.figuras.tresdimensiones;

public class Piramide {
    private double ladoBase; 
    private double altura; 

    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }
    public double calcularAreaBase() {
        return ladoBase * ladoBase;
    }
    public double calcularAreaCaraLateral() {
        double alturaLateral = Math.sqrt(Math.pow(ladoBase / 2, 2) + Math.pow(altura, 2));
        return (ladoBase * alturaLateral) / 2;
    }

    public double calcularAreaTotal() {
        double areaBase = calcularAreaBase();
        double areaCaraLateral = calcularAreaCaraLateral() * 4;
        return areaBase + areaCaraLateral;
    }
    public double calcularVolumen() {
        return (calcularAreaBase() * altura) / 3;
    }
}
