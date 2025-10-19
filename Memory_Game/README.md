---

```markdown
# 🃏 Card Matching Game in Java

This is a simple console-based card matching game implemented in Java. The player is prompted to match pairs of hidden cards by selecting their indices. The game continues until all pairs are found.

## 🎮 How It Works

- The user inputs the total number of cards (must be even).
- The program fills the card array with mirrored pairs of characters (e.g., A, B, C…).
- All cards are hidden initially.
- The user selects two indices per turn to reveal cards.
- If the selected cards match, they are permanently revealed.
- The game ends when all pairs are found.

## 🧠 Game Logic

- Cards are stored in a `char[] ans` array.
- A duplicate array `char[] dup` is used to track revealed cards.
- Matching logic compares `ans[i]` and `ans[j]`.
- The game tracks the number of matched pairs using `found`.

## 📝 Sample Output

```
enter number of cards:
6

     0         1         2         3         4         5    
|         |         |         |         |         |         |
enter the first card index value from 0 to 6
0
enter the second card index value from 0 to 6
5

1 Pairs are found
...
Congartualtions Well done @
```

## 🚀 How to Run

1. Compile the program:
   ```bash
   javac Main.java
   ```

2. Run the program:
   ```bash
   java Main
   ```

## 📦 Requirements

- Java 8 or higher
- Terminal or command-line interface

## 📌 Notes

- Input must be an even number to ensure proper pairing.
- Invalid or repeated indices are handled gracefully.

## ✨ Author

Created by Saiteja — passionate about Java, backend systems, and game logic.

```

---

Let me know if you want a version with screenshots, GitHub badges, or instructions for packaging it into a runnable JAR.

