package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculations.RecommendationFilter;
import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var godFather = new Movie("The Godfather",1972);
        godFather.setPlanIncluded(true);
        godFather.setDurationInMinutes(200);

        godFather.showsTechnicalSpecifications();

        godFather.rate(9.9);
        godFather.rate(10);
        godFather.rate(8.7);

        System.out.println("Total de avaliações: " + godFather.getTotalRatings());

        System.out.println("Média de avaliações do filme: " + godFather.getAverage());

        var breakingBad = new Series("Breaking Bad", 2008);
        breakingBad.showsTechnicalSpecifications();
        breakingBad.setSeasons(6);
        breakingBad.setEpisodesPerSeason(10);
        breakingBad.setMinutesPerEpisodes(55);

        System.out.println("Duração para maratonar Breaking bad: " + breakingBad.getDurationInMinutes() + " minutos");

        var starWars = new Movie("Star Wars III",2005);
        starWars.setPlanIncluded(false);
        starWars.setDurationInMinutes(140);

        var calculator = new TimeCalculator();
        calculator.includes(godFather);
        calculator.includes(starWars);
        calculator.includes(breakingBad);
        System.out.println(calculator.getTotalTime());

        var filter = new RecommendationFilter();
        filter.filtrate(godFather);

        var pilot = new Episode();
        pilot.setName("Pilot");
        pilot.setNum(1);
        pilot.setSeries(breakingBad);
        pilot.setTotalViews(300);
        filter.filtrate(pilot);

        var spaceOdyssey = new Movie("2001: Uma Odisseia no Espaço", 1968);
        spaceOdyssey.setDurationInMinutes(150);
        spaceOdyssey.rate(8.3);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(spaceOdyssey);
        movieList.add(starWars);
        movieList.add(godFather);

        System.out.println("Filmes no total: " + movieList.size());
        System.out.println("Primeiro filme da lista: " + movieList.get(0).getName());
        System.out.println(movieList);
        System.out.println("ToString filme 1: " + movieList.get(0).toString());
    }
}
