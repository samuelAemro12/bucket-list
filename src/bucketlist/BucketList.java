import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bucket List");

        Travel travel = new Travel();
        travel.visit();

        Display display = new Display();
        display.forFather();
        display.forThySelf();
        display.rule();
        Hunt hunt = new Hunt();
        hunt.rule();

    }
}

    Travel() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();

        System.out.print("Enter your age: ");
        while (true) {
            try {
                this.age = Integer.parseInt(sc.nextLine());
                if (age > 0) break;
                else System.out.print("Please enter a valid age: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
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

abstract class Become {
    abstract public void forFather();
    abstract public void forThySelf();
}

class Display extends Become {
    public void forFather() {
        System.out.println("- Make Father Truly Proud");
    }

    public void forThySelf() {
        System.out.println("- Find My Passion");
        System.out.println("- Excel at my Field");
        System.out.println("- Finish My TO-READ LIST");
        System.out.println("- Coach a football team");
    }
}

class Display extends Become {
    public void forFather() {
        System.out.println("- Make Father Truly Proud");
    }

    public void forThySelf() {
        System.out.println("- Find My Passion");
        System.out.println("- Excel at my Field");
        System.out.println("- Finish My TO-READ LIST");
        System.out.println("- Coach a football team");
    }

    public void rule() {
        System.out.println("- Rule my Life");
        System.out.println("- Rule my Children as the Laws of the Lord dictates");
    }
}
class Hunt extends Display {
    @Override
    public void rule() {
        System.out.println("- Rule The Career World");
    }
}
