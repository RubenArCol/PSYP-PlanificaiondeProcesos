/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author Angela
 */
public class Procesos {

    /**
     * @param args the command line arguments
     */
    private int llegada;
    private int ejecucion;

    public Procesos(int llegada, int ejecucion) {
        this.llegada = llegada;
        this.ejecucion = ejecucion;
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    public int getEjecucion() {
        return ejecucion;
    }

    public void setEjecucion(int ejecucion) {
        this.ejecucion = ejecucion;
    }
         
}