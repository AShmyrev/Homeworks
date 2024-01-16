package org.example.homeworks.module_1.third.ex2;

public class PhoneFactory {

    public Phone createIphone() {
        Iphone15 iphone15 = new Iphone15();
        iphone15.setOperationSystem(new OperationSystem("Ios"));
        iphone15.setBoard(new Board("7uik", 15, 12, 13));
        iphone15.setCamera(new Camera(15, true));
        return iphone15;
    }

    public Phone createSamsungGalaxy() {
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
        samsungGalaxy.setOperationSystem(new OperationSystem("Android"));
        samsungGalaxy.setBoard(new Board("j-108", 10, 12, 13));
        samsungGalaxy.setCamera(new Camera(20));
        return samsungGalaxy;
    }
}
