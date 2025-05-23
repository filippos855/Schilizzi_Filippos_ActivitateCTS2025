package cts.schilizzi.filippos.g304.spital;

public class Spital implements Internabil {
    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
    }
}
