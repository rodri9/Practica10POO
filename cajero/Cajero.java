package cajero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ドディス
 */
public class Cajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.deposito(500);
        try {
            cuenta.retiro(300);
            cuenta.retiro(100);
            cuenta.retiro(200);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("\tSaldo Insuficiente.");
        }
        /*Actividad: Que en la actividad el usuario ingrese los datos.*/
    }
}
