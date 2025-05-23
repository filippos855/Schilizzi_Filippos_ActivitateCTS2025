package cts.schilizzi.filippos.g304.spital;

public class FactoryPersonal {
    public static PersonalSpital creeazaPersonal(TipPersonal tip, String nume) {
        return switch (tip) {
            case BRANCARDIER -> new Brancardier(nume);
            case ASISTENT -> new Asistent(nume);
            case MEDIC -> new Medic(nume);
        };
    }
}
