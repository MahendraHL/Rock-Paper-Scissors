import java.util.Scanner;

public class RockPaperScissors 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Entering the name of the players
        System.out.print("Enter the name of player 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Enter the name of player 2: ");
        String player2 = scanner.nextLine();

        int player1_Score = 0;
        int player2_Score = 0;

        // Playing the game until player quits
        while (true) {
            System.out.println();
            System.out.println("Round " + (player1_Score + player2_Score + 1));

            // obtain the player moves
            System.out.print(player1 + ", enter your move (rock, paper, or scissors): ");
            String player1Move = scanner.nextLine();
            System.out.print(player2 + ", enter your move (rock, paper, or scissors): ");
            String player2Move = scanner.nextLine();

            // Determine the winner
            int result = compareMoves(player1Move, player2Move);

            // Update the scores
            if (result > 0) {
                player1_Score++;
                System.out.println(player1 + " wins the game!!!");
            } else if (result < 0) {
                player2_Score++;
                System.out.println(player2 + " wins the game!!!");
            } else {
                System.out.println("Game ends in Draw!");
            }

            // Display the scores
            System.out.println(player1 + ": " + player1_Score);
            System.out.println(player2 + ": " + player2_Score);

            // Ask if the players want to continue
            System.out.print("Do you want to play again? (y/n): ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        // Display the final scores
        System.out.println();
        System.out.println("Final scores:");
        System.out.println(player1 + ": " + player1_Score);
        System.out.println(player2 + ": " + player2_Score);
    }

    public static int compareMoves(String move1, String move2) {
        if (move1.equals(move2)) 
        {
            return 0;
        }
      else if (move1.equals("rock") && move2.equals("scissors")
                || move1.equals("scissors") && move2.equals("paper")
                || move1.equals("paper") && move2.equals("rock")){
            return 1;
      }
      else {
            return -1;
        }
    }
}
