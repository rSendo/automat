package com.company;

import java.util.Scanner;


public class CoffeeMachine {
    int drinkSelection;
    public int coinThrownIn;
    public int drinksPrice = 2;
    public Scanner scanner = new Scanner(System.in);

    String[] listOfDrinks = new String[]{"WhiteCoffee", "BlackCoffee", "Chocolate"};
    int numberOfAvailableDrinks = 20;


    public void selectADrink() {
        System.out.println("Please select your drink (1, 2 or 3)");


        int drinkSelection = scanner.nextInt();

        switch (drinkSelection) {
            case 1:
                drinkSelection = "WhiteCoffee";
                break;

            case 2:
                drinkSelection = "BlackCoffee";
                break;

            case 3:
                drinkSelection = "Chocolate";
                break;
        }
    }

    public void putACoin() {
        System.out.println("Please put a coin");
        coinThrownIn=scanner.nextInt();
        if (coinThrownIn < drinksPrice) {
            System.out.println("The drink you've selected costs " + drinksPrice + "!");
        }
    }

    public void makeACoffee() throws InterruptedException {
        if (numberOfAvailableDrinks > 0) {

            numberOfAvailableDrinks = numberOfAvailableDrinks - 1;

            System.out.println("We prepare your drink.... 10%");
            Thread.sleep(1000);
            System.out.println("We prepare your drink.... 60%");
            Thread.sleep(1000);
            System.out.println("We prepare your drink.... 90%");
            Thread.sleep(1200);
            System.out.println("Your drink is ready. Enjoy!");

        } else {
            System.out.println("Sorry, the selected drink is unavailable now. Please call the service +48420357323");
            cashBack();
        }
    }

    public void throwAChange() {
        System.out.println("Don't forget to take your change!");
        int change = coinThrownIn - drinksPrice;
    }

    public void cashBack() {
        System.out.println("Please take your money back");
        int cashback = coinThrownIn;
    }

}
