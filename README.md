🎲 Kotlin Puzzle Games: 2048 & Game of Fifteen 🧩
Welcome to my Kotlin project for the Kotlin for Java Developers course, Week 5 assignment! This project features two classic puzzle games: 2048 and the Game of Fifteen, implemented in Kotlin with a user interface powered by Java’s Swing library. Both games are fully playable, come with comprehensive test cases, and are designed with a clean, reusable interface. 🚀
📖 Project Overview
This project showcases my implementation of two engaging puzzle games:

2048 🎮: A sliding tile puzzle game where players combine numbered tiles to reach the elusive 2048 tile. Originally created by a student in a single weekend, it’s now a global sensation!
Game of Fifteen 🧠: A classic 4x4 sliding puzzle where players arrange tiles numbered 1 to 15 in ascending order, leaving one empty space for movement.

Both games share a common Game interface, ensuring modularity and extensibility, and are brought to life with a Swing-based graphical user interface. The project includes test cases to verify functionality and correctness. ✅
🛠️ Features

Modular Design: Both games implement a shared Game interface with methods for initialization, movement, and win conditions.
Interactive UI: Built using Java’s Swing library for a smooth, visual gameplay experience.
Comprehensive Testing: Each game includes test cases to ensure robust functionality.
Playable Games: Run the code to play either 2048 or the Game of Fifteen directly!
Kotlin Power: Leverages Kotlin’s concise syntax and interoperability with Java.

🎮 How to Play
2048

Objective: Combine tiles with the same number by sliding them in four directions (up, down, left, right) to create a tile with the value 2048.
Controls: Use arrow keys to move tiles.
Winning: Reach a tile with the value 2048!

Game of Fifteen

Objective: Arrange tiles numbered 1 to 15 in ascending order within a 4x4 grid, with one empty space.
Controls: Use arrow keys to slide tiles into the empty space.
Winning: Achieve the correct order from 1 to 15.

📦 Installation

Clone the Repository:git clone https://github.com/your-username/kotlin-puzzle-games.git


Navigate to the Project Directory:cd kotlin-puzzle-games


Build the Project: Ensure you have Gradle installed, then run:./gradlew build


Run the Games:
For 2048: gradle run2048
For Game of Fifteen: gradle runGameOfFifteen



🖥️ System Requirements

JDK: 11 or higher
Kotlin: 1.9 or higher
Gradle: 7.0 or higher
OS: Windows, macOS, or Linux

🧬 Project Structure
The project is organized as follows:

src/main/kotlin:
Game.kt: The Game interface defining core game methods.
Game2048.kt: Implementation of the 2048 game.
GameOfFifteen.kt: Implementation of the Game of Fifteen.
ui/: Contains Swing-based UI code for both games.


src/test/kotlin: Test cases for both games to ensure correctness.
build.gradle: Gradle configuration for building and running the project.

Game Interface
The Game interface provides a blueprint for both games, with the following methods:

initialize(): Sets up the game board.
canMove(): Boolean: Checks if any valid moves are available.
hasWon(): Boolean: Determines if the player has won.
processMove(direction: Direction): Processes a move in the specified direction.
get(i: Int, j: Int): Int?: Retrieves the value at the specified board position.

🔍 Running Tests
To verify the functionality of both games, run the test suite:
./gradlew test

All test cases cover edge cases, valid moves, and win conditions.
🌟 Why This Project?
This project demonstrates my skills in:

Writing clean, modular Kotlin code with interfaces.
Integrating Java’s Swing library for GUI development.
Designing and testing game logic.
Applying object-oriented principles in a real-world application.

It’s a fun way to explore Kotlin’s power while enjoying two classic puzzle games! 😄
🔗 Resources

Kotlin Official Documentation 📚
Java Swing Tutorial 🖼️
2048 Game History 🎲
Game of Fifteen Wikipedia 🧩
Gradle User Guide 🛠️

🤝 Contributing
Feel free to fork this repository, submit pull requests, or open issues for bugs or feature suggestions. Let’s make these games even better together! 🌈
📬 Contact
Have questions or feedback? Reach out via GitHub Issues or connect with me on LinkedIn. 📧

Happy puzzling! 🎉



