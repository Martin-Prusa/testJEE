package services;

import data.FilmsLoader;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class FilmsService {

    private ArrayList<ArrayList<String>> films = new ArrayList<>();

    public FilmsService() {
        FilmsLoader loader = new FilmsLoader();
        String[] filmsArr = loader.getFilms();
        for (int i = 0; i < Math.ceil(filmsArr.length / 16f); i++) {
            films.add(new ArrayList<String>());
            for (int j = 0; j < Math.min(16, filmsArr.length - 16*i); j++) {
                films.get(i).add(filmsArr[i*16 + j]);
            }
        }
    }

    public ArrayList<ArrayList<String>> getFilms() {
        return films;
    }
}
