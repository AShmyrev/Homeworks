package org.example.homeworks.module_2.homework_2.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LuggageCompartment {
    private List<Suitcase> suitcases = new ArrayList<Suitcase>();
    private Worker worker1 = new Worker("worker1");
    private Worker worker2 = new Worker("worker2");
    private Worker worker3 = new Worker("worker3");

    public void airplaneLanded(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }

    public void unloadLuggage() {
        Worker currentWorker = worker1;
        while (!suitcases.isEmpty()) {
            currentWorker.throwSuitcase(suitcases);
            if (currentWorker.equals(worker1)) {
                currentWorker = worker2;
            } else if (currentWorker.equals(worker2)) {
                currentWorker = worker3;
            } else {
                currentWorker = worker1;
            }
        }
    }
}
