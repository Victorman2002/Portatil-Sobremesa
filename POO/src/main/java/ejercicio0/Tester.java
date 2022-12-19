package ejercicio0;

import ejercicio1.Triangulo;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {

        int[] array = {7, 6, 2, 1, 8, 6, 4, 7};
        OperacionesArray operacionesArray = new OperacionesArray();
        Triangulo triangulo = new Triangulo(1, 2, 3);
        //operacionesArray.listarArray(array);
        //System.out.println(Arrays.toString(operacionesArray.invertirArray(array)));
        System.out.println(triangulo.getArea());

    }
}
