/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class Algoritmos {
    
    int np = 0;   
    Procesos p[];
    int te = 0; //Tiempo de ejecucion total
    ArrayList <Integer> cola = new ArrayList<Integer>();
    int q=2;
    
    public Algoritmos() {    
        np=5;
        p = new Procesos[np];
        
        p[0]= new Procesos(0,5, 0);
        p[1]= new Procesos(1,3, 1);
        p[2]= new Procesos(2,10, 2);
        p[3]= new Procesos(3,1, 3);
        p[4]= new Procesos(4,2, 4);
        
    }
    
    public void fifo(){
    
        Procesos pAux[] = new Procesos[np];
        
        for (int i = 0; i < np; i++){
            pAux[i] = p[i];

            te += pAux[i].getEjecucion(); // calcula tiempo final
        }

        System.out.println("Fifo");

        for(int i = 0; i < te; i++){ // recorre 20 procesos

            for (int j = 0; j < np; j++){ // 

                if(pAux[j].getLlegada() == i){

                    int tEjecucion = pAux[j].getEjecucion();

                    for (int k = 0; k < pAux[j].getEjecucion(); k++){
                        cola.add(j);
                        tEjecucion--;
                    }

                    pAux[j].setEjecucion(tEjecucion);
                }

            }

            int proceso = cola.getFirst();
            cola.removeFirst();
            System.out.println("Tiempo --> "+i+" Proceso --> "+proceso);
        }
    }
    
    public void sjf(){
        System.out.println("Algoritmo Fifo");
    }
    public void srtf(){
    
    }
    
    public void roundrobin(int q){
        this.q=q;

        Procesos pAux[] = new Procesos[np];
        
        for (int i = 0; i < np; i++){
            pAux[i] = p[i];

            te += pAux[i].getEjecucion(); // calcula tiempo final
        }

        System.out.println("RRobin 2");

        for(int i = 0; i < te; i++){ // recorre 20 procesos

            for (int j = 0; j < np; j++){ // 

                if(pAux[j].getLlegada() <= i){
                    int tEjecucion = pAux[j].getEjecucion();

                    for (int k = 0; k < q; k++){
                        cola.add(pAux[j].getId());
                        tEjecucion--;
                    }

                    Procesos ini = pAux[0];
                    for(int k = 0; k < np-1; k++){
                        pAux[k] = pAux[k+1];
                    }
                    pAux[np-1] = ini;
                    pAux[np-1].setEjecucion(tEjecucion);
                }

            }

            int proceso = cola.getFirst();
            cola.removeFirst();
            System.out.println("Tiempo --> "+i+" Proceso --> "+proceso);
        }
    }
    
    
    
    
}
