package be.bxl.formation.models;
import java.util.Scanner;

import static java.lang.System.*;

public class Duree {
    Scanner sc = new Scanner(System.in);
    private int jours;
    private int heures;
    private int minutes;
    private int secondes;

    //gsetters
    public int getjours() {
        return this.jours;
    }
    public int getHeures() {
        return this.heures;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int getSecondes() {
        return this.secondes;
    }


    //setters
    public void setJours(int jours) {
        this.jours = jours;
    }
    public void setHeures(int heures) {
        this.heures = heures;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }




    public Duree(int jour, int heure, int minute, int seconde) {

        this.jours = jour;
        this.heures = heure;
        this.minutes = minute;
        this.secondes = seconde;

    }

    public String getDuree() {
        return System.out.println(jours + " jours - " + heures + " heures - "+ minutes + " minutes - " + secondes + " secondes");

    }

    public int getTotalSeconde() {

        onlySecondes = secondes;
        totalMinutes = minutes * 60;
        totalHeures = heures * 3600;
        totalJours = jours * 3600 * 24;
        totalSecondes = onlySecondes + totalMinutes + totalHeures + totalJours;

        return System.out.println(totalSecondes );


    }

    public void subDuree(Duree autreDuree){
        subDuree = totalSecondes - autreDuree.getTotalSeconde();
        if(subDuree < 0){
            SubDuree = 0;
        }
        return System.out.println(subDuree);

    }

    public void addDuree(Duree dureeAjoutee){
        dureeAjoutee= totalSecondes + dureeAjoutee.getTotalSeconde();

        return System.out.println(dureeAjoutee);

    }



}


