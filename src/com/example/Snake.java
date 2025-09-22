package com.example;

public class Snake extends BoardEntity {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getType() {
        return "Snake";
    }
}
