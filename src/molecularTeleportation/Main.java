package molecularTeleportation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> subscribers = new ArrayList<String>();

    public static void main (String[] args) throws InterruptedException {
        int balance = 0;
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        System.out.println("0 - Sign Up");
        System.out.println("1 - Login");
        System.out.println("Please enter any options 0 or 1");
        Scanner scan1 = new Scanner(System.in);

        int subscriberFee = 0;
        String userName1 = "";
        String place = "";

        while (!userInput.equals("6")) {
            userInput = scan.nextLine();
            switch (userInput) {
                case "0":
                    System.out.println("Please enter your name:");
                    String userName = scan1.next();
                    System.out.println("Please enter your password:");
                    String password = scan1.next();
                    System.out.println("Please enter your age:");
                    int age = scan1.nextInt();
                    if (age >= 21 && age < 70) {
                        System.out.println("You are allowed to travel. Please continue:");
                    } else {
                        System.out.println("You are not allowed to travel due to safety issues.");
                        System.out.println("Please try again later... ");
                        System.exit(0);
                    }
                    System.out.println("Please enter your SSN:");
                    int ssn = scan1.nextInt();
                    System.out.println("You are successfully signed up!");
                    System.out.println("Enjoy your travel! :)");
                    SignUpLogin signUpLogin = new SignUpLogin();
                    signUpLogin.signUp("Gulaiym", "gulaiym00", 26, 12334566);
                case "1":
                    System.out.println("Please re-sign in now:");
                    System.out.println("Please enter your name:");
                    userName1 = scan1.next();
                    System.out.println("Please enter your password:");
                    String password1 = scan1.next();
                    SignUpLogin signUpLogin1 = new SignUpLogin();
                    signUpLogin1.LogIn("Gulaiym", "gulaiym00");
                    System.out.println("You are successfully logged in!");
                case "2":
                    System.out.println("2 - Travel Options");
                    System.out.println("Where would you like to go? Choose from below: ");
                    for (String city : TravelOption.destinations().keySet()) {
                        System.out.println(city);
                    }
                    String city = scan1.next();
                    for (String city2 : TravelOption.destinations().keySet()) {
                        if (city2.equalsIgnoreCase(city)) {
                            List<String> places = TravelOption.destinations().get(city2);
                            System.out.println("Please choose place you want to teleport?");
                            for (int i = 0; i < places.size(); i++) {
                                System.out.println(places.get(i));
                            }
                            place = scan1.next();
                            for (int i = 0; i < places.size(); i++) {
                                if (places.get(i).equalsIgnoreCase(place)) {
                                    balance = PriceAndDiscount.fee.get(city2);
                                }
                            }
                        }
                    }
                case "3":
                    System.out.println("3 - Here is our Price List for each city");
                    System.out.println(PriceAndDiscount.fee.toString());
                case "4":
                    System.out.println("4 - Subscription");
                    SignUpLogin signUpLogin2 = new SignUpLogin();
                    System.out.println("Hey do you want to be a subscriber?\nY\nN");
                    Scanner input = new Scanner(System.in);
                    String answer = input.next();
                    if (answer.equalsIgnoreCase("Y")) {
                        subscribers.add(userName1);
                        subscriberFee = 500;
                    }
                    System.out.println("Your subscription fee of $500 will be added at Check out!");
                    for (int i = 0; i < subscribers.size(); i++) {
                        if (subscribers.get(i).equalsIgnoreCase(userName1)) {
                            System.out.println("You have %50 discount");
                            balance = PriceAndDiscount.discount(balance, 50);
                        }
                    }
                case "5":
                    System.out.println("5 - Payment");
                    System.out.println("Your balance is: " + (balance + subscriberFee));
                    System.out.println("Please make a payment!");
                    System.out.println("WARNING!!! Please enter VALID price! ");
                    int payment2 = scan1.nextInt();
                    System.out.println("Thank you for your payment.");
                    System.out.println("You will be in " + place + " in 10 seconds");
                    Thread.sleep(10000);
                    System.out.println("You are teleported to " + place);
                    System.out.println("Enjoy your travel! :)");
                    System.exit(0);
                    break;
                case "6":
                    System.out.println("6 - Quit Application");
                    System.exit(0);
                    break;
            }
        }
    }
}
