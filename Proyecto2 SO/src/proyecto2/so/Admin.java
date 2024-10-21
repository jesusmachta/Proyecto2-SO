/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.so;

import Estructuras.Node;
import Estructuras.Queue;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proyecto2.so.Main.admin;
import static proyecto2.so.Main.w;

/**
 *
 * @author jesusmachta & andreapinto
 * 
 */
public class Admin extends Thread{
    
    Main main = new Main(); 
    private Queue cola1StarWars = new Queue(); 
    private Queue cola2StarWars  = new Queue(); 
    private Queue cola3StarWars  = new Queue(); 
    private Queue colaRefuerzoStarWars  = new Queue(); 
    private Queue cola1StarTrek  = new Queue(); 
    private Queue cola2StarTrek  = new Queue();
    private Queue cola3StarTrek  = new Queue(); 
    private Queue colaRefuerzoStarTrek  = new Queue();  
    private int contadorStarWars = 0; // ES PARA EL ID
    private int contadorStarTrek = 0; // ES PARA EL ID
    private Queue ganadoresStarWars = new Queue();
    private Queue ganadoresStarTrek = new Queue(); 
    public Semaphore mutex = new Semaphore(1); 
//    private String edo;
    
    
    
    
    @Override
    public void run(){
        while(true){
           
            
            try {
                
                main.admin.actualizar();
                sleep(main.ia.getDayDuration()*2000);
                this.generatePersonajes();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
        
        
        
//       
        
//        try {
////            this.crearPersonajes(); // crea los primeros juegos 
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
     }
    
    public void actualizar() throws InterruptedException{
        
                main.w.colaStarTrekRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarTrek()));
                main.w.colaStarTrek1.setText(main.admin.printCola(main.admin.getCola1StarTrek()));
                main.w.colaStarTrek2.setText(main.admin.printCola(main.admin.getCola2StarTrek()));
                main.w.colaStarTrek3.setText(main.admin.printCola(main.admin.getCola3StarTrek()));

                main.w.colaStarWarsRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarWars()));
                main.w.colaStarWars1.setText(main.admin.printCola(main.admin.getCola1StarWars()));
                main.w.colaStarWars2.setText(main.admin.printCola(main.admin.getCola2StarWars()));
                main.w.colaStarWars3.setText(main.admin.printCola(main.admin.getCola3StarWars()));
       
                
    }
    
    
    public void colaRefuerzoSubir() throws InterruptedException{
        Random random = new Random(); 
        double randomValue = random.nextDouble();
        
        if(randomValue<0.4){
//            main.admin.mutex.acquire();
            if(!main.admin.colaRefuerzoStarTrek.isEmpty()){
                Node aux=  main.admin.colaRefuerzoStarTrek.dequeue();
                main.admin.cola1StarTrek.enqueue(aux.getData());
            }
            
            if (!main.admin.colaRefuerzoStarWars.isEmpty()) {
                 Node aux2=  main.admin.colaRefuerzoStarWars.dequeue();
                main.admin.cola1StarWars.enqueue(aux2.getData());
//                main.admin.mutex.release();
                
            }
            
            
           
        }
       
        
    }
// public Personajes(int id, String empresa)
    
     public String printCola(Queue cola){
        String p = ""; 
        Node aux1 = cola.peek();
        String empresa = ""; 
        if(aux1 != null){
        empresa = ((Personajes)aux1.getData()).getEmpresa();} 
        String charToAdd = ""; 
        if(aux1 != null){
        if(empresa.equals("StarWars")){
            charToAdd = "Z"; 
        }else{
            charToAdd = "S"; 
        }}
        
        if(cola.isEmpty()){
            System.out.println("La cola está vacía!");
        }else{
            for (int i = 0; i < cola.getSize(); i++) {
                Node aux = cola.peek(); 
                
                p += charToAdd+((Personajes)aux.getData()).getId() + "->";
               cola.dequeue();  
                cola.enqueue(((Personajes)aux.getData()));
            }
        }return p; 
    }
    
     
//     public String printGanadores(Queue cola){
//        
//        String p= "";
//      
//        if(cola.isEmpty()){
//            System.out.println("La cola está vacía!");
//        }else{
//            for (int i = 0; i < cola.getSize(); i++) {
//                Node aux = cola.peek(); 
//                
//                p += ((Personajes)aux.getData()).getId() + "->";
//               cola.dequeue();  
//                cola.enqueue(((Personajes)aux.getData()));
//            }
//        }return p; 
//    }
//     public void cambiarPrioridad(){
////         if(main.ia.)
//     }
    
    public void crearPersonajes() throws InterruptedException{
        System.out.println("FALGGGGG 1");
        //StarWars
        for (int i = 0; i < 10; i++) {
            Personajes p = new Personajes(getContadorStarWars(), "StarWars"); 
//            this.contadorStarWars ++; 
            System.out.println(p.getNombre());
            System.out.println(p.getEmpresa());
            System.out.println(p.getPrioridad());
            main.admin.mutex.acquire(); 
            if (p.getPrioridad() == 1) {
                main.admin.getCola1StarWars().enqueue(p);
            }else if(p.getPrioridad() == 2){
                main.admin.getCola2StarWars().enqueue(p);
            }else{
                main.admin.getCola3StarWars().enqueue(p); 
            }
            main.admin.mutex.release();
            main.admin.setContadorStarWars(this.getContadorStarWars() + 1); 
            
        }
        
        
        // StarTrek 
         for (int i = 0; i < 10; i++) {
            Personajes pe = new Personajes(getContadorStarTrek(), "StarTrek");
//            this.contadorStarTrek++; 
            main.admin.mutex.acquire();
            if (pe.getPrioridad() == 1) {
                main.admin.getCola1StarTrek().enqueue(pe);
            }else if(pe.getPrioridad() == 2){
                main.admin.getCola2StarTrek().enqueue(pe);
            }else{
                main.admin.getCola3StarTrek().enqueue(pe); 
            }
            main.admin.mutex.release();
            main.admin.setContadorStarTrek(this.getContadorStarTrek() + 1); 
            
        }
//         mutex.release();
         // ahora revisamos si alguna lista esta vacia: 
         // StarTrek: 
//         mutex.acquire();
          System.out.println("COLA 1 StarWars: ");
         System.out.println(this.cola1StarWars.getSize());
          System.out.println("COLA 2 StarWars: ");
         System.out.println(this.cola2StarWars.getSize());
          System.out.println("COLA 3 StarWars: ");
         System.out.println(this.cola3StarWars.getSize());
         
         System.out.println("COLA 1 StarTrek: ");
         System.out.println(this.cola1StarTrek.getSize());
          System.out.println("COLA 2 StarTrek: ");
         System.out.println(this.cola2StarTrek.getSize());
          System.out.println("COLA 3 StarTrek: ");
         System.out.println(this.cola3StarTrek.getSize());
       
                main.admin.mutex.acquire();
         this.setContadorStarTrek(this.revisarColasVacias(getCola1StarTrek(), 1, getContadorStarTrek(), "StarTrek"));
         this.setContadorStarTrek(this.revisarColasVacias(getCola2StarTrek(), 2, getContadorStarTrek(), "StarTrek"));
         this.setContadorStarTrek(this.revisarColasVacias(getCola3StarTrek(), 3, getContadorStarTrek(), "StarTrek"));
         
         // Star Wars
         this.setContadorStarWars(this.revisarColasVacias(getCola1StarWars(), 1, getContadorStarWars(), "StarWars")); 
         this.setContadorStarWars(this.revisarColasVacias(getCola2StarWars(), 2, getContadorStarWars(), "StarWars")); 
         this.setContadorStarWars(this.revisarColasVacias(getCola3StarWars(), 3, getContadorStarWars(), "StarWars")); 
                 main.admin.mutex.release();
         System.out.println("DESPUES DE LLENAR: ");
         System.out.println("COLA 1 StarWars: ");
         System.out.println(this.cola1StarWars.getSize());
          System.out.println("COLA 2 StarWars: ");
         System.out.println(this.cola2StarWars.getSize());
          System.out.println("COLA 3 StarWars: ");
         System.out.println(this.cola3StarWars.getSize());
          System.out.println("COLA 1 StarTrek: ");
         System.out.println(this.cola1StarTrek.getSize());
          System.out.println("COLA 2 StarTrek: ");
         System.out.println(this.cola2StarTrek.getSize());
          System.out.println("COLA 3 StarTrek: ");
         System.out.println(this.cola3StarTrek.getSize());
       
         

        
    }
    
    public int revisarColasVacias(Queue cola, int prioridad, int contadorEmpresa, String empresa) throws InterruptedException{
//      mutex.acquire();
        System.out.println("FLAGGGG 3!");
        if(cola.isEmpty()){

            for (int i = 0; i < 5; i++) {
                Personajes p = new Personajes(contadorEmpresa, empresa); 
                p.setPrioridad(prioridad);
                cola.enqueue(p);
                contadorEmpresa ++; 
                System.out.println("COLA QUE ENTRA PARA LLENAR: ");
                System.out.println(prioridad);
                System.out.println(empresa);
                System.out.println("CONTADOR EMPRESA: ");
                System.out.println(contadorEmpresa);
            }
//            mutex.release();
        }return contadorEmpresa; 
    }
    
    public Torneo getTorneo() throws InterruptedException{
        Torneo torneo = new Torneo();
        main.admin.mutex.acquire();
        System.out.println("Coloa StarTrek antes");
        System.out.println(admin.printCola(admin.cola1StarTrek));

        while(torneo.getpStarTrek() == null){
        if (!this.getCola1StarTrek().isEmpty()) {
            torneo.setpStarTrek((Personajes)this.getCola1StarTrek().dequeue().getData());
        System.out.println("Coloa StarTrek Despues de quitar");
        System.out.println(admin.printCola(admin.cola1StarTrek));
        }else if (!this.getCola2StarTrek().isEmpty()) {
            torneo.setpStarTrek((Personajes)this.getCola2StarTrek().dequeue().getData());
        System.out.println("Coloa StarTrek Despues de quitar");
        System.out.println(admin.printCola(admin.cola1StarTrek));
        }else if(!this.getCola3StarTrek().isEmpty()){
            torneo.setpStarTrek((Personajes)this.getCola3StarTrek().dequeue().getData());
        System.out.println("Coloa StarTrek Despues de quitar");
        System.out.println(admin.printCola(admin.cola1StarTrek));
        }}
        
        while(torneo.getpStarWars()== null){
        if (!this.getCola1StarWars().isEmpty()) {
            torneo.setpStarWars((Personajes)this.getCola1StarWars().dequeue().getData()); 
        }else if(!this.getCola1StarWars().isEmpty()){
           torneo.setpStarWars((Personajes)this.getCola2StarWars().dequeue().getData()); 
        }else if(!this.getCola3StarWars().isEmpty()){
            torneo.setpStarWars((Personajes)this.getCola3StarWars().dequeue().getData());
        }}
        main.admin.mutex.release();
         return torneo; 
    }
 
    public void generatePersonajes() throws InterruptedException{
        Random random = new Random(); 
        double randomValue = random.nextDouble();
        if(randomValue<0.8){
//            Personajes p = new Personajes(main.admin.getContadorStarWars(), "StarWars"); 
            main.admin.mutex.acquire();
            
            Personajes p = new Personajes(main.admin.getContadorStarWars(), "StarWars"); 
            if(p.getPrioridad() == 1 ){
                if (main.admin.getCola1StarWars().getpLast() != null) {
                    if (((Personajes)main.admin.getCola1StarWars().getpLast().getData()).getId() != p.getId()) {
                       main.admin.getCola1StarWars().enqueue(p); 
                    }
                }else{
                    main.admin.getCola1StarWars().enqueue(p);
                }
            }else if(p.getPrioridad() == 2){
                if (main.admin.getCola2StarWars().getpLast() != null) {
                    if (((Personajes)main.admin.getCola2StarWars().getpLast().getData()).getId() != p.getId()) {
                        main.admin.getCola2StarWars().enqueue(p);
                    }
                }else{
                    main.admin.getCola2StarWars().enqueue(p);
                }
                
            }else{
                if (main.admin.getCola3StarWars().getpLast() != null) {
                    if (((Personajes)main.admin.getCola3StarWars().getpLast().getData()).getId() != p.getId()) {
                        main.admin.getCola3StarWars().enqueue(p);
                    }
                }else{
                    main.admin.getCola3StarWars().enqueue(p);
                }
            }

            
            
            Personajes p2 = new Personajes(main.admin.getContadorStarTrek(), "StarTrek"); 
//            main.admin.mutex.acquire();
            if(p2.getPrioridad() ==1){
                if(main.admin.getCola1StarTrek().getpLast() != null){
                  if (((Personajes)main.admin.getCola1StarTrek().getpLast().getData()).getId() != p2.getId()){
                     main.admin.getCola1StarTrek().enqueue(p2);   
                  }  
                }else{
                      main.admin.getCola1StarTrek().enqueue(p2); 
                  }
                 
            }else if(p2.getPrioridad() == 2){
                if(main.admin.getCola2StarTrek().getpLast() != null){
                    if (((Personajes)main.admin.getCola2StarTrek().getpLast().getData()).getId() != p2.getId()){
                      main.admin.getCola2StarTrek().enqueue(p2);   
                    }
                }else{
                        main.admin.getCola2StarTrek().enqueue(p2); 
                    }
 
            }else{
                if(main.admin.getCola3StarTrek().getpLast() != null){
                    if(((Personajes)main.admin.getCola3StarTrek().getpLast().getData()).getId() != p2.getId()){
                       main.admin.getCola3StarTrek().enqueue(p2);  
                    }
//                    
                }else{
                        main.admin.getCola3StarTrek().enqueue(p2); 
                    } 
            }
            
            main.admin.mutex.release(); 
            int a = main.admin.getContadorStarWars(); 
            main.admin.setContadorStarWars(a + 1); 
            int b = main.admin.getContadorStarTrek(); 
            main.admin.setContadorStarTrek(b + 1); 

        }

    }
    
    
    
    /**
     * @return the cola1StarWars
     */
    public Queue getCola1StarWars() {
        return cola1StarWars;
    }

    /**
     * @param cola1StarWars the cola1StarWars to set
     */
    public void setCola1StarWars(Queue cola1StarWars) {
        this.cola1StarWars = cola1StarWars;
    }

    /**
     * @return the cola2StarWars
     */
    public Queue getCola2StarWars() {
        return cola2StarWars;
    }

    /**
     * @param cola2StarWars the cola2StarWars to set
     */
    public void setCola2StarWars(Queue cola2StarWars) {
        this.cola2StarWars = cola2StarWars;
    }

    /**
     * @return the cola3StarWars
     */
    public Queue getCola3StarWars() {
        return cola3StarWars;
    }

    /**
     * @param cola3StarWars the cola3StarWars to set
     */
    public void setCola3StarWars(Queue cola3StarWars) {
        this.cola3StarWars = cola3StarWars;
    }

    /**
     * @return the colaRefuerzoStarWars
     */
    public Queue getColaRefuerzoStarWars() {
        return colaRefuerzoStarWars;
    }

    /**
     * @param colaRefuerzoStarWars the colaRefuerzoStarWars to set
     */
    public void setColaRefuerzoStarWars(Queue colaRefuerzoStarWars) {
        this.colaRefuerzoStarWars = colaRefuerzoStarWars;
    }

    /**
     * @return the cola1StarTrek
     */
    public Queue getCola1StarTrek() {
        return cola1StarTrek;
    }

    /**
     * @param cola1StarTrek the cola1StarTrek to set
     */
    public void setCola1StarTrek(Queue cola1StarTrek) {
        this.cola1StarTrek = cola1StarTrek;
    }

    /**
     * @return the cola2StarTrek
     */
    public Queue getCola2StarTrek() {
        return cola2StarTrek;
    }

    /**
     * @param cola2StarTrek the cola2StarTrek to set
     */
    public void setCola2StarTrek(Queue cola2StarTrek) {
        this.cola2StarTrek = cola2StarTrek;
    }

    /**
     * @return the cola3StarTrek
     */
    public Queue getCola3StarTrek() {
        return cola3StarTrek;
    }

    /**
     * @param cola3StarTrek the cola3StarTrek to set
     */
    public void setCola3StarTrek(Queue cola3StarTrek) {
        this.cola3StarTrek = cola3StarTrek;
    }

    /**
     * @return the colaRefuerzoStarTrek
     */
    public Queue getColaRefuerzoStarTrek() {
        return colaRefuerzoStarTrek;
    }

    /**
     * @param colaRefuerzaStarTrek the colaRefuerzoStarTrek to set
     */
    public void setColaRefuerzoStarTrek(Queue colaRefuerzoStarTrek) {
        this.colaRefuerzoStarTrek = colaRefuerzoStarTrek;
    }

    /**
     * @return the contadorStarWars
     */
    public int getContadorStarWars() {
        return contadorStarWars;
    }

    /**
     * @param contadorStarWars the contadorStarWars to set
     */
    public void setContadorStarWars(int contadorStarWars) {
        this.contadorStarWars = contadorStarWars;
    }

    /**
     * @return the contadorStarTrek
     */
    public int getContadorStarTrek() {
        return contadorStarTrek;
    }

    /**
     * @param contadorStarTrek the contadorStarTrek to set
     */
    public void setContadorStarTrek(int contadorStarTrek) {
        this.contadorStarTrek = contadorStarTrek;
    }

    /**
     * @return the ganadoresStarWars
     */
    public Queue getGanadoresStarWars() {
        return ganadoresStarWars;
    }

    /**
     * @param ganadoresStarWars the ganadoresStarWars to set
     */
    public void setGanadoresStarWars(Queue ganadoresStarWars) {
        this.ganadoresStarWars = ganadoresStarWars;
    }

    /**
     * @return the ganadoresStarTrek
     */
    public Queue getGanadoresStarTrek() {
        return ganadoresStarTrek;
    }

    /**
     * @param ganadoresStarTrek the ganadoresStarTrek to set
     */
    public void setGanadoresStarTrek(Queue ganadoresStarTrek) {
        this.ganadoresStarTrek = ganadoresStarTrek;
    }    
}
