# Rock-Paper-Scissors
*** This is a task given by Kalvium ***

This is a Java program that implements the classic game of rock-paper-scissors. It allows two players to play the game, with the program keeping track of their scores.

The program starts by importing the Scanner class from the java.util package, which is used to read user input from the console.

The main method prompts the users to enter their names, and initializes the players' scores to 0. The game then starts in a loop that runs until the players decide to quit.

Inside the loop, the program prompts the players to enter their moves, and then calls the compareMoves method to determine the winner. If the result is positive, the first player wins and their score is incremented. If the result is negative, the second player wins and their score is incremented. If the result is 0, the game ends in a draw.

After each round, the program displays the scores and prompts the players to continue or quit. If they choose to quit, the loop exits and the final scores are displayed.

The compareMoves method takes two arguments (the moves made by the two players) and returns an integer representing the result of the game. If the moves are the same, the method returns 0. If the first move beats the second move (rock beats scissors, scissors beats paper, paper beats rock), the method returns 1. Otherwise, it returns -1.
