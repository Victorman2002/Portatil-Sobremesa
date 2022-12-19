package ejercicio1;

public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
        this.lado1 = 1;
        this.lado2 = 2;
        this.lado3 = 3;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getPerimetro() {
        return (this.lado1 + this.lado2 + this.lado3);
    }

    public double getArea() {
        double altura = Math.sqrt(Math.pow(this.lado1, 2) + Math.pow(this.lado2, 2));
        return (this.lado3 * altura) / 2;
    }


}
