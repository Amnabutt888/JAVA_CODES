import java.util.Scanner;

public class Guessing_game{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);

        int guess;   // declared here

        do {
            System.out.println("guess my number(0-100) : ");
            guess = sc.nextInt();

            if (guess == myNumber) {
                System.out.println("woohoo ...You guessed it!");
                break;

            } else if (guess > myNumber) {
                System.out.println("your number is large ...!");

            } else {
                System.out.println("your number is too small...!");
            }

        } while (guess >= 0);

        System.out.println("my number was : ");
        System.out.println(myNumber);

        sc.close();
    }
}