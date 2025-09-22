package com.example;

public class DifficultyConfig {
    public final int numSnakes;
    public final int numLadders;

    public DifficultyConfig(int numSnakes, int numLadders) {
        this.numSnakes = numSnakes;
        this.numLadders = numLadders;
    }

    public static DifficultyConfig getConfig(int boardSize, GameDifficulty difficulty) {
        switch (difficulty) {
            case EASY:
                return new DifficultyConfig(boardSize / 20, boardSize / 10);
            case MEDIUM:
                return new DifficultyConfig(boardSize / 15, boardSize / 15);
            case HARD:
                return new DifficultyConfig(boardSize / 10, boardSize / 20);
            default:
                return new DifficultyConfig(boardSize / 15, boardSize / 15);
        }
    }
}
