package cts.schilizzi.filippos.g304.spital;

public class FactoryPersonalMedical implements AbstractFactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String tip, String nume) {
        return switch (tip.toLowerCase()) {
            case "medic" -> new Medic(nume);
            case "asistent" -> new Asistent(nume);
            case "brancardier" -> new Brancardier(nume);
            default -> throw new IllegalArgumentException("Tip medical necunoscut: " + tip);
        };
    }
}
