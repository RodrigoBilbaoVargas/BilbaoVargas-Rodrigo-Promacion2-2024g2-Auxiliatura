package ejemplo1;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta básica
        Cuenta cuentaBasica = new Cuenta(1000);
        cuentaBasica.ingresar(500);
        cuentaBasica.extraer(300);
        System.out.println("Saldo final de la cuenta básica: " + cuentaBasica.getSaldo());

        // Crear una cuenta con límite
        CuentaConLimite cuentaConLimite = new CuentaConLimite(1000);
        cuentaConLimite.extraer(300);
        cuentaConLimite.ajustarLimite();
        cuentaConLimite.extraer(600);
        System.out.println("Saldo final de la cuenta con límite: " + cuentaConLimite.getSaldo());
    }
}