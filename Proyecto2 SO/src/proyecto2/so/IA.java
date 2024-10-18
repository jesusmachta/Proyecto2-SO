/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2.so;

import Estructuras.Node;
import Estructuras.Queue;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author jesusmachta
 */
public class IA extends Thread {

    private int contadorParejas = 0;
    private Main main = new Main();
    private int dayDuration;
    private int contadorTorneos = 1;
    private String edo;
    private String[] nombresPersonajesStarWars = { "Darth Vader", "Luke Skywalker", "Han Solo", "Obi-Wan Kenobi",
            "Boba Fett", "Chewbacca", "Palpatine", "Leia Organa", "Yoda", "R2-D2", "Darth Maul", "Lando Calrissian",
            "Rey", "General Grievous", "Poe Dameron", "Qui-Gon Jinn", "C-3PO", "Kylo Ren", "Ahsoka Tano",
            "Padme Amidala" };

    private String[] nombresPersonajesStarTrek = { "James Tiberius Kirk", "Spock", "Jean-Luc Picard",
            "Katheryn Janeway", "Benjamin Sisko",
            "Worf", "Charles Tucker III", "Montgomery Scott", "Michael Burnham", "Jonathan Archer", "Miles O'Brien",
            "Chakotay", "William Riker", "Leonard McCoy", "Gul Duk", "Pavel Chekov", "Kira Nerys", "Nyota Uhara",
            "Data", "Odo" };

    private String[] pathPersonajesStarWars = {
            "src//ImgPersonajesStarWars//Darth Vader.png",
            "src//ImgPersonajesStarWars//Luke Skywalker.png",
            "src//ImgPersonajesStarWars//Han Solo.png",
            "src//ImgPersonajesStarWars//Obi-Wan Kenobi.png",
            "src//ImgPersonajesStarWars//Boba Fett.png",
            "src//ImgPersonajesStarWars//Chewbacca.png",
            "src//ImgPersonajesStarWars//Palpatine.png",
            "src//ImgPersonajesStarWars//Leia Organa.png",
            "src//ImgPersonajesStarWars//Yoda.png",
            "src//ImgPersonajesStarWars//R2-D2.png",
            "src//ImgPersonajesStarWars//Darth Maul.png",
            "src//ImgPersonajesStarWars//Lando Calrissian.png",
            "src//ImgPersonajesStarWars//Rey.png",
            "src//ImgPersonajesStarWars//General Grievous.png",
            "src//ImgPersonajesStarWars//Poe Dameron.png",
            "src//ImgPersonajesStarWars//Qui-Gon Jinn.png",
            "src//ImgPersonajesStarWars//C-3PO.png",
            "src//ImgPersonajesStarWars//Kylo Ren.png",
            "src//ImgPersonajesStarWars//Ahsoka Tano.png",
            "src//ImgPersonajesStarWars//Padme Amidala.png"
    };

    private String[] pathPersonajesStarTrek = {
            "src//ImgPersonajesStarTrek//James Tiberius Kirk.png",
            "src//ImgPersonajesStarTrek//Spock.png",
            "src//ImgPersonajesStarTrek//Jean-Luc Picard.png",
            "src//ImgPersonajesStarTrek//Katheryn Janeway.png",
            "src//ImgPersonajesStarTrek//Benjamin Sisko.png",
            "src//ImgPersonajesStarTrek//Worf.png",
            "src//ImgPersonajesStarTrek//Charles Tucker III.png",
            "src//ImgPersonajesStarTrek//Montgomery Scott.png",
            "src//ImgPersonajesStarTrek//Michael Burnham.png",
            "src//ImgPersonajesStarTrek//Jonathan Archer.png",
            "src//ImgPersonajesStarTrek//Miles O'Brien.png",
            "src//ImgPersonajesStarTrek//Chakotay.png",
            "src//ImgPersonajesStarTrek//William Riker.png",
            "src//ImgPersonajesStarTrek//Leonard McCoy.png",
            "src//ImgPersonajesStarTrek//Gul Duk.png",
            "src//ImgPersonajesStarTrek//Pavel Chekov.png",
            "src//ImgPersonajesStarTrek//Kira Nerys.png",
            "src//ImgPersonajesStarTrek//Nyota Uhara.png",
            "src//ImgPersonajesStarTrek//Data.png",
            "src//ImgPersonajesStarTrek//Odo.png"
    };

    public IA(int dayDuration) {
        this.dayDuration = dayDuration;

    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    @Override
    public void run() {
        while (true) {
            try {
                main.ia.setDayDuration(Integer.parseInt(main.w.t1.getText()));
                Torneo torneo = main.ia.finalizarTorneo();
                this.checkCounter(); // si ya pasaron 2 parejas el genera una pareja de jugadores StarWars y StarTrek
                // this.finalizarTorneo(); //para selccionar al ganador o empateo o no aplica
                main.ia.sumadorCOntadoresPersonajes();
                main.ia.contadorTorneos++;

                ImageIcon mentira = new ImageIcon("src//Imagenes//trofeo.png");
                ImageIcon falso = new ImageIcon("src//Imagenes//Sworrd.png");

                this.edo = "Esperando";
                main.w.doing.setText(edo);

                main.w.StarWarsWL.setIcon(mentira);
                main.w.StarTrekWL.setIcon(mentira);
                main.w.poderStarTrek.setIcon(falso);
                main.w.poderStarWars.setIcon(falso);

                for (int i = 0; i < pathPersonajesStarWars.length; i++) {
                    ImageIcon img = new ImageIcon(pathPersonajesStarWars[i]);
                    main.w.PeleaStarWars.setIcon(img);
                    main.w.nombrePersonajeStarWars.setText(nombresPersonajesStarWars[i]);
                    main.w.idPersonajeStarWars.setText("Z" + i);

                    ImageIcon img2 = new ImageIcon(pathPersonajesStarTrek[i]);
                    main.w.PeleaStarTrek.setIcon(img2);
                    main.w.nombrePersonajeStarTrek.setText(nombresPersonajesStarTrek[i]);
                    main.w.idPersonajeStarTrek.setText("S" + i);

                    sleep(60);

                }
                // sleep(main.ia.getDayDuration() * 100);

            } catch (InterruptedException ex) {
                Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void checkCounter() throws InterruptedException {
        if (getContadorParejas() == 2) {
            getMain().admin.generatePersonajes();
            this.setContadorParejas(0);
        }
    }

    public String crearTipoDeTorneo() {
        String tipoDeTorneo;
        this.setContadorParejas(this.getContadorParejas() + 1);
        Random random = new Random();
        double randomValue = random.nextDouble();
        if (randomValue < 0.4) {
            tipoDeTorneo = "ganadores";

        } else if (randomValue < 0.67) {
            tipoDeTorneo = "empate";
        } else {
            tipoDeTorneo = "refuerzo";

        }
        return tipoDeTorneo;

    }

    public Torneo finalizarTorneo() throws InterruptedException {

        // this.edo = "Esperando";
        // main.w.doing.setText(edo);
        Torneo torneo = main.admin.getTorneo();

        main.w.colaStarTrekRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarTrek()));
        main.w.colaStarTrek1.setText(main.admin.printCola(main.admin.getCola1StarTrek()));
        main.w.colaStarTrek2.setText(main.admin.printCola(main.admin.getCola2StarTrek()));
        main.w.colaStarTrek3.setText(main.admin.printCola(main.admin.getCola3StarTrek()));

        main.w.colaStarWarsRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarWars()));
        main.w.colaStarWars1.setText(main.admin.printCola(main.admin.getCola1StarWars()));
        main.w.colaStarWars2.setText(main.admin.printCola(main.admin.getCola2StarWars()));
        main.w.colaStarWars3.setText(main.admin.printCola(main.admin.getCola3StarWars()));

        String tipoDeTorneo = this.crearTipoDeTorneo();

        // poderStarTrek
        ImageIcon imageIconStarTrek = new ImageIcon(torneo.getpStarTrek().getPathImage());
        ImageIcon imageIconStarWars = new ImageIcon(torneo.getpStarWars().getPathImage());
        getMain().w.PeleaStarTrek.setIcon(imageIconStarTrek);
        getMain().w.idPersonajeStarTrek.setText("S" + torneo.getpStarTrek().getId());
        getMain().w.nombrePersonajeStarTrek.setText(torneo.getpStarTrek().getNombre());
        getMain().w.PeleaStarWars.setIcon(imageIconStarWars);
        getMain().w.idPersonajeStarWars.setText("Z" + torneo.getpStarWars().getId());
        getMain().w.nombrePersonajeStarWars.setText(torneo.getpStarWars().getNombre());

        ImageIcon imageGanador = new ImageIcon("src//Imagenes//trofeo.png");
        ImageIcon imageKO = new ImageIcon("src//Imagenes//ko.png");
        ImageIcon empate = new ImageIcon("src//Imagenes//guantes.png");
        ImageIcon refuerzos = new ImageIcon("src//Imagenes//pesas.png");

        ImageIcon poder1 = new ImageIcon("src//Imagenes//Nave.png");
        ImageIcon poder2 = new ImageIcon("src//Imagenes//Sable.png");
        ImageIcon poder3 = new ImageIcon("src//Imagenes//Pistola.png");
        ImageIcon poder4 = new ImageIcon("src//Imagenes//Soran.png");

        main.admin.mutex.acquire();

        if (tipoDeTorneo.equals("ganadores")) {
            // sleep(main.ia.getDayDuration()*300);
            torneo.getpStarWars().updatePower();
            torneo.getpStarTrek().updatePower();
            this.edo = "Decidiendo";
            main.w.doing.setText(edo);
            sleep(main.ia.getDayDuration() * 300);
            this.edo = "Ganador";
            main.w.doing.setText(edo);

            if (torneo.getpStarWars().getPower().equals("Sable")
                    && torneo.getpStarTrek().getPower().equals("Soran")) {

                torneo.getpStarWars().setGanador(true);
                main.w.poderStarWars.setIcon(poder2);
                main.w.StarWarsWL.setIcon(imageGanador);

                torneo.getpStarTrek().setGanador(false);
                main.w.StarTrekWL.setIcon(imageKO);
                main.w.poderStarTrek.setIcon(poder4);

                main.admin.getGanadoresStarWars().enqueue(torneo.getpStarWars());

                main.w.ganadorStarTrek.setText(main.admin.printCola(main.admin.getGanadoresStarTrek()));
                main.w.ganadorStarWars.setText(main.admin.printCola(main.admin.getGanadoresStarWars()));

                main.w.cantGanadoresStarTrek.setText(Integer.toString(main.admin.getGanadoresStarTrek().getSize()));
                main.w.cantGanadoresStarWars.setText(Integer.toString(main.admin.getGanadoresStarWars().getSize()));

            } else if (torneo.getpStarWars().getPower().equals("Pistola")
                    && torneo.getpStarTrek().getPower().equals("Nave")) {

                torneo.getpStarWars().setGanador(true);
                main.w.StarWarsWL.setIcon(imageGanador);
                main.w.poderStarWars.setIcon(poder3);

                torneo.getpStarTrek().setGanador(false);
                main.w.StarTrekWL.setIcon(imageKO);
                main.w.poderStarTrek.setIcon(poder1);

                main.admin.getGanadoresStarWars().enqueue(torneo.getpStarWars());

                main.w.ganadorStarTrek.setText(main.admin.printCola(main.admin.getGanadoresStarTrek()));
                main.w.ganadorStarWars.setText(main.admin.printCola(main.admin.getGanadoresStarWars()));

                main.w.cantGanadoresStarTrek.setText(Integer.toString(main.admin.getGanadoresStarTrek().getSize()));
                main.w.cantGanadoresStarWars.setText(Integer.toString(main.admin.getGanadoresStarWars().getSize()));

            } else if (torneo.getpStarWars().getPower().equals("Pistola")
                    && torneo.getpStarTrek().getPower().equals("Soran")) {

                torneo.getpStarWars().setGanador(false);
                main.w.StarWarsWL.setIcon(imageKO);
                main.w.poderStarWars.setIcon(poder3);

                torneo.getpStarTrek().setGanador(true);
                main.w.StarTrekWL.setIcon(imageGanador);
                main.w.poderStarTrek.setIcon(poder4);
                main.admin.getGanadoresStarTrek().enqueue(torneo.getpStarTrek());

                main.w.ganadorStarTrek.setText(main.admin.printCola(main.admin.getGanadoresStarTrek()));
                main.w.ganadorStarWars.setText(main.admin.printCola(main.admin.getGanadoresStarWars()));

                main.w.cantGanadoresStarTrek.setText(Integer.toString(main.admin.getGanadoresStarTrek().getSize()));
                main.w.cantGanadoresStarWars.setText(Integer.toString(main.admin.getGanadoresStarWars().getSize()));

            } else if (torneo.getpStarWars().getPower().equals("Sable")
                    && torneo.getpStarTrek().getPower().equals("Nave")) {

                torneo.getpStarWars().setGanador(false);
                main.w.StarWarsWL.setIcon(imageKO);
                main.w.poderStarWars.setIcon(poder2);

                torneo.getpStarTrek().setGanador(true);
                main.w.StarTrekWL.setIcon(imageGanador);
                main.w.poderStarTrek.setIcon(poder1);
                main.admin.getGanadoresStarTrek().enqueue(torneo.getpStarTrek());

                main.w.ganadorStarTrek.setText(main.admin.printCola(main.admin.getGanadoresStarTrek()));
                main.w.ganadorStarWars.setText(main.admin.printCola(main.admin.getGanadoresStarWars()));

                main.w.cantGanadoresStarTrek.setText(Integer.toString(main.admin.getGanadoresStarTrek().getSize()));
                main.w.cantGanadoresStarWars.setText(Integer.toString(main.admin.getGanadoresStarWars().getSize()));

            }
            sleep(main.ia.getDayDuration() * 700);
        } else if (tipoDeTorneo.equals("empate")) {
            torneo.getpStarTrek().setPrioridad(1);
            main.admin.getCola1StarTrek().enqueue(torneo.getpStarTrek());

            torneo.getpStarWars().setPrioridad(1);
            main.admin.getCola1StarWars().enqueue(torneo.getpStarWars());
            this.edo = "Decidiendo";
            main.w.doing.setText(edo);
            sleep(main.ia.getDayDuration() * 700);
            main.w.StarWarsWL.setIcon(empate);
            main.w.StarTrekWL.setIcon(empate);

            this.edo = "Empate";
            main.w.doing.setText(edo);
            sleep(main.ia.getDayDuration() * 300);

        } else {
            main.admin.getColaRefuerzoStarTrek().enqueue(torneo.getpStarTrek());
            main.admin.getColaRefuerzoStarWars().enqueue(torneo.getpStarWars());
            this.edo = "Decidiendo";
            main.w.doing.setText(edo);
            sleep(main.ia.getDayDuration() * 700);
            main.w.StarWarsWL.setIcon(refuerzos);
            main.w.StarTrekWL.setIcon(refuerzos);
            this.edo = "Refuerzo";
            main.w.doing.setText(edo);
            sleep(main.ia.getDayDuration() * 300);
            main.w.colaStarTrekRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarTrek()));
            main.w.colaStarWarsRefuerzo.setText(main.admin.printCola(main.admin.getColaRefuerzoStarWars()));

        }

        main.w.colaStarTrek1.setText(main.admin.printCola(main.admin.getCola1StarTrek()));
        main.w.colaStarTrek2.setText(main.admin.printCola(main.admin.getCola2StarTrek()));
        main.w.colaStarTrek3.setText(main.admin.printCola(main.admin.getCola3StarTrek()));

        main.w.colaStarWars1.setText(main.admin.printCola(main.admin.getCola1StarWars()));
        main.w.colaStarWars2.setText(main.admin.printCola(main.admin.getCola2StarWars()));
        main.w.colaStarWars3.setText(main.admin.printCola(main.admin.getCola3StarWars()));
        main.admin.colaRefuerzoSubir();

        main.admin.mutex.release();
        // main.admin.colaRefuerzoSubir();
        return torneo;
    }

    public void sumadorCOntadoresPersonajes() {
        Node aux;
        for (int i = 0; i < main.admin.getCola2StarTrek().getSize(); i++) {
            aux = main.admin.getCola2StarTrek().getpFirst();
            ((Personajes) aux.getData()).setContadorPrioridad(((Personajes) aux.getData()).getContadorPrioridad() + 1);
            if (((Personajes) aux.getData()).getContadorPrioridad() == 8) {
                ((Personajes) aux.getData()).setContadorPrioridad(0);
                main.admin.getCola1StarTrek().enqueue(aux.getData());

                main.admin.getCola2StarTrek().dequeue();

            } else {
                main.admin.getCola2StarTrek().dequeue();
                main.admin.getCola2StarTrek().enqueue(aux.getData());
            }
        }
        for (int i = 0; i < main.admin.getCola3StarTrek().getSize(); i++) {
            aux = main.admin.getCola3StarTrek().getpFirst();
            ((Personajes) aux.getData()).setContadorPrioridad(((Personajes) aux.getData()).getContadorPrioridad() + 1);
            if (((Personajes) aux.getData()).getContadorPrioridad() == 8) {
                ((Personajes) aux.getData()).setContadorPrioridad(0);
                main.admin.getCola2StarTrek().enqueue(aux.getData());

                main.admin.getCola3StarTrek().dequeue();

            } else {
                main.admin.getCola3StarTrek().dequeue();
                main.admin.getCola3StarTrek().enqueue(aux.getData());
            }
        }
        Node aux2;
        for (int i = 0; i < main.admin.getCola2StarWars().getSize(); i++) {
            aux2 = main.admin.getCola2StarWars().getpFirst();
            ((Personajes) aux2.getData())
                    .setContadorPrioridad(((Personajes) aux2.getData()).getContadorPrioridad() + 1);
            if (((Personajes) aux2.getData()).getContadorPrioridad() == 8) {
                ((Personajes) aux2.getData()).setContadorPrioridad(0);

                main.admin.getCola1StarWars().enqueue(aux2.getData());

                main.admin.getCola2StarWars().dequeue();

            } else {
                main.admin.getCola2StarWars().dequeue();
                main.admin.getCola2StarWars().enqueue(aux2.getData());
            }
        }

        Node aux3;
        for (int i = 0; i < main.admin.getCola3StarWars().getSize(); i++) {
            aux3 = main.admin.getCola3StarWars().getpFirst();
            ((Personajes) aux3.getData())
                    .setContadorPrioridad(((Personajes) aux3.getData()).getContadorPrioridad() + 1);
            if (((Personajes) aux3.getData()).getContadorPrioridad() == 8) {
                ((Personajes) aux3.getData()).setContadorPrioridad(0);

                main.admin.getCola2StarWars().enqueue(aux3.getData());
                // main.admin.getCola2Nintendo().enqueue(aux3.getData());

                main.admin.getCola3StarWars().dequeue();

            } else {
                main.admin.getCola3StarWars().dequeue();
                main.admin.getCola3StarWars().enqueue(aux3.getData());
            }
        }

    }

    //
    /**
     * @return the contadorParejas
     */
    public int getContadorParejas() {
        return contadorParejas;
    }

    /**
     * @param contadorParejas the contadorParejas to set
     */
    public void setContadorParejas(int contadorParejas) {
        this.contadorParejas = contadorParejas;
    }

    /**
     * @return the contadorTorneos
     */
    public int getContadorTorneos() {
        return contadorTorneos;
    }

    /**
     * @param contadorTorneos the contadorTorneos to set
     */
    public void setContadorTorneos(int contadorTorneos) {
        this.contadorTorneos = contadorTorneos;
    }

}
