# Snake and Ladder Game (LLD Case Study)

This project is a low-level design (LLD) implementation of the classic Snake and Ladder game in Java. It demonstrates object-oriented principles, design patterns, and extensibility for future features.

## Features

- Multiple players
- Difficulty levels: Easy, Medium, Hard
- Dynamic board setup based on difficulty
- Strategy pattern for game rules (move, kill, win, etc.)
- Extensible design for adding new rules and entities

## Class Diagram

![Class Diagram]([](https://drive.google.com/file/d/13ZudxictHPccnTp-AAIEMDvaSV3WmDhH/view))

## How to Run

1. Clone the repository.
2. Compile the Java files:
   ```
   javac src/com/example/*.java
   ```
3. Run the main class:
   ```
   java -cp src com.example.Main
   ```

## Project Structure

```
src/
  com/
	 example/
		Board.java
		BoardEntity.java
		Client.java
		Dice.java
		DiceEntity.java
		DifficultyConfig.java
		Game.java
		GameStrategy.java
		GameDifficulty.java
		KillingStrategy.java
		Ladder.java
		Main.java
		MakeMoveStrategy.java
		Player.java
		Snake.java
		SnakeAndLadderService.java
		WinningStrategy.java
```

## Design Principles Used

- **Composition**: Game owns Board, Board owns BoardEntities
- **Strategy Pattern**: For move, kill, win logic
- **Dependency Inversion**: Game uses GameStrategy interface
- **Single Responsibility**: Each class has a clear responsibility

## Contributing

Feel free to fork the repo and submit pull requests for improvements or new features.

"# snake-and-ladder--LLD-case-study"
