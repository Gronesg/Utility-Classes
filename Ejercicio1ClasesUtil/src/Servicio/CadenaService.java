
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
        String frase = cadena.getFrase();
        int vecesRepetido = 0;
        for (int i = 0 ; i < frase.length() ; i++){
            if (caracter.indexOf(cadena.getFrase().charAt(i)) != -1){
            vecesRepetido++;
                
            }
        }
              
        return vecesRepetido;
    }
    
    //d) deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena){
        Scanner leer = new Scanner(System.in);
        int fraseOriginal = cadena.getLongitud();
        System.out.println("Ingrese la frase para comparar sus longitudes: ");
        String frase = leer.nextLine();
        
        if (fraseOriginal == frase.length()){  
            /*Tambien puedo usar (cadena.getLongitud() == frase.lenght()) directamente
            sin tener que hacer lo de la linea 64*/
            System.out.println("Las longitudes son iguales");
            System.out.println("frase original: " + fraseOriginal + " segunda frase: " + frase.length());
        } else {
            System.out.println("Las longitudes no son iguales");
            System.out.println("frase original: " + fraseOriginal + " segunda frase: " + frase.length());
        }
    }
    
    //e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar
    //la frase resultante.
    public void unirFrases(Cadena cadena){
        Scanner leer = new Scanner(System.in);
        String fraseOriginal = cadena.getFrase();
        System.out.println("Ingrese la nueva frase para unir con la original:");
        String nuevaFrase = leer.nextLine();
        System.out.println("La frase concatenada queda: " + fraseOriginal.concat(nuevaFrase));
        //.concat() concatena lo ingresado en <<nuevaFrase>> al final de la frase original
        
    }
    
    /*f)Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter
    seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazar(Cadena cadena){
        Scanner leer = new Scanner(System.in);
        //String fraseOriginal = cadena.getFrase();
        System.out.println("Ingrese el caracter a reemplazar por la letra 'a': ");
        String caracter = leer.next(); //Ingreso del caracter por el que voy a reemplazar
        System.out.println("La cadena reemplazando la letra 'a' por la letra " + "'" + caracter + "'" + " queda: " + cadena.getFrase().replace("a", caracter));
        //.replace() reemplaza el primer parametro "a" , por el segundo parametro, en este caso <<caracter>>, previamente ingresado
        
        /*NOTA= El reemplazo de la letra "a" solo funciona si ingresamos "casa blanca" como frase original,
        si optamos por la forma 2, y nuestra frase original no tiene "a", no surgirá cambios. En todo caso
        solo hay que cambiar el primer parametro en la linea 98 "cadena.getFrase().replace("a", caracter)"*/
        
    }
    //g) deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y
    //falso si no.
    public void contiene(Cadena cadena){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra para ver si la frase la contiene: ");
        String letra = leer.next(); //Ingreso de la letra para buscar en la frase original
        System.out.println("¿La letra esta? (True/False): " + cadena.getFrase().contains(letra));
        //.contains() Busca en la cadena, el parametro envidado, en este caso <<letra>> previamente ingresado
    }
}
