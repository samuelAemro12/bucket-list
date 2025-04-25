package bucketlist;

import java.util.*;

public class BucketList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bucket List");
        System.out.println("Enter your name");

        Travel travel = new Travel();
        travel.showTravelPlans();

        Display display = new Display();
        display.goalsForFather();
        display.goalsForSelf();
        display.familyLeadershipGoals();

        Hunt hunt = new Hunt();
        hunt.careerLeadershipGoals();
    }
}

class Travel {

    private int age;
    private String name;

    private static final String MSG_VISIT = "Visit Old Trafford";
    private static final String MSG_TREK = "Go Trekking on Mount Ras Dejen";
    private static final String MSG_PILGRIMAGE = "Go on Pilgrimage to Lalibela";
    private static final String MSG_LIVE_FULL = "Live your life to the fullest, age is just a number!";


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

public void showTravelPlans() {
    System.out.println("======= THIS IS " + name + "'s BUCKET LIST =======");

    List<String> travelPlans = new ArrayList<>();

    if (age < 30) {
        travelPlans.add(MSG_VISIT);
        travelPlans.add(MSG_TREK);
    } else if (age <= 45) {
        travelPlans.add(MSG_PILGRIMAGE);
    } else {
        travelPlans.add(MSG_LIVE_FULL);
    }

    for (int i = 0; i < travelPlans.size(); i++) {
        System.out.println((i + 1) + ". " + travelPlans.get(i));
    }
}

}

abstract class Become {
    String character = "HONOURABLE";

    public abstract void goalsForFather();
    public abstract void goalsForSelf();
}

class Display extends Become {
    public void goalsForFather() {
        System.out.println("Make Father Truly Proud");
    }

    public void goalsForSelf() {
        System.out.println("Find My Passion");
        System.out.println("Excel at My Field");
        System.out.println("Finish My TO-READ LIST");
        System.out.println("Coach a Football Team");
    }

    public void familyLeadershipGoals() {
        System.out.println("Rule my Life");
        System.out.println("Guide my Children as per the Laws of the Lord");
    }
}

class Hunt extends Display {
    public void careerLeadershipGoals() {
        System.out.println("Lead the Career World");
    }
}
