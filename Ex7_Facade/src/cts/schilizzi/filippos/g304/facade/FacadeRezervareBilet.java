package cts.schilizzi.filippos.g304.facade;

public class FacadeRezervareBilet {
    private final ServiciuPasaport pasaport = new ServiciuPasaport();
    private final ServiciuBilete bilete = new ServiciuBilete();
    private final ServiciuPlata plata = new ServiciuPlata();

    public void rezerva(String nume, String destinatie, double suma) {
        System.out.println("=== Proces rezervare pentru " + nume + " ===");

        if (pasaport.verificaPasaport(nume) &&
                bilete.verificaDisponibilitate(destinatie) &&
                plata.plateste(nume, suma)) {
            System.out.println("Rezervare completă pentru " + nume + " către " + destinatie + ".");
        } else {
            System.out.println("Eroare la rezervare!");
        }
    }
}
