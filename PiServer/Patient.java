public class Patient {
    private String name;
    private int alter;
    private int gewicht;
    private int puls;
    private double groesse;
    public Patient(String name, int alter, int gewicht, int puls, double groesse) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.puls = puls;
        this.groesse = groesse;
    }
    public String getName() {
        return name;
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
    public int getPuls() {
        return puls;
    }
    public void setPuls(int puls) {
        this.puls = puls;
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