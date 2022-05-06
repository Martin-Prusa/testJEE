package services;

import data.DomainsLoader;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;

@ApplicationScoped
public class DomainsService {
    private HashMap<String, Integer> prices = new HashMap<>();

    public DomainsService() {
        List<Integer> allPrices = new DomainsLoader().getPrices();
        prices.put("averagePrice", (int) Math.round(allPrices.stream().mapToInt(Integer::intValue).average().getAsDouble() / 1000f) * 1000);
        prices.put("maximalPrice", Math.round(allPrices.stream().mapToInt(Integer::intValue).max().getAsInt() / 1000f) * 1000);
        prices.put("minimalPrice", Math.round(allPrices.stream().mapToInt(Integer::intValue).min().getAsInt() / 1000f) * 1000);
    }

    public HashMap<String, Integer> getPrices() {
        return prices;
    }
}
