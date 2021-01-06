package poop10;

/**
 *
 * @author ドディス
 */
public class POOP10 
{
    public static void main(String[] args)
    {
        /*---- Actividad 1 ----*/
        System.out.println("---- Actividad 1 ----");
        try{
            String mensajes [] = {"Antonio", "Javier", "Gabriela"};
            for(int i = 0; i < 4; i++)
            {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango.");
        }
        
        /*---- Actividad 2 ----*/
        System.out.println("\n---- Actividad 2 ----");
        try{
            float x = 5/0;
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
        try{
            float x = 5/0;
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
        try{
            int division = division(8,0);
            System.out.println("División = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética.");
            //e.printStackTrace();
        }
        /*int division = division(8,0);
        System.out.println("División = "+division);*/
        
        /*---- Actividad 5. Propagación de excepciones. ----*/
        System.out.println("\n---- Actividad 5 ----");
        try{
            int division = division2(8,0);
            System.out.println("División = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepción aritmética.");
            //e.printStackTrace();
        }
        
        /*Actividad: Que en todas las actividades el usuario ingrese los datos.*/
        
    }
    
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
