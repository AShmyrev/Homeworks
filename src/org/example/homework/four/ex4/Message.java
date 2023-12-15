package org.example.homework.four.ex4;

public class Message {
    private String text;
    private boolean isIncoming;
    private String toOrFromWhom;

    public Message(String text, boolean isIncoming, String toOrFromWhom) {
        this.text = text;
        this.isIncoming = isIncoming;
        this.toOrFromWhom = toOrFromWhom;
    }

    public boolean isIncoming() {
        return isIncoming;
    }

    public String getToOrFromWhom() {
        return toOrFromWhom;
    }

    public String getText() {
        return text;
    }
}
