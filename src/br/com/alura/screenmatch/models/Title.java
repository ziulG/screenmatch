package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private double sumRating;
    private boolean planIncluded;
    private int totalRatings;
    private int durationInMinutes;

    public Title(String name, int release) {
        this.setName(name);
        this.setReleaseYear(release);
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getTotalRatings(){

        return totalRatings;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showsTechnicalSpecifications(){
        System.out.println("Nome do titulo: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluido no plano: " + planIncluded);
    }

    public void rate(double note){
        sumRating += note;
        totalRatings++;
    }

    public double getAverage(){

        return sumRating / totalRatings;
    }
}
