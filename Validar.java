package validaciones;


import java.util.Scanner;

/**
 *
 * @author mmartinezcosta
 */
public class Validar {

    public static float validarFloatPositivo(){
        
        Scanner sc=new Scanner (System.in);
        
        float valor;
        
        do{
            valor =sc.nextFloat();
        }
        while(valor<=0);
        return valor;
    }
}

