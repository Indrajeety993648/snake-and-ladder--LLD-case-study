package com.example;

import java.util.HashMap;
import java.util.Map;
import com.example.DifficultyConfig;

public class SnakeAndLadderService {
    public static Map<Integer, BoardEntity> generateBoardEntities(int boardSize, GameDifficulty difficulty) {
        Map<Integer, BoardEntity> entities = new HashMap<>();
        DifficultyConfig config = DifficultyConfig.getConfig(boardSize, difficulty);
        // Generate snakes
        for (int i = 0; i < config.numSnakes; i++) {
            int start = (int) (Math.random() * (boardSize - 10)) + 10;
            int end = (int) (Math.random() * (start - 1)) + 1;
            entities.put(start, new Snake(start, end));
        }
        // Generate ladders
        for (int i = 0; i < config.numLadders; i++) {
            int start = (int) (Math.random() * (boardSize - 10)) + 1;
            int end = (int) (Math.random() * (boardSize - start - 1)) + start + 1;
            entities.put(start, new Ladder(start, end));
        }
        return entities;
    }
}
