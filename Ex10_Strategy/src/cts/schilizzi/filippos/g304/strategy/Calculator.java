package cts.schilizzi.filippos.g304.strategy;

public class Calculator {
    private StrategieCalcul strategie;

    public void setStrategie(StrategieCalcul strategie) {
        this.strategie = strategie;
    }

    public double executaStrategie(double a, double b) {
        if (strategie == null) {
            throw new IllegalStateException("Strategia nu a fost setată!");
        }
        return strategie.calculeaza(a, b);
    }
}
