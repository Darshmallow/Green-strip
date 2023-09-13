import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name again?");
        String name = scanner.nextLine();
        System.out.println("So, " + name + ", how old are you?");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You can't drive");
        }
        else if (age < 18){
            System.out.println("You can drive but you can't vote");
        }
        else if (age < 25){
            System.out.println("You can vote but not rent a car");
        }
        else {
            System.out.println("You can pretty much do anything!");
        }
    }
}
