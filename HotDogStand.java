import java.util.Scanner;

public class HotDogStand {
    public static void main(String[] args) {
        // Hot Dog Stand
        double priceHotDog = 5.50;
        double priceDrink = 2.0;
        double taxMultiplier = 1.12;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hotdogs would you like?");
        int hotdogs = scanner.nextInt();
        System.out.println("How many drinks would you like?");
        int drinks = scanner.nextInt();

        double total = (priceHotDog * hotdogs + priceDrink * drinks) * taxMultiplier;
        System.out.println("Your total is: $" + total);
    }
}
