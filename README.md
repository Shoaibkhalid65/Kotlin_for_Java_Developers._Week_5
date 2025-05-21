# 🎮 Kotlin Puzzle Games: 2048 & Game of Fifteen

This project is part of my **Kotlin for Java Developers** course assignment (Week 5), where I implemented two classic puzzle games using Kotlin and Java Swing for UI.

---

## 🧩 Games Included

### 🔢 2048
An engaging number-merging puzzle game originally created by a student in a weekend. Combine tiles with the same value to reach the 2048 tile!

### 🔁 Game of Fifteen
A sliding-tile puzzle game where the goal is to arrange tiles from 1 to 15 in order. Simple in concept, challenging in practice!

---

## 🛠 Technologies Used

- **Kotlin** – For all core game logic.
- **Java Swing** – For implementing the graphical user interface.
- **OOP Principles** – Clean and modular architecture using interfaces and classes.
- **Unit Testing** – All required test cases are implemented and passing ✅

---

## 📦 Project Structure

Each game implements a shared interface:

```kotlin
interface Game {
    fun initialize()
    fun canMove(): Boolean
    fun hasWon(): Boolean
    fun processMove(direction: Direction)
    operator fun get(i: Int, j: Int): Int?
}
## 📷 Screenshots

### 🔢 2048
"C:\Users\PMLS\OneDrive\Pictures\Screenshots\Screenshot 2025-05-21 143555.png"


### 🔁 Game of Fifteen
![Game of Fifteen Screenshot](https://user-images.githubusercontent.com/12345678/game_of_fifteen.png)

