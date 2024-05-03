package org.example;

public class Main {
    public static void main(String[] args){

        RemoteController RemoteController = new RemoteController();

        RemoteController.turnOn();
        RemoteController.volumeDown();
        RemoteController.muteOn();
        RemoteController.volumeUp();
        RemoteController.volumeUp();
        RemoteController.openMenu();
    }
}