package cts.schilizzi.filippos.g304.spital;

public class FactoryPersonalNonMedical implements AbstractFactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String tip, String nume) {
        return switch (tip.toLowerCase()) {
            case "secretar" -> new Secretar(nume);
            case "registrator" -> new Registrator(nume);
            default -> throw new IllegalArgumentException("Tip non-medical necunoscut: " + tip);
        };
    }
}
