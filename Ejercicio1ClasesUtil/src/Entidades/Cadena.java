
package Entidades;

/**
 *
 * @author Grone
 */
public class Cadena {
    private String frase;
    private int longitud;
    
    //Constructor vacio
    public Cadena(){
        
    }
    
    
    //Constructor por parametro
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    //Getters y Setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
    
    
    
}
