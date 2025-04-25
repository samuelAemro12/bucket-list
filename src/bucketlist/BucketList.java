import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bucket List");

        Travel travel = new Travel();
        travel.visit();
    }
}

class Travel {
    String name;
    int age;

    Travel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your age: ");
        this.age = sc.nextInt();
    }

    public void visit() {
        System.out.println("\nHello " + name + "! Let's build your bucket list.");
        System.out.println("======= THIS IS " + name + "'s BUCKET LIST =======");

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
