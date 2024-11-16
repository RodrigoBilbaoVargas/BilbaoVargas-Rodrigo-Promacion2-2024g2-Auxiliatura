package ejemplo1;

public class CuentaConLimite extends Cuenta {
    private double limite;

    // Constructor
    public CuentaConLimite(double saldoInicial) {
        super(saldoInicial);
        ajustarLimite();
    }

    // Método para ajustar el límite (mitad del saldo actual)
    public void ajustarLimite() {
        this.limite = getSaldo() / 2;
        System.out.println("Límite ajustado a: " + limite);
    }

    // Sobrescritura del método extraer para considerar el límite
    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= limite && monto <= getSaldo()) {
            super.extraer(monto);
        } else {
            System.out.println("Monto inválido o supera el límite permitido.");
        }
    }
}