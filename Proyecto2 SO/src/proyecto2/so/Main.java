/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2.so;

import Interfaz.VideoStart;
import Interfaz.Window;

/**
 *
 * @author jesusmachta
 */
public final class Main {
    public static Admin admin= new Admin();
    public static IA ia= new IA(10);
    public static Window w;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        VideoStart v= new VideoStart();
        v.setVisible(true);

        w  = new Window(); 
    }
    
    public static void inicio() throws InterruptedException{
//         w  = new Window(); 
        admin.crearPersonajes();
        w.colaStarTrek1.setText(admin.printCola(admin.getCola1StarTrek()));
        w.colaStarTrek2.setText(admin.printCola(admin.getCola2StarTrek()));
        w.colaStarTrek3.setText(admin.printCola(admin.getCola3StarTrek()));
        w.colaStarTrekRefuerzo.setText(admin.printCola(admin.getColaRefuerzoStarTrek()));
        
        w.colaStarWars1.setText(admin.printCola(admin.getCola1StarWars()));
        w.colaStarWars2.setText(admin.printCola(admin.getCola2StarWars()));
        w.colaStarWars3.setText(admin.printCola(admin.getCola3StarWars()));
        w.colaStarWarsRefuerzo.setText(admin.printCola(admin.getColaRefuerzoStarWars()));
        ia.start();
        admin.start();
        
    }
    
}
