package cts.schilizzi.filippos.g304.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryCaracter {
    private final Map<Character, CaracterFlyweight> caractere = new HashMap<>();

    public CaracterFlyweight getCaracter(char c) {
        caractere.putIfAbsent(c, new CaracterFlyweight(c));
        return caractere.get(c);
    }
}
