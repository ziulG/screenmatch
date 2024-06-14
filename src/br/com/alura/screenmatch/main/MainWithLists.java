package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        var godFather = new Movie("The Godfather",1972);
        godFather.rate(10);
        var starWars = new Movie("Star Wars III",2005);
        starWars.rate(8.9);
        var spaceOdyssey = new Movie("2001: Uma Odisseia no Espaço", 1968);
        spaceOdyssey.rate(9.5);
        var breakingBad = new Series("Breaking Bad", 2008);

        ArrayList<Title> list = new ArrayList<>();
        list.add(spaceOdyssey);
        list.add(starWars);
        list.add(godFather);
        list.add(breakingBad);

        for (Title item: list) {
            System.out.println(item.getName());
            System.out.println();
        }
    }
}
