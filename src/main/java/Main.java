import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your pet's name here: ");
        String petName = scanner.nextLine();
        System.out.println("Enter your pet's favourite action: ");
        String petAction = scanner.nextLine();
        System.out.println(petName + " likes to " + petAction + ".");

    }
}
