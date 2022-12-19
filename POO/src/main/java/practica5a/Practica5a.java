package practica5a;

public class Practica5a {
    public static void main(String[] args) {

        Punto punto1 = new Punto(1, 1);
        Punto punto2 = new Punto(2, 2);

        System.out.println(punto1.calcularDistanciaDesde(punto2));

        Circulo circulo = new Circulo(2, new Punto(0, 0));

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
        System.out.println(circulo.calcularDistanciaDesde(new Punto(1, 2)));

        Triangulo triangulo = new Triangulo(new Punto(3, 2), new Punto(1, 7), new Punto(2, 9));

        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo.calcularDistanciaDesde(new Punto(1, 2)));

    }
}
