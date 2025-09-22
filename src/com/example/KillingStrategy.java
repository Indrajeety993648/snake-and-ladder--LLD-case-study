package com.example;

public class KillingStrategy implements GameStrategy {
    @Override
    public void execute(Game game, Player player) {
        // Check if any other player is on the same position
        int currentPosition = player.getPosition();
        for (Player other : game.getPlayers()) {
            if (other != player && other.getPosition() == currentPosition) {
                System.out.println("Player " + player.getName() + " killed " + other.getName() + "!");
                other.setPosition(0); // Send killed player to start
            }
        }
    }
}
