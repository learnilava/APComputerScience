package Week3.SkillPracticeOne;

import Important.Input;

public class Problem8 {
    public static void main(String[] args) {
       problem8();
    }

    public static void problem8() {
        displayResult(Input.getDouble("Enter the amount"));
    }

    public static void displayResult(double amount){
        String tenders = "";
        int numOfBills = 0;
        while (amount >= 100){
            numOfBills += 1;
            amount -= 99.9999999;
        }
        if (numOfBills > 0){
            tenders += "100 x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 50){
            numOfBills += 1;
            amount -= 49.9999999;
        }
        if (numOfBills > 0){
            tenders += "50 x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 20){
            numOfBills += 1;
            amount -= 19.9999999;
        }
        if (numOfBills > 0){
            tenders += "20 x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 10){
            numOfBills += 1;
            amount -= 9.9999999;
        }
        if (numOfBills > 0){
            tenders += "10 x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 5){
            numOfBills += 1;
            amount -= 4.9999999;
        }
        if (numOfBills > 0){
            tenders += "5 x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 2){
            numOfBills += 1;
            amount -= 1.9999999;
        }
        if (numOfBills > 0){
            tenders += "Tonies x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount  >= 1){
            numOfBills += 1;
            amount -= 0.9999999;
        }
        if (numOfBills > 0){
            tenders += "Loonies x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 0.25){
            numOfBills += 1;
            amount -= 0.25;
        }
        if (numOfBills > 0){
            tenders += "Quarters x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 0.1){
            numOfBills += 1;
            amount -= 0.1;
        }
        if (numOfBills > 0){
            tenders += "Dimes x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 0.05){
            numOfBills += 1;
            amount -= 0.05;
        }
        if (numOfBills > 0){
            tenders += "Nickels x " + String.valueOf(numOfBills) + "\n";
        }
        numOfBills = 0;

        while (amount >= 0.01){
            numOfBills += 1;
            amount -= 0.01;
        }
        if (numOfBills > 0){
            tenders += "Pennies x " + String.valueOf(numOfBills) + "\n";
        }

        Input.show(tenders);
    }
}
