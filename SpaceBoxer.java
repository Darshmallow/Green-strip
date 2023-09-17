import java.util.HashMap;
import java.util.Scanner;

public class SpaceBoxer {

    public static void main(String[] args) {

        double[] gravities = {0.78, 0.39, 2.65, 1.17, 1.05, 1.23};
        String names = """
                1. Venus
                2. Mars
                3. Jupiter
                4. Saturn
                5. Uranus
                6. Neptune
                """;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How heavy are you on Earth?");
        int weight = scanner.nextInt();
        System.out.println("Which planet are you visiting?");
        System.out.println(names);
        int planet = scanner.nextInt();

        double changedWeight = weight * gravities[planet - 1];

        System.out.println("Your weight would be " + changedWeight + " on that planet");
        }


    }
