package cts.schilizzi.filippos.g304.clubsportiv;

public class JucatorFactory {
    public static Jucator creeazaJucator(String tip, String nume) {
        return switch (tip.toLowerCase()) {
            case "fotbalist" -> new Fotbalist(nume);
            case "tenismen" -> new Tenismen(nume);
            default -> throw new IllegalArgumentException("Tip jucator necunoscut: " + tip);
        };
    }
}
