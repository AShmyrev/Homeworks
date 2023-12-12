package org.example.homework.third.ex2;

public abstract class Phone {
    private String name;
    private OperationSystem operationSystem;
    private Board board;
    private Camera camera;

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, OperationSystem operationSystem, Board board, Camera camera) {
        this.name = name;
        this.operationSystem = operationSystem;
        this.board = board;
        this.camera = camera;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{"
                + "name='" + name + '\''
                + ", operationSystem=" + operationSystem
                + ", board=" + board
                + ", camera=" + camera
                + '}';
    }
}
