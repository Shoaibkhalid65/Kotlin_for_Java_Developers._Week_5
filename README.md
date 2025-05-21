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
![Screenshot 2025-05-21 143555](https://github.com/user-attachments/assets/d84aea89-4c71-46a9-bce0-2a82ea5ca492)

### 🔁 Game of Fifteen
![Screenshot 2025-05-21 143647](https://github.com/user-attachments/assets/22f1a740-8906-4b2d-883f-8ec017e0906c)
