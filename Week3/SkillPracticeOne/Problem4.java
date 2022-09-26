package Week3.SkillPracticeOne;

import Important.Input;

public class Problem4 {
    public static void main(String[] args) {
        problem4();
    }

    public static void problem4(){
        double[] price = {13.49, 12.99, 11.89};
        String[] menu = {"Pepperoni", "Cheese", "Veggie"};
        double total = 0;

        for (int i = 0;i < 3;i++){
            String choice = Input.optionDialog("Eugene Lee's Fantastica Pizzeria", "Select an option", menu, "Pepperoni");

            if(choice == null){
                break;
            }

            int amount = Input.getInt("Enter the amount");

            switch (choice) {
                case "Pepperoni" -> total += price[0] * (double) amount;
                case "Cheese" -> total += price[1] * (double) amount;
                case "Veggie" -> total += price[2] * (double) amount;

            }
        }
        String[] totalString = {String.valueOf(total) + "000", String.valueOf(total*1.07) + "000"};
        String[] totalString0 = totalString[0].split("\\.");
        String[] totalString1 = totalString[1].split("\\.");

        totalString[0] = totalString0[0] + "." + totalString0[1].substring(0, 2);
        totalString[1] = totalString1[0] + "." + totalString1[1].substring(0, 2);

        String[] responses = {"Send to Problem 8", "Finish"};
        if (Input.option("Subtotal: $$ " + totalString[0] + "  + tax 7% \nTotal: " + totalString[1], "", responses) == 0){
            Problem8.displayResult(Double.parseDouble(totalString[1]));
        }
    }
}
