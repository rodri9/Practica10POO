package cajero;

/**
 *
 * @author ドディス
 */
public class Cuenta {
    private double saldo;

    /**
     * Constructor. Crea una "Cuenta" con saldo en ceros.
     * No recibe ningún parámetro
     */
    public Cuenta() {
        this.saldo = 0;
    }

    /**
     * Método que nos permite visualizar el valor del atributo saldo.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método que nos permite hacer un depósito a la cuenta.
     * @param monto 
     */
    public void deposito(double monto) {
        System.out.println("Depositando: $"+monto);
        saldo += monto;
        System.out.println("\tSaldo actual: $"+saldo);
    }
    
    /**
     * Método que nos permite hacer un retiro desde la cuenta.
     * @param monto
     * @throws SaldoInsuficienteException 
     */
    public void retiro(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando: $"+monto);
        if(saldo < monto)
        {
            throw new SaldoInsuficienteException();
        }
        else
        {
            saldo -= monto;
        }
        System.out.println("\tSaldo restante: $"+saldo);
    }
}
