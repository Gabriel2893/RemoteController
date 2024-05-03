package org.example;

public class RemoteController implements Controller{
    //Attributes
    private int volume;
    private boolean on;
    private boolean playing;

    //Special Methods - Constructor
    public RemoteController() {
        this.volume = 50;
        this.on = false;
        this.playing = false;
    }

    //Getters and Setters
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    private boolean getPlaying() {
        return playing;
    }
    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    //Implements Controller

    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        System.out.println("---------------MENU---------------");
        System.out.println("Is it on?" + this.getOn());
        System.out.println("Is it of?" + this.getPlaying());
        System.out.print("volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 5) {
            System.out.print("|");
        }
        System.out.println("\n" + "----------------------------------");
    }

    @Override
    public void closeMenu() {
        System.out.println("Closing menu");
    }

    @Override
    public void volumeUp() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void volumeDown() {
        if (this.getOn()){
            this.setVolume(this.getVolume() - 5);
        }else {
            System.out.println("Impossible to reduce volume");
        }
    }

    public void muteOn() {
        if (this.getOn()&& (this.getVolume() >= 0)) {
            this.setVolume(0);
        }
    }

    @Override
    public void muteOff() {
        if (this.getOn() && (this.getVolume() == 0)) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getOn() && ! (this.getPlaying())){
            this.setPlaying(true);
        }
        else{
            System.out.println("Error");
        }
    }

    @Override
    public void pause() {
        if (this.getOn() && (this.getPlaying())){
            this.setPlaying(false);
        }
        else{
        System.out.println("Error");
    }
    }

    //Abstract Methods
}
