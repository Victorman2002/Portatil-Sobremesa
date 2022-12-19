package practica5b;

public class practica5b {
    public static void main(String[] args) {

        Asignatura asignatura1 = new Asignatura(1234);
        Asignatura asignatura2 = new Asignatura(4321);
        Asignatura asignatura3 = new Asignatura(4567);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);
        System.out.println(profesor.calcularMedia(alumno));

    }
}
