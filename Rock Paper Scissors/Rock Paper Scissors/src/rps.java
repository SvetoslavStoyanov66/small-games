import java.util.Random;
import java.util.Scanner;



public class rps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true) {
           String[] rps = {"r", "p", "s"};
           String computerMove = rps[new Random().nextInt(rps.length)];


           String playerMove;
           while (true) {
               System.out.println("Please enter your move (r, p, or s)");

               playerMove = scanner.nextLine();

               if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                   break;
               }
               System.out.printf(playerMove + "is not a valid move! ");
           }
           System.out.printf("Computer played:" + computerMove);
           if (playerMove.equals(computerMove)) {
               System.out.printf("The game was a tie!");
           } else if (playerMove.equals("r")) {
               if (computerMove.equals("p")) {
                   System.out.printf(" You lose!");
               } else if (computerMove.equals("s")) {
                   System.out.printf(" You win!");
               }
           } else if (playerMove.equals("p")) {
               if (computerMove.equals("s")) {
                   System.out.printf(" You lose!");
               } else if (computerMove.equals("r")) {
                   System.out.printf(" You win!");
               }
           } else if (playerMove.equals("s")) {
               if (computerMove.equals("r")) {
                   System.out.printf(" You lose!");
               } else if (computerMove.equals("p")) {
                   System.out.printf(" You win!");
               }
           }
           System.out.println(" Play again? (y/n)");
           String playAgain = scanner.nextLine();
           if (!playAgain.equals("y")){
               break;
           }
       }
    }
}
