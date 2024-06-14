package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {
    private int num;
    private String name;
    private Series series;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalViews >= 100) {
            return 4;
        } else {
            return 3;
        }
    }
}
