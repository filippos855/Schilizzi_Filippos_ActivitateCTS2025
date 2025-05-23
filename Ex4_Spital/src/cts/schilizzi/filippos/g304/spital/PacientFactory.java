package cts.schilizzi.filippos.g304.spital;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    private final Map<String, PacientFlyweight> pacienti = new HashMap<>();

    public PacientFlyweight getPacient(String nume, int varsta, String grupaSanguina) {
        String key = nume + "-" + varsta + "-" + grupaSanguina;
        pacienti.putIfAbsent(key, new PacientFlyweight(nume, varsta, grupaSanguina));
        return pacienti.get(key);
    }
}
