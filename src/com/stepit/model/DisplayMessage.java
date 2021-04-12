package com.stepit.model;

public class DisplayMessage {

    public void displayMessageEnjoyGame() {
        System.out.println("\uD83C\uDF83 " + "Welcome to Halloween Castle! \uD83C\uDF83\n");
    }

    public void chooseRealms() {
        System.out.println("\uD83D\uDC7B " + "Choose the land you want to go to! \uD83D\uDC7B\n");
    }

    public void showRealms() {
        for (Realms realms : Realms.values()) {
            System.out.println(realms.getId() + " - " + realms.getName());
        }
    }
}
