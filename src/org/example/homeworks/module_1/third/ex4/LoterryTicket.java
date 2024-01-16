package org.example.homeworks.module_1.third.ex4;

public class LoterryTicket {
    public static int ticketsCounter;
    public static int winnings;

    public LoterryTicket() {
        ticketsCounter++;
    }

    public void checkLuck() {
        if (ticketsCounter % 100 == 0) {
            winnings += 5000;
            System.out.println("100th ticket! +5000 rubles! Your winnings is " + winnings);
        } else if (ticketsCounter % 10 == 0) {
            winnings += 100;
            System.out.println("10th ticket!  +100 rubles! Your winnings is " + winnings);
        } else {
            System.out.println("Bad luck! Maybe next time! Your winnings is " + winnings);
        }
    }
}
