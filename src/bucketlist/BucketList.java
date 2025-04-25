package bucketlist;

import java.util.*;

public class BucketList {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bucket List ");

        Travel travel = new Travel();
        travel.captureUserDetails();
        travel.showTravelPlans();

        Display display = new Display();
        display.forFather();
        display.forThySelf();
        display.rule();

        Hunt hunt = new Hunt();
        hunt.rule();
    }
}

class Travel {
    private String name;
    private int age;

    private static final String MSG_VISIT = "Visit Old Trafford";
    private static final String MSG_TREK = "Go Trekking on Mount Ras Dejen";
    private static final String MSG_PILGRIMAGE = "Go on Pilgrimage to Lalibela";
    private static final String MSG_LIVE_FULL = "Live Life to the Fullest";

    public void captureUserDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = sc.nextLine().trim();

        while (true) {
            System.out.print("Enter your age: ");
            try {
                this.age = Integer.parseInt(sc.nextLine().trim());
                if (age > 0) break;
                else System.out.println("Age must be positive.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
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
    protected String character = "HONOURABLE";

    public abstract void forFather();
    public abstract void forThySelf();
}

class Display extends Become {
    @Override
    public void forFather() {
        System.out.println("\n For Father:");
        System.out.println("- Make Father Truly Proud");
    }

    @Override
    public void forThySelf() {
        System.out.println("\n For Thyself:");
        System.out.println("- Find My Passion");
        System.out.println("- Excel at My Field");
        System.out.println("- Finish My TO-READ LIST");
        System.out.println("- Coach a Football Team");
    }

    public void rule() {
        System.out.println("\n Life Philosophy:");
        System.out.println("- Rule my Life");
        System.out.println("- Raise Children by the Laws of the Lord");
    }
}

class Hunt extends Display {
    @Override
    public void rule() {
        System.out.println("\n Career Aspirations:");
        System.out.println("- Dominate in the Career World");
    }
}
