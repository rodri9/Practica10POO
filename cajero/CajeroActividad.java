package cajero;

/**
 *
 * @author ドディス
 */
public class CajeroActividad {
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        KeyboardInput input = new KeyboardInput();
        int opc = 99;
        
        while(opc != 0)
        {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1) Depositar. ");
            System.out.println("2) Retirar.");
            System.out.println("3) Consultar saldo.");
            System.out.println("0) Salir.");
            opc = input.readInteger();
            
            switch(opc)
            {
                case 1:
                    System.out.println("Ingrese monto a depositar:");
                    float monto = input.readFloat();
                    cuenta.deposito(monto);
                    continue;
                    
                case 2:
                    System.out.println("Ingrese monto a retirar:");
                    monto = input.readFloat();
                    
                    try {
                        cuenta.retiro(monto);
                    } catch (SaldoInsuficienteException ex) {
                        System.out.println("\tSaldo Insuficiente.");
                    }
                    continue;
                    
                case 3:
                    System.out.println("Saldo actual: "+cuenta.getSaldo());
                    continue;
                    
                case 0:
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("Salió.");
    }
}
