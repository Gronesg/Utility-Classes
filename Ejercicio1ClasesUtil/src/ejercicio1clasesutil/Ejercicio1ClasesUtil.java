
package ejercicio1clasesutil;

import Entidades.Cadena;
import Servicio.CadenaService;
import java.util.Scanner;

/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud.
Agregarconstructor vacío y con atributo frase solamente. Agregar getters y setters.
El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalbasac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
se repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 *
 * @author Grone
 */
public class Ejercicio1ClasesUtil {

    public static void main(String[] args) {
        CadenaService cs1 = new CadenaService();
        
        /*
        Forma 1) Enviandole como argumento una palabra por defecto
        Cadena cadena1 = new Cadena("casa blanca");
        */
        
        
        //Forma 2) Pidiendo al usuario el ingreso de la frase
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase para trabajar: ");
        String cadenaIngreso = leer.nextLine();
        Cadena cadena1 = new Cadena(cadenaIngreso);
        
        
        //INVOCACION DE TODOS LOS METODOS
        
        //a) Cantidad de vocales que posee la frase
        /*------------------------------------------------------------*/
        int cantidadVocales = cs1.mostrarVocales(cadena1);
        
        System.out.println("Cantidad de vocales: " + cantidadVocales);
        /*------------------------------------------------------------*/
        
        //b) Frase invertida
        /*------------------------------------------------------------*/
        String fraseInvertida = cs1.invertirFrase(cadena1);
        
        System.out.println("Frase original: " + cadenaIngreso + "\nFrase invertida: " + fraseInvertida);
        /*------------------------------------------------------------*/
        
        //c) Cuantas veces se repite un caracter
        /*------------------------------------------------------------*/
        System.out.println("Ingrese un caracter: ");
        String caracter = leer.next();
        int vecesRepetido = cs1.vecesRepetido(cadena1, caracter);
        System.out.println("El caracter "+"'" + caracter + "'"+ " se repite " + vecesRepetido + " veces");
        /*------------------------------------------------------------*/
        
        //d) Comparar las longitudes
        cs1.compararLongitud(cadena1);
        
        //e) Concatena frases
        cs1.unirFrases(cadena1);
        
        //f) Reemplaza una letra por otra
        cs1.reemplazar(cadena1);
        
        //g) Verifica si la frase tiene cierto caracter
        cs1.contiene(cadena1);
        
    }

}
