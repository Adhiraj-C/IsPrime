import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");

        int num = sc.nextInt();
        boolean isprime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                System.out.println(num + " is not a prime number.");
                break;
            }
        }

        if (isprime == true) {
            System.out.println(num + " is a prime number.");
        }
    }
}
