package com.example;

public class MakeMoveStrategy implements GameStrategy {
    @Override
    public void execute(Game game, Player player) {
        // Roll the dice using DiceEntity
        int diceRoll = game.getDice().roll();

        int currentPosition = player.getPosition();
        int newPosition = currentPosition + diceRoll;

        System.out.println("Player " + player.getName() + " rolled the dice and got a face value of: " + diceRoll);

        if (newPosition > game.getBoard().getSize()) {
            System.out.println("Player " + player.getName() + " cannot move as it exceeds board size.");
            return;
        }

        System.out.println("Player " + player.getName() + " moved from position " + currentPosition + " to position "
                + newPosition);
        player.setPosition(newPosition);

        // Check for snakes or ladders
        if (game.getBoard().getBoardEntities().containsKey(newPosition)) {
            BoardEntity entity = game.getBoard().getBoardEntities().get(newPosition);
            if (entity.getType().equals("Snake")) {
                System.out.println("Oh no! Player " + player.getName()
                        + " landed on a Snake and slides down to position " + entity.getEnd());
                player.setPosition(entity.getEnd());
            } else if (entity.getType().equals("Ladder")) {
                System.out.println("Yay! Player " + player.getName() + " climbed a Ladder and moves up to position "
                        + entity.getEnd());
                player.setPosition(entity.getEnd());
            }
        }
    }
}
