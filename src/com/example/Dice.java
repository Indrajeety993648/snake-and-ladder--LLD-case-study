package com.example;

public class Dice extends DiceEntity {
    @Override
    public int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}
