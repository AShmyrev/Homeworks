package org.example.homeworks.module_2.homework_2.ex1;

public class RunnerLuggage {
    public static void run() {
        LuggageCompartment luggageCompartment = new LuggageCompartment();
        luggageCompartment.airplaneLanded("SU-077");
        luggageCompartment.airplaneLanded("AO-222");
        luggageCompartment.unloadLuggage();
    }
}
