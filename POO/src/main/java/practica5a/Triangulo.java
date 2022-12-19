package practica5a;

public class Triangulo {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public double calcularDistanciaDesde(Punto punto) {
        return 0;
    }

    public double calcularArea() {
        return punto1.calcularDistanciaDesde(punto2) * punto1.calcularDistanciaDesde(punto3) / 2;
    }

    public double calcularPerimetro() {
        return punto1.calcularDistanciaDesde(punto2) + punto2.calcularDistanciaDesde(punto3) + punto3.calcularDistanciaDesde(punto1);
    }

}
