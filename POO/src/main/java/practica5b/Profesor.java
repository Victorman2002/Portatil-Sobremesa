package practica5b;

public class Profesor {

    public void ponerNotas(Alumno alumno) {
        alumno.getAsignatura1().setCalificacion(Math.random() * 10 + 1);
        alumno.getAsignatura2().setCalificacion(Math.random() * 10 + 1);
        alumno.getAsignatura3().setCalificacion(Math.random() * 10 + 1);
    }

    public double calcularMedia(Alumno alumno) {
        return (alumno.getAsignatura1().getCalificacion()
                + alumno.getAsignatura2().getCalificacion()
                + alumno.getAsignatura3().getCalificacion()) / 3;
    }

}
