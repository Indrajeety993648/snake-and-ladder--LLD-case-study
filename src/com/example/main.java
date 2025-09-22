package com.example;

import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        int boardSize = 100;
        GameDifficulty difficulty = GameDifficulty.MEDIUM; // Change as needed

        // Generate board entities based on difficulty
        Map<Integer, BoardEntity> boardEntities = SnakeAndLadderService.generateBoardEntities(boardSize, difficulty);
        Board board = new Board(boardSize, boardEntities);

        // Creating players
        Queue<Player> players = new LinkedList<>();
        players.add(new Player("Vivek Anand Singh "));
        players.add(new Player("Siddharth Baleja "));
        players.add(new Player("Indrajeet Yadav "));

        // Create dice
        DiceEntity dice = new Dice();

        // Build the game
        Game game = new Game.Builder()
                .setBoard(board)
                .setPlayers(players)
                .setDice(dice)
                .setGameDifficulty(difficulty)
                .setCurrentPlayerIndex(0)
                .setWinner(-1)
                .build();

        // Simple game loop
        while (game.status != GameStatus.FINISHED) {
            Player currentPlayer = game.getPlayers().poll();
            if (currentPlayer == null)
                break;

            // Execute strategies for the current player
            new MakeMoveStrategy().execute(game, currentPlayer);
            new KillingStrategy().execute(game, currentPlayer);
            new WinningStrategy().execute(game, currentPlayer);

            // If the game is not finished, put the player back in the queue
            if (game.status != GameStatus.FINISHED) {
                game.getPlayers().offer(currentPlayer);
            }
        }
        System.out.println("Game Over!");
    }
}
