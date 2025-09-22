package com.example;

import java.util.*;

public class Board {
    private final int SIZE;
    Map<Integer, BoardEntity> boardEntities;

    public Board(int size, Map<Integer, BoardEntity> boardEntities) {
        this.SIZE = size;
        this.boardEntities = boardEntities;
    }

    public Board(int size, BoardEntity[] snakes, BoardEntity[] ladders) {
        this.SIZE = size;
        this.boardEntities = new HashMap<>();
        if (snakes != null) {
            for (BoardEntity snake : snakes) {
                boardEntities.put(snake.getStart(), snake);
            }
        }
        if (ladders != null) {
            for (BoardEntity ladder : ladders) {
                boardEntities.put(ladder.getStart(), ladder);
            }
        }
    }

    public int getSize() {
        return SIZE;
    }

    public Map<Integer, BoardEntity> getBoardEntities() {
        return boardEntities;
    }

    public void setBoardEntities(Map<Integer, BoardEntity> boardEntities) {
        this.boardEntities = boardEntities;
    }

}
