/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.so;

import java.util.Random;

/**
 *
 * @author jesusmachta
 */
public class Personajes  {
    private int id;
    private int prioridad;
    private String nombre;
    private String pathImage;
    private int contadorPrioridad;
    private int[] estadisticas;
    private String empresa;
    private String pathPower;
    private String powerStarWars;
    private String powerStarTrek;
    
    private String[] nombresPersonajesStarWars = {"Darth Vader","Luke Skywalker", "Han Solo", "Obi-Wan Kenobi", 
        "Boba Fett", "Chewbacca","Palpatine","Leia Organa", "Yoda", "R2-D2", "Darth Maul", "Lando Calrissian", "Rey", "General Grievous", "Poe Dameron", "Qui-Gon Jinn", "C-3PO", "Kylo Ren", "Ahsoka Tano", "Padme Amidala"};
    
    private String[] nombresPersonajesStarTrek = { "James Tiberius Kirk","Spock", "Jean-Luc Picard","atheryn Janeway","Benjamin Sisko", 
        "Worf", "Charles Tucker III","Montgomery Scott","Michael Burnham","Jonathan Archer", "Miles O'Brien", "Chakotay", "William Riker","Leonard McCoy","Gul Duk", "Pavel Chekov", "Kira Nerys", "Nyota Uhara", "Data", "Odo"};
    
    private String[] pathPersonajesStarWars= {}; //aqui va el path de la imagen png con el nombre de la imagen igual al del nombre del personaje como esta arriba escrito
    private String[] pathPersonajesStarTrek = {};
    
    private String[] powersStarWars = {"", ""};
    private String[] powersStarTrek = {"",""};
    private String power;
    private boolean ganador;

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
    

    public Personajes(int id, String empresa) {
        this.id = id;
        this.empresa=empresa;
        this.nombrePersonaje();
        this.sacarEstadisticas();
        
    }
    
    public void nombrePersonaje(){
        Random random = new Random();
        int index= random.nextInt(15);
        
        if(this.getEmpresa().equals("StarWars")){
            this.setNombre(this.getNombresPersonajesStarWars()[index]); 
            this.setPathImage(this.getPathPersonajesStarWars()[index]);
           
            
        }else{
            this.setNombre(this.getNombresPersonajesStarTrek()[index]); 
            this.setPathImage(this.getPathPersonajesStarTrek()[index]);
        }
        
        
    }
    
    public void updatePower(){
        Random random = new Random(); 
        int index = random.nextInt(2) ;
//        System.out.println("Random" + index);
         if(this.getEmpresa().equals("StarWars")){
             
             this.setPower(this.getPowersStarWars()[index]); 
         }else if(this.getEmpresa().equals("StarTrek")){
             this.setPower(this.getPowersStarTrek()[index]); 
         }
    }
    
    public void sacarPrioridad(){
        int total = 0; 
        for (int i = 0; i < this.getEstadisticas().length; i++) {
            total += this.getEstadisticas()[i];
            
            
        }
        System.out.println("total"+total);
        
        if(total == 4 ||total == 5){
            this.setPrioridad(3); 
        }else if(total >= 6 && total <= 8){
            this.setPrioridad(2); 
        }else{
            this.setPrioridad(1); 
        }
    }
        
    public void sacarEstadisticas(){
        Random random = new Random();
        double randomValue = random.nextDouble();
//        System.out.println(randomValue);
        
        this.setEstadisticas(new int[4]);
//        for (int i=0; i<=3; i++){
//            
//        }
        
        if (randomValue < 0.6) {
            this.getEstadisticas()[0]= 3;
           
        } else if (randomValue < 0.8) {
            this.getEstadisticas()[0] = 1;
        } else {
            this.getEstadisticas()[0] = 2;
        }
        // ahora 1; 
        if (randomValue < 0.7) {
            this.getEstadisticas()[1]= 3;
        } else if (randomValue < 0.85) {
            this.getEstadisticas()[1] = 1;
        } else {
            this.getEstadisticas()[1] = 2;
        }
        // ahora 2; 
         if (randomValue < 0.5) {
             this.getEstadisticas()[2]= 3;
        } else if (randomValue < 0.75) {
            this.getEstadisticas()[2] = 1;
        } else {
            this.getEstadisticas()[2] = 2;
        }
         // ahora 3; 
          if (randomValue < 0.4) {
              this.getEstadisticas()[3]= 3;
        } else if (randomValue < 0.7) {
            this.getEstadisticas()[3] = 1;
        } else {
            this.getEstadisticas()[3] = 2;
        }
        
        this.sacarPrioridad();
        
        
    }
    
    public void subirPrioridad(){
      
        if(this.contadorPrioridad==8){
            
             if(this.getPrioridad() ==3){
              this.setPrioridad(2);
              
          }else if(this.getPrioridad()==2){
              this.setPrioridad(1);
              
          }else if(this.getPrioridad()==1){
              this.setPrioridad(1);
//              stay
          }
            
        }
       
         
         
  } 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pathImage
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * @param pathImage the pathImage to set
     */
    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    /**
     * @return the contadorPrioridad
     */
    public int getContadorPrioridad() {
        return contadorPrioridad;
    }

    /**
     * @param contadorPrioridad the contadorPrioridad to set
     */
    public void setContadorPrioridad(int contadorPrioridad) {
        this.contadorPrioridad = contadorPrioridad;
    }

    /**
     * @return the estadisticas
     */
    public int[] getEstadisticas() {
        return estadisticas;
    }

    /**
     * @param estadisticas the estadisticas to set
     */
    public void setEstadisticas(int[] estadisticas) {
        this.estadisticas = estadisticas;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the pathPower
     */
    public String getPathPower() {
        return pathPower;
    }

    /**
     * @param pathPower the pathPower to set
     */
    public void setPathPower(String pathPower) {
        this.pathPower = pathPower;
    }

    /**
     * @return the powerStarWars
     */
    public String getPowerStarWars() {
        return powerStarWars;
    }

    /**
     * @param powerStarWars the powerStarWars to set
     */
    public void setPowerStarWars(String powerStarWars) {
        this.powerStarWars = powerStarWars;
    }

    /**
     * @return the powerStarTrek
     */
    public String getPowerStarTrek() {
        return powerStarTrek;
    }

    /**
     * @param powerStarTrek the powerStarTrek to set
     */
    public void setPowerStarTrek(String powerStarTrek) {
        this.powerStarTrek = powerStarTrek;
    }

    /**
     * @return the nombresPersonajesStarWars
     */
    public String[] getNombresPersonajesStarWars() {
        return nombresPersonajesStarWars;
    }

    /**
     * @param nombresPersonajesStarWars the nombresPersonajesStarWars to set
     */
    public void setNombresPersonajesStarWars(String[] nombresPersonajesStarWars) {
        this.setNombresPersonajesStarWars(nombresPersonajesStarWars);
    }

    /**
     * @return the nombresPersonajesStarTrek
     */
    public String[] getNombresPersonajesStarTrek() {
        return nombresPersonajesStarTrek;
    }

    /**
     * @param nombresPersonajesStarTrek the nombresPersonajesStarTrek to set
     */
    public void setNombresPersonajesStarTrek(String[] nombresPersonajesStarTrek) {
        this.setNombresPersonajesStarTrek(nombresPersonajesStarTrek);
    }

    /**
     * @return the pathPersonajesStarWars
     */
    public String[] getPathPersonajesStarWars() {
        return pathPersonajesStarWars;
    }

    /**
     * @param pathPersonajesStarWars the pathPersonajesStarWars to set
     */
    public void setPathPersonajesStarWars(String[] pathPersonajesStarWars) {
        this.setPathPersonajesStarWars(pathPersonajesStarWars);
    }

    /**
     * @return the pathPersonajesStarTrek
     */
    public String[] getPathPersonajesStarTrek() {
        return pathPersonajesStarTrek;
    }

    /**
     * @param pathPersonajesStarTrek the pathPersonajesStarTrek to set
     */
    public void setPathPersonajesStarTrek(String[] pathPersonajesStarTrek) {
        this.setPathPersonajesStarTrek(pathPersonajesStarTrek);
    }

    /**
     * @return the powersStarTrek
     */
    public String[] getPowersStarTrek() {
        return powersStarTrek;
    }

    /**
     * @param powersStarTrek the powersStarTrek to set
     */
    public void setPowersStarTrek(String[] powersStarTrek) {
        this.setPowersStarTrek(powersStarTrek);
    }

    /**
     * @return the powersStarWars
     */
    public String[] getPowersStarWars() {
        return powersStarWars;
    }

    /**
     * @param powersStarWars the powersStarWars to set
     */
    public void setPowersStarWars(String[] powersStarWars) {
        this.setPowersStarWars(powersStarWars);
    }

    /**
     * @return the power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(String power) {
        this.power = power;
    }

  
        
        
        
    }

