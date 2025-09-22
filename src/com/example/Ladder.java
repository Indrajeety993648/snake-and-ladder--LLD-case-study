package com.example;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    public String getType() {
        return "Ladder";
    }
}
