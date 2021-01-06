package poop10;

/**
 *
 * @author ドディス
 */
public class Actividad {
    public static void main(String[] args) 
    {
        KeyboardInput input = new KeyboardInput();
        
        /*---- Actividad 1 ----*/
        System.out.println("---- Actividad 1 ----");
        System.out.println("Ingrese cuántos nombres quiere agregar:");
            int num = input.readInteger();
            String nombres [] = new String [num];
            
            for(int i = 0; i < num; i++)
            {
                System.out.println("Ingrese el nombre de la persona "+(i+1));
                String nombre = input.readString();
                nombres [i] = nombre;
            }
            
        try{
            //String mensajes [] = {"Antonio", "Javier", "Gabriela"};
            System.out.println("Ingrese cuántos nombres quiere imprimir: ");
            int opc = input.readInteger();
            
            for(int i = 0; i < opc; i++)
            {
                System.out.println(nombres[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango.");
        }
        
        /*---- Actividad 2 ----*/
        System.out.println("\n---- Actividad 2 ----");
        System.out.println("Ingrese los números para realizar la división.");
        System.out.println("Numerador:");
        float a = input.readFloat();
        System.out.println("Denominador:");
        float b = input.readFloat();
        
        try{
            float x = a/b;
            System.out.println("x = "+x);
        }catch(ArithmeticException ae){
            //ArithmeticException ae = lo que lance la excepción.
            System.out.println("Error: División entre cero.");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally.");
        }
        System.out.println("Fuera de try-catch.");
        
        /*---- Actividad 3. Catch Anidados. ----*/
        //Van de lo más especifico a lo general.
        System.out.println("\n---- Actividad 3 ----");
        System.out.println("Ingrese los números para realizar la división.");
        System.out.println("Numerador:");
        a = input.readFloat();
        System.out.println("Denominador:");
        b = input.readFloat();
        
        try{
            float x = a/b;
            System.out.println("x = "+x);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango.");
        }catch(ArithmeticException ae){
            System.out.println("Error: División entre cero.");
        }catch(Exception e){
            System.out.println("Excepción general.");
        }finally{
            System.out.println("A pesar de todo, se ejecuta finally.");
        }
        
        /*---- Actividad 4. Propagación de excepciones. ----*/
        System.out.println("\n---- Actividad 4 ----");
        System.out.println("Ingrese los números para realizar la división entera.");
        System.out.println("Numerador:");
        int a2 = input.readInteger();
        System.out.println("Denominador:");
        int b2 = input.readInteger();
        
        try{
            int division = division(a2,b2);
            System.out.println("División = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética.");
            //e.printStackTrace();
        }
        /*int division = division(8,0);
        System.out.println("División = "+division);*/
        
        /*---- Actividad 5. Propagación de excepciones. ----*/
        System.out.println("\n---- Actividad 5 ----");
        System.out.println("Ingrese los números para realizar la división entera.");
        System.out.println("Numerador:");
        a2 = input.readInteger();
        System.out.println("Denominador:");
        b2 = input.readInteger();
        try{
            int division = division2(a2,b2);
            System.out.println("División = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética.");
            //e.printStackTrace();
        }
    }
    
    /* ---- Funciones ---- */
    public static int division(int a, int b) throws ArithmeticException
    {
        int c;
        /*try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética.");
            c = 0; //Se debe inicializar la variable aquí por si ocurre, sino va a marcar un error.
        }*/
        
        c = a/b;
        
        return c;
    }
    
    public static int division2(int a, int b) throws ArithmeticException
    {
        if(b == 0){
            throw new ArithmeticException();
        }
        
        int c = a / b;   
        
        return c;
    }
}