package bucketlist;

import java.util.*;

public class BucketList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bucket List");
        System.out.println("Enter your name");

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

class Travel {
    private int age;
    private String name;

    Travel() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("Enter your age:");
        this.age = getValidAge(sc);
    }

    private int getValidAge(Scanner sc) {
        int inputAge = sc.nextInt();
        while (inputAge <= 0) {
            System.out.println("Please enter a valid age:");
            inputAge = sc.nextInt();
        }
        return inputAge;
    }

    public void visit() {
        System.out.println("======= THIS IS " + name + "'s BUCKET LIST =======");

        if (age > 0 && age < 30) {
            System.out.println("Visit Old Trafford");
            System.out.println("Go Treking on Mount Ras Dejen");
        } else if (age >= 30 && age <= 45) {
            System.out.println("Go on Pilgrimage to Lalibella");
        } else {
            System.out.println("Live your life to the fullest, age is just a number!");
        }
    }
}

abstract class Become {
    String character = "HONOURABLE";
    public abstract void forFather();
    public abstract void forThySelf();
}

class Display extends Become {
    public void forFather() {
        System.out.println("Make Father Truly Proud");
    }

    public void forThySelf() {
        System.out.println("Find My Passion");
        System.out.println("Excel at my Field");
        System.out.println("Finish My TO-READ LIST");
        System.out.println("Coach a football team");
    }

    public void rule() {
        System.out.println("Rule my Life");
        System.out.println("Rule my Children as the Laws of the Lord dictate");
    }
}

class Hunt extends Display {
    public void rule() {
        System.out.println("Rule The Career World");
    }
}
