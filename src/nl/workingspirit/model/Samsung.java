package nl.workingspirit.model;

public class Samsung implements  Television {

    private boolean on;
    private int currentChannel;

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        return this.currentChannel;
    }
}
