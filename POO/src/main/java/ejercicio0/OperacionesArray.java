package ejercicio0;

public class OperacionesArray {

    public void listarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] ordenarArray(int[] array) {
        boolean switchMade = true;
        int aux;
        for (int i = 0; i < array.length && switchMade; i++) {
            switchMade = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    switchMade = true;
                }
            }
        }
        return array;
    }

    public int media(int[] array) {
        int media = 0;
        for (int i = 0; i < array.length; i++) {
            media += array[i];
        }
        return (media / array.length);
    }

    public int[] reverseArray(int[] intArray, int size) {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }
        return intArray;
    }
}
