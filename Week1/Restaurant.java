package Week1;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        String[] menu = {"Hot Dogs", "Fries", "Chicken", "Soda"};
        Double[] price = {2.50, 1.75, 5.50, 1.25};

        for(int i=0;i < 4;i++) {
            System.out.println(i + ". " + menu[i]);
        }
        Scanner scanner  =new Scanner(System.in);

        int input = 10;
        int number = 0;
        while (input < 0 || input > 4){
            System.out.println("Input a CHOICE");
            input = scanner.nextInt();
            System.out.println("How many would you like?");
            number = scanner.nextInt();
        }
        System.out.println("Your total comes to $2" + price[input]*number + " for all of the " +menu[input] + "s you purchased!");

    }
}
