# Number Guessing Game

## Description
This repository contains a **CLI-based Number Guessing Game** built using Java. The game challenges players to guess a randomly selected number within a limited number of attempts. The difficulty level can be adjusted to make the game easier or harder.

This project is part of the **Roadmap Project - Number Guessing Game** and is based on my understanding. Feel free to comment if you have any suggestions or discussions!

## Rules of The Games
- The computer should randomly select a number between **1 and 100.**
- The user selects a difficulty level:
    - Easy (10 chances)
    - Medium (5 chances)
    - Hard (3 chances)
- The user enters their guess.
- If the guess is correct, the game congratulates the player and displays the number of attempts.
- If the guess is incorrect, the game hints whether the number is higher or lower.
- The game ends when the player guesses the correct number or runs out of attempts.

## Installation & Usage

### **Technologies**
- Java Development Kit (JDK) installed (Java 8+ Recommended).

### **Steps to Run**
1. Clone the repository: 
    ```ssh
    git clone https://github.com/juliaagnes16/NumberGuessingGame
    ```
2. Compile the Java file:
    ```ssh
    javac NumberGuessingGame.java
    ```
3. Run the game:
    ```ssh
    java NumberGuessingGame
    ```

## Example Output
    Welcome to the Number Guessing Game!
    I'm thinking of a number between 1 and 100.
    You have 5 chances to guess the correct number.

    Please select the difficulty level:
    1. Easy (10 chances)
    2. Medium (5 chances)
    3. Hard (3 chances)

    Enter your choice: 2

    Great! You have selected the Medium difficulty level.
    Let's start the game!

    Enter your guess: 50
    Incorrect! The number is less than 50.

    Enter your guess: 25
    Incorrect! The number is greater than 25.

    Enter your guess: 35
    Incorrect! The number is less than 35.

    Enter your guess: 30
    Congratulations! You guessed the correct number in 4 attempts.

## Link Roadmap
    https://roadmap.sh/projects/number-guessing-game
