package math;

public class VectorOperation {

    // Método para sumar dos enteros
    public Integer add(int a, int b) {
        return a + b;
    }

    // Método para restar dos enteros
    public Integer subtract(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos enteros
    public Integer multiply(int a, int b) {
        return a * b;
    }

    // Método para sumar dos vectores
    public Vector add(Vector a, Vector b) {
        return a.add(b);
    }

    // Método para restar dos vectores
    public Vector subtract(Vector a, Vector b) {
        return a.subtract(b);
    }

    // Método para multiplicar vector por escalar
    public Vector multiply(Vector v, int scalar) {
        return v.multiply(scalar);
    }

    // Método para imprimir resultados
    public void print(Object result) {
        System.out.println(result.toString());
    }
}