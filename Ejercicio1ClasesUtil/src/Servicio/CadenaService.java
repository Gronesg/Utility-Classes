
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Grone
 */
public class CadenaService {
    
    //a) deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena cadena){
        int cont_vocales = 0;
        String vocales = "aeiouAEIOU";
        //Cadena frase1 = new Cadena();
        
        for (int i = 0 ; i < cadena.getLongitud() ; i++){
            if (vocales.indexOf(cadena.getFrase().charAt(i)) != -1){
                /*
                Clase String (charAt, indexOf)
                cadena.getFrase().charAt(i): Devuelve el caracter en la posicion "i" de la cadena("casa blanca")
                vocales.indexOf(cadena.getFrase().charAt(i): Busca la posicion del caracter dentro dee la cadena de vocales
                */
                cont_vocales ++;
            }
        }
        return cont_vocales;
    }
    
    //b) deberá invertir la frase ingresada y mostrarla por pantalla.
    public String invertirFrase(Cadena cadena){
        String frase = cadena.getFrase();
        String fraseInvertida = "";
        //Recorro la frase de atras hacia delante
        for (int i = frase.length() - 1/*Desde el ultimo caracter*/; i >= 0 /*Al primer caracter*/; i--){
            fraseInvertida += frase.charAt(i);
            /*
            charAt toma caracter por caracter dependiendo del "i"y lo concatena
            el " += " es como decir fraseInvertida = fraseInvertida + frase.charAt(i)
            */
        }
        return fraseInvertida;
    }
    
    //c) recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase
    public int vecesRepetido(Cadena cadena, String caracter){
        //Scanner leer = new Scanner(System.in);
        String frase = cadena.getFrase();
        int vecesRepetido = 0;
        //System.out.println("Ingrese un caracter: ");
        //String caracter = leer.next();
        for (int i = 0 ; i < frase.length() ; i++){
            if (caracter.indexOf(cadena.getFrase().charAt(i)) != -1){
            //if (frase.charAt(i) == caracter){
            vecesRepetido++;
                
            }
        }
        
        
        return vecesRepetido;
    }
}
