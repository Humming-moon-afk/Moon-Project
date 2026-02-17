import java.util.ArrayList;

public class Patient {
    private String name;
    private int alter;
    private int gewicht;
    private double groesse;
    private ArrayList<Integer> pulsHistorie;
    public Patient(String name, int alter, int gewicht, double groesse) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.groesse = groesse;
        this.pulsHistorie = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void neuerPulsWert(int wert) {
        pulsHistorie.add(wert);
    }
    public int getDurchSchnittPuls() {
        if(pulsHistorie.isEmpty()) {
            return 0;
        }
        int summe = 0;
        for(int i = 0; i < pulsHistorie.size(); i++) {
            summe += pulsHistorie.get(i);
        }
        return summe / pulsHistorie.size();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }
    public double getGroesse() {
        return groesse;
    }
    public double berechneBMI() {
        return gewicht / (groesse * groesse);
    }
    public void zeigeInfo() {
        double bmi = berechneBMI();
        System.out.println(name + " " + String.format("%.2f", bmi));
    }
}