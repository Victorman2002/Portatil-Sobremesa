package practica5a;

public class Circulo {

    private Punto centro;
    private double radio;

    public Circulo() {
        radio = 1;
        centro = new Punto();
    }

    public Circulo(double radio, Punto punto) {
        this.radio = radio;
        centro = punto;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularDistanciaDesde(Punto punto) {
        return 0;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }


}
