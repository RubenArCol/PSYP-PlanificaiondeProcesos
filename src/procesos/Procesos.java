/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;

import java.util.ArrayList;

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
    p[0]= new Procesos(0,5);
    p[1]= new Procesos(1,3);
    p[2]= new Procesos(2,10);
    p[3]= new Procesos(3,1);
    p[4]= new Procesos(4,2);
    
    ArrayList <Integer> cola = new ArrayList<Integer>();
    
    int te =0; //Tiempo de ejecucion total
    for (int i = 0; i < np; i++) {
        te=te+p[i].getEjecucion();
    }
    System.out.println(te);
     
    for (int i = 0; i < te; i++) {
        for (int j = 0; j < np; j++){
            if(p[j].getLlegada()==i){
                System.out.println(j);
                int e=p[j].getEjecucion();
                for (int k = 0; k < p[j].getEjecucion(); k++) {
                    cola.add(j);
                    //System.out.println(j); Para saber en que momento entran en cola
                    e--;
                }
                p[j].setEjecucion(e);
            }
        
        }
       int proceso=cola.getFirst();
       cola.removeFirst();
       System.out.println("Tiempo -->"+i+ "   Proceso-->"+proceso);   
    }
    
    }
    
}
