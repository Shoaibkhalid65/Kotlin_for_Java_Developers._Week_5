# 🎮 Kotlin Puzzle Games: 2048 & Game of Fifteen

Welcome to my **Week 5 Assignment** for the ✨ _Kotlin for Java Developers_ ✨ course!

This project contains two well-known puzzle games implemented using **Kotlin**, with interactive UI built using **Java Swing**. The games are:

- 🧮 **[2048](https://en.wikipedia.org/wiki/2048_(video_game))** – A number puzzle game where you combine tiles to reach 2048
- 🔢 **[Game of Fifteen](https://en.wikipedia.org/wiki/15_puzzle)** – A classic tile-sliding puzzle where you arrange numbers in order

Both games follow a clean, modular architecture using a shared interface named `Game`. You can run the games and play them interactively from your desktop!

---

## 📋 Table of Contents

- [🧠 Overview](#-overview)
- [🧱 Interface Design](#-interface-design)
- [🕹️ Games Explained](#-games-explained)
- [🚀 Getting Started](#-getting-started)
- [🧪 Testing](#-testing)
- [📁 Project Structure](#-project-structure)
- [📷 Screenshots](#-screenshots)
- [📌 Features](#-features)
- [🔧 Future Improvements](#-future-improvements)
- [🙌 Acknowledgments](#-acknowledgments)
- [📜 License](#-license)

---

## 🧠 Overview

This project demonstrates object-oriented and UI programming in Kotlin. I implemented:

- ✅ Game logic in pure Kotlin
- ✅ Swing-based UI for real-time interaction
- ✅ A reusable `Game` interface for extensibility and testing
- ✅ Comprehensive unit test coverage

---

## 🧱 Interface Design

At the heart of both games is a common interface called `Game`:

```kotlin
interface Game {
    fun initialize()
    fun canMove(): Boolean
    fun hasWon(): Boolean
    fun processMove(direction: Direction)
    operator fun get(i: Int, j: Int): Int?
}

📬 Contact
Have questions or feedback? Reach out via GitHub Issues or connect with me on LinkedIn. 📧

Happy puzzling! 🎉



