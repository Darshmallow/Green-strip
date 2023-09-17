import java.util.Scanner;
import java.util.Map;
public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> rps = Map.of(          //Create a map so that it's easier for me to print out choices later
                1, "rock",
                2, "paper",
                3, "scissor"
        );
        System.out.println("I've decided my choice, do you want to put:\n" +
                " 1) Rock \t 2) Paper \t 3) Scissor \t -1) Exit \nEnter your choice #");      //Asks the user their choices
        int wins = 0;           //initialize wins and loses
        int loses = 0;
        int user = scanner.nextInt();
        while (user != -1) {            //while the user doesn't want to exit
            while (!(user >= 1 && user <= 3)) {     //Keep on asking the user to input until the input is in range
                user = scanner.nextInt();
                System.out.println("Please enter again");
            }
            int comp = (int) (Math.random() * 3) + 1;       //Get a random int from 1-3 (inclusive)
            System.out.println("\nI put " + rps.get(comp) + ", you put " + rps.get(user) + "\n");    //Print out choices
            if (comp == user) {         //Figure out the results of the game
                System.out.println("We draw!");
            } else if ((comp == 1 && user == 2) || (comp == 2 && user == 3) || (comp == 3 && user == 1)) {
                System.out.println("Oh noooooo I've lost. You win!");
                wins++;
            } else {
                System.out.println("Yay I've won!!!");
                loses++;
            }
            System.out.println("------------------------------------");
            System.out.println("Wins: " + wins + "\tLoses: " + loses);
            System.out.println("Let's play again! do you want to put:\n"  +
                    "1) Rock \t 2) Paper \t 3) Scissor \t -1) Exit \nEnter your choice #");
            user = scanner.nextInt();
        }
        System.out.println("That was fun. See you next time!");
    }
}
