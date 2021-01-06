package cajero;

/**
 *
 * @author ドディス
 */
public class SaldoInsuficienteException extends Exception{
    
    SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }
}
