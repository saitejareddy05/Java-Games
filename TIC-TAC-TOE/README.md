---

# ❌⭕ Tic-Tac-Toe Game (Java Console Version)

A simple yet engaging **Tic-Tac-Toe** (X-O) game built using **Java**.
Two players take turns to mark cells in an N×N grid until one wins or the game ends in a draw.

---

## 🎮 Features

* 👥 **Two-Player Mode** – Play locally with your friends.
* 🧠 **Smart Validation** – Prevents overwriting or invalid moves.
* 🗺️ **Dynamic Grid Size** – Choose any board size (default 3×3, but works for NxN).
* 🏁 **Auto Win Detection** – Checks all rows, columns, and diagonals.
* 🎉 **Win or Draw Announcement** – Declares winner or draw automatically.

---

## 🧩 How the Game Works

1. Enter the **grid size (n)** — e.g., `3` for a 3×3 board.
2. Enter names for **Player 1** and **Player 2**.
3. Players take turns entering **row and column indices** to place their mark (`X` or `O`).
4. The board updates after every move.
5. The first player to align **n symbols** (row, column, or diagonal) wins!
6. If the board fills up with no winner, it’s a **draw**.

---

## 🖥️ Example Gameplay

```
enter the grid size
3
enter enter player1 name:
Alice
enter enter player2 name:
Bob
Game Started between  Alice and Bob

        0         1         2
     +---------+---------+---------+
0    |         |         |         |
     +---------+---------+---------+
1    |         |         |         |
     +---------+---------+---------+
2    |         |         |         |
     +---------+---------+---------+

Alice  turn's can play now
enter the postition to fill board (X or O):
0 0
...
Bob  turn's can play now
enter the postition to fill board (X or O):
1 1
...

Alice winner congratualtions 🎉
```

---

## ⚙️ Setup & Run

### 🧰 Requirements

* [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
* A terminal or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

### ▶️ Steps

1. Clone this repository:

   ```bash
   git clone https://github.com/<your-username>/TicTacToe-Java.git
   ```
2. Navigate into the folder:

   ```bash
   cd TicTacToe-Java
   ```
3. Compile and run:

   ```bash
   javac Main.java
   java Main
   ```

---

## 💡 Possible Improvements

Enhance your version with:

* 🎨 GUI using JavaFX or Swing
* 🧠 AI Opponent using Minimax algorithm
* 🔄 Replay option after game ends
* 🕐 Timer or move limit

---

## 👨‍💻 Author

**Saiteja Reddy Kasireddy**
📧 kasireddysaitejareddy@gmail.com
🌐 [GitHub Profile](https://github.com/saitejareddy05)

---

## 📜 License

This project is licensed under the **MIT License** — you are free to use, modify, and distribute it.

---

Would you like me to make a **shorter GitHub-friendly version (compact for README.md)** or keep this **detailed showcase version**?

