package cts.schilizzi.filippos.g304.main;

import cts.schilizzi.filippos.g304.clubsportiv.*;

public class Main3 {
    public static void main(String[] args) {
        AgentDoping agent = new AgentDoping();

        Jucator j1 = JucatorFactory.creeazaJucator("fotbalist", "Andrei");
        Jucator j2 = JucatorFactory.creeazaJucator("tenismen", "Radu");
        Jucator j3 = JucatorFactory.creeazaJucator("fotbalist", "Mihai");

        agent.aboneaza(j1);
        agent.aboneaza(j2);
        agent.aboneaza(j3);

        j1.incepeAntrenament();
        j2.incepeAntrenament();
        j3.incepeAntrenament();

        agent.notifica("Oxandrolonă");

        j1.testDoping();
        j2.testDoping();

        j2.adaugaAntrenament("Serviciu cu efect");
    }
}
