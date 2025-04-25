import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bucket List");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nHello " + name + "! Let's build your bucket list.");

        if (age < 30) {
            System.out.println("- Visit Old Trafford");
            System.out.println("- Go Trekking on Mount Ras Dejen");
        } else if (age <= 45) {
            System.out.println("- Go on a Pilgrimage to Lalibela");
        } else {
            System.out.println("- Reflect and travel the world with wisdom.");
        }
    }
}
