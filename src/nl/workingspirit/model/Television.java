package nl.workingspirit.model;

public interface Television {

    double vat = 0.21;

    /*public abstract */void switchOn();

    void off();

    int switchChannel(int newChannel);
}

