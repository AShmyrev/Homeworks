package org.example.homework.third.ex2;

public class Camera {
    int zoom;
    boolean isThereFlash;

    public Camera(int zoom) {
        this.zoom = zoom;
        this.isThereFlash = false;
    }

    public Camera(int zoom, boolean isThereFlash) {
        this.zoom = zoom;
        this.isThereFlash = isThereFlash;
    }

    @Override
    public String toString() {
        return isThereFlash ? "{"
                + "zoom=" + zoom
                + ", есть вспышка"
                : "{"
                + "zoom=" + zoom;
    }
}
