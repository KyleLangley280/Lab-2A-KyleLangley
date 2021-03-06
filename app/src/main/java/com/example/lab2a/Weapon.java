package com.example.lab2a;

public enum Weapon {
    ERROR("ERROR"),
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");
    private String message;

    private Weapon(String msg) { message = msg; }

    @Override
    public String toString() { return message; }

}
