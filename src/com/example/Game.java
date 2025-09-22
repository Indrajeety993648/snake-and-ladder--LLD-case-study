package com.example;

import java.util.Queue;

public class Game {
    private final Board board;
    private final Queue<Player> players;
    protected GameStatus status;
    protected int currentPlayerIndex;
    protected int winner;
    private final DiceEntity dice;
    private GameDifficulty gameDifficulty;

    public Board getBoard() {
        return board;
    }

    public DiceEntity getDice() {
        return dice;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public Game(Builder builder) {
        this.board = builder.board;
        this.players = builder.players;
        this.status = builder.status;
        this.currentPlayerIndex = builder.currentPlayerIndex;
        this.winner = builder.winner;
        this.dice = builder.dice;
        this.gameDifficulty = builder.gameDifficulty;
    }

    public void makeMove() {

        // before Play check whether atleast 2 Player needed to play the game ..
        if (players.size() < 2) {
            System.out.println("Atleast 2 players are required to start the game");
            return;
        }

        // get the currect Player from the Queue ..
        Player currentPlayer = players.poll();
        int diceValue = dice.roll();
        System.out.println(
                "Player " + currentPlayer.getName() + " rolled the dice and got a face value of: " + diceValue);
        int newPosition = currentPlayer.getPosition() + diceValue;
        if (newPosition > board.getSize()) {
            System.out.println("Player " + currentPlayer.getName() + " rolled the dice and got a face value of: "
                    + diceValue + " but cannot move as it exceeds board size.");
            players.offer(currentPlayer); // putting the player back in the queue
            return;
        }
        System.out.println("Player " + currentPlayer.getName() + " moved from position " + currentPlayer.getPosition()
                + " to position " + newPosition);
        currentPlayer.setPosition(newPosition);

        // checking if the new position has any BoardEntity (Snake or Ladder)
        if (board.getBoardEntities().containsKey(newPosition)) {
            BoardEntity entity = board.getBoardEntities().get(newPosition);
            if (entity.getType().equals("Snake")) {
                System.out.println("Oh no! Player " + currentPlayer.getName()
                        + " landed on a Snake and slides down to position " + entity.getEnd());
                currentPlayer.setPosition(entity.getEnd());
            } else if (entity.getType().equals("Ladder")) {
                System.out.println("Yay! Player " + currentPlayer.getName()
                        + " climbed a Ladder and moves up to position " + entity.getEnd());
                currentPlayer.setPosition(entity.getEnd());
            }
        }
    }

    // . Inner Builder class ...

    public static class Builder {
        private Board board;
        private Queue<Player> players;
        private GameStatus status;
        private int currentPlayerIndex;
        private int winner;
        private DiceEntity dice;
        private GameDifficulty gameDifficulty;

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setPlayers(Queue<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setStatus(GameStatus status) {
            this.status = status;
            return this;
        }

        public Builder setCurrentPlayerIndex(int currentPlayerIndex) {
            this.currentPlayerIndex = currentPlayerIndex;
            return this;
        }

        public Builder setWinner(int winner) {
            this.winner = winner;
            return this;
        }

        public Builder setDice(DiceEntity dice) {
            this.dice = dice;
            return this;
        }

        public Builder setGameDifficulty(GameDifficulty gameDifficulty) {
            this.gameDifficulty = gameDifficulty;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }
}
