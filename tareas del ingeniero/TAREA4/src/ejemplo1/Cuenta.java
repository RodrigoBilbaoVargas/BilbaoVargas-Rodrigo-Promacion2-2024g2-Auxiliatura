package ejemplo1;

public class Cuenta {
    private double saldo;

    // Constructor
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para ingresar dinero
    public void ingresar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Ingreso realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a ingresar debe ser positivo.");
        }
    }

    // Método para extraer dinero
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Extracción realizada. Saldo actual: " + saldo);
        } else {
            System.out.println("Monto inválido o insuficiente saldo.");
        }
    }

    // Método para recuperar el saldo actual
    public double getSaldo() {
        return saldo;
    }
}