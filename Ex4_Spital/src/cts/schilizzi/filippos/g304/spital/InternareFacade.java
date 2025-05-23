package cts.schilizzi.filippos.g304.spital;

public class InternareFacade {
    private final MedicVerificator medic;
    private final Salon salon;

    public InternareFacade(MedicVerificator medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void verificaSiInterneaza(PacientInternare pacientInternare) {
        System.out.println("=== Verificare internare pentru: " + pacientInternare.getNume() + " ===");
        if (!medic.confirmaInternare(pacientInternare)) {
            System.out.println("Internare respinsă: medicul nu aprobă.");
            return;
        }

        if (!salon.arePatLiber()) {
            System.out.println("Internare respinsă: nu sunt paturi disponibile.");
            return;
        }

        salon.ocupaPat();
        System.out.println("Pacientul " + pacientInternare.getNume() + " a fost internat cu succes.");
    }
}
