package com.example;

public class WinningStrategy implements GameStrategy {
    @Override
    public void execute(Game game, Player player) {
        int boardSize = game.getBoard().getSize();
        if (player.getPosition() == boardSize) {
            System.out.println("Player " + player.getName() + " has won the game!");
            game.status = GameStatus.FINISHED;
            game.winner = game.currentPlayerIndex;
        }
    }
}
