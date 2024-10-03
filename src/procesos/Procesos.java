/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.util.ArrayList;
import java.util.Iterator;

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
      
        
    public static void main(String[] args) {
        // TODO code application logic here
    int np=5;    
    Procesos[] p = new Procesos[np];
    p[1]= new Procesos(0,5);
    p[2]= new Procesos(1,3);
    p[3]= new Procesos(2,10);
    p[4]= new Procesos(3,1);
    p[5]= new Procesos(4,2);
    
    ArrayList <Integer> cola = new ArrayList<Integer>();
    
    for (int i = 0; i < 10; i++) {
        for (int j = i; j < np; j++){
            if(p[j].getEjecucion()==j){
                int e=p[j].getEjecucion();
                for (int k = 0; k < p[j].getEjecucion(); k++) {
                    cola.add(j);
                    e--;
                }
                p[j].setEjecucion(e);
            }
        
        }
        
        
    }
    
    }
    
}
