# Snake and Ladder Game (LLD Case Study)

This project is a low-level design (LLD) implementation of the classic Snake and Ladder game in Java. It demonstrates object-oriented principles, design patterns, and extensibility for future features.

## Features
- Multiple players
- Difficulty levels: Easy, Medium, Hard
- Dynamic board setup based on difficulty
- Strategy pattern for game rules (move, kill, win, etc.)
- Extensible design for adding new rules and entities

## Class Diagram
![Class Diagram]("https://img.plantuml.biz/plantuml/png/RLJTRfim5Bv7uXsiN7LhamT0KTIqGLsqCQrbKzNUkN22h14JsQPRrlRTTx0njW4k07y-Fz_vlPQA2jKUwpYAewAcKf8xUWJo5aS4doLvQQWe4tBJVInsgkaPX4p8VGijh7_euyRUbgo0XEpmdNB5rDdYVnZd81B2kB9GXQvsx71WHLkhSw9TkxEHkYH7-XkovXKkFbca0gK91OYX8GEiOz417ouyhUZYo_VFQS191woPCy0GCtfQxxc22iILqJLHRJmlEVitGyxQ6FpJ5wa4BHJnY1XZZeukHy07UEcTZRzEA72OyZ0NFy-dSTmvnpJQmpTQbY2wIv_5-dsvj78JtAaO4oRTZZd7sYKaLuBnQcYKHc8A6ZuEu3lAXhNh1HqeGt0kWQx5B8jB8fgw7WNUYSMH9wp3CMWS8J4G1rg0RZwaJx7Mda7u2qMhuAAxlUg33krdVNjQNOj_PNMDkHZ3ZpW60Hn7WUVr-serOtCgCx4_5PdnvJN3bfUcg3c8Lqo72xe2d5HKcUzZcrOxfxSDFx3AwuJsgEtBe8yHDTxak1kC_c0UK7Aq2QpjT9i_cRyitUr_PUR_o_PXr-lgtVKPozllg-7ihwC17AyRVT7WnQBVS8k-uFquQAL5i20M_XZ7qNnULwlD95qTsskSRLoz_m40")



## How to Run
1. Clone the repository.
2. Compile the Java files:
	```
	javac src/com/example/*.java
	```
3. Run the main class:
	```
	java -cp src com.example.main
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

## License
MIT
"# snake-and-ladder--LLD-case-study" 
