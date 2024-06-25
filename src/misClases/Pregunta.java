/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misClases;

/**
 *
 * @author Milton Rodriguez
 */
public class Pregunta {
    public String interrogante;
    public String opciones;

    public Pregunta() {
    }

    public Pregunta(String interrogante, String opciones) {
        this.interrogante = interrogante;
        this.opciones = opciones;
    }
    
    

    public String getInterrogante() {
        return interrogante;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setInterrogante(String interrogante) {
        this.interrogante = interrogante;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "interrogante=" + interrogante + ", opciones=" + opciones + '}';
    }
    
    public static void main(String[] args){
        Juego juego = new Juego();
        juego.cargarJuego();
    }
    
    
    
}

