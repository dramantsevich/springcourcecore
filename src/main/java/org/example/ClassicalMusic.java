package org.example;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Doing my Initializating");
    }

    public void doMyDestroy() {
        System.out.println("Doing my Destroying");
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
