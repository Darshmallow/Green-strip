import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        System.out.println("Which one is the worst language in the world \n"
                + "\t 1) Python" + "\t 2) English" + "\t 3) Java");
        int ans1 = scanner.nextInt();
        if (ans1 == 1) {
            System.out.println("I agree, python is the worst");
            score++;
        }
        else {
            System.out.println("Are you sure? Python is worse");
        }
        System.out.println("Is thermal energy potential energy? \n"
                + "\t 1) Yes" + "\t 2) No");
        int ans2 = scanner.nextInt();
        if (ans2 == 2) {
            System.out.println("Correct! It's a kinetic energy");
            score++;
        }
        else {
            System.out.println("Ms. Kim will be disappointed at you");
        }
        System.out.println("What is the default value of g (acceleration due to gravity) when not specified \n"
                + "\t 1) 9.8" + "\t 2) 8.8" + "\t 3) 9.5");
        int ans3 = scanner.nextInt();
        if (ans3 == 1) {
            System.out.println("Great job! You'll be fine on your quiz!");
            score++;
        }
        else {
            System.out.println("I'm worried about your physic quiz");
        }
        System.out.println("Your score is: " + score + "/3!");
    }
}
