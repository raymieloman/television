package nl.workingspirit.model;

public class Samsung /* extends Object*/ implements  Television {

    private boolean on;
    private int currentChannel;

    public void switchOn() {

        System.out.println(Television.vat);
        System.out.println(this.vat);
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public int switchChannel(int newChannel) {
        if (this.on) {
            this.currentChannel = newChannel;
        } else {
            // throw some
        }


        return this.currentChannel;
    }

    public void foo() {

        super.toString();

    }
}
