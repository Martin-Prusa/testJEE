package services;

import data.DomainsLoader;
import data.PaintingsLoader;
import models.Painting;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.HashMap;

@ApplicationScoped
public class PaintingsService {
    private HashMap<String, ArrayList<Painting>> paintings;

    public PaintingsService() {
        this.paintings = new PaintingsLoader().getPaintings();
    }

    public HashMap<String, ArrayList<Painting>> getPaintings() {
        return paintings;
    }

    public String[] getAuthors() {
        return paintings.keySet().toArray(new String[0]);
    }
}
