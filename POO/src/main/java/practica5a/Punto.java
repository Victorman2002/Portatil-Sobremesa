package practica5a;

public class Punto {

    private double x;
    private double y;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaDesde(Punto b){
        return Math.sqrt (Math.pow(b.x-x,2) + Math.pow(b.y-y,2));
    }

}
