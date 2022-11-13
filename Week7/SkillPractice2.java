package Week7;

import Important.Input;
import Week3.SkillPracticeOne.*;

import javax.swing.*;
import java.util.TreeMap;
import java.util.concurrent.LinkedTransferQueue;

public class SkillPractice2
{

    public static void main(String[] args)
    {
        while (true){
            String[] options = {"Problem 1", "Problem 2b", "Problem 3","Problem 3b", "Problem 4", "Problem 4b", "Problem 4c"};
            String selection = Input.segmentedOption("Selection", "Select an option", options, "Problem 1");
            switch (selection) {
                case "Problem 1" -> problem2b();
                case "Problem 2b" -> problem2b();
                case "Problem 3" -> problem3();
                case "Problem 3b" -> problem3b();
                case "Problem 4" -> problem4(0, 10);
                case "Problem 4b" -> problem4b(1, 10);
                case "Problem 4c" -> problem4c();
            }
        }
    }

    private static void problem1(int min, int max)
    {
        int input = Input.getInt("Enter a num");
        if (input == 0 || input == 1)
        {
            Input.show("0 or 1 are not prime numbers");
            return;
        }

        for (int i = 2; i < (input / 2) + 1; i++)
        {
            if (input % i == 0)
            {
                Input.show("Hooray it is not a prime ");
                return;
            }
        }
        Input.show("NOPE prime");
//        }
    }

    private static void problem2b()
    {
        problem1(0, 10);
    }

    private static void problem3()
    {
        String id = Input.getString("User ID");
        String password = Input.passwordWindow("Passowrd", "");

        if (id.equals("14") && password.equals("myDog"))
            Input.show("Access Granted");
        else
            Input.show("USID or PSWD is invalid");
    }

    private static void problem3b()
    {
        String id, password;
        boolean access = false;

        for (int i = 0; i < 5; i++)
        {
            id = Input.getString("User ID");
            password = Input.passwordWindow("Passowrd", "");

            if (id.equals("14") && password.equals("myDog"))
                access = true;
            else if (password.equals("myDog"))
                Input.show("Invalid User Id PSWD is fine");
            else if (id.equals("14"))
                for (int e = i; e < 5; e++)
                {
                    access = Input.passwordWindow("Invalid Password\nTry again " + (5 - e) + " left", "").equals("myDog");
                    if (access)
                        break;
                }
            else
                Input.show("ALL Wrong, you have " + (5 - i) + " tries left");

            if (access)
                break;
        }
        if (access)
            Input.show("Access Granted");
        else
            Input.show("NO Access 4 u");

    }

    private static void problem4(int min, int max)
    {
        int compGuess = (int)(Math.random() * (max - min)) + min;
        int guess = Input.getInt("Enter Guess");
        System.out.println(compGuess);
        while (guess != compGuess)
        {
            String message = "";
            if (guess > compGuess)
                message = "Too High";
            else
                message = "Too Low";
            guess = Input.getInt("Invalid try again\n" + message);
        }
        Input.show("YES the number was " + compGuess);

    }

    private static void problem4b(int min, int max)
    {
        int compGuess = (int)(Math.random() * (max - min)) + min;
        System.out.println(compGuess);
        int guess = Input.getInt("Enter Guess");
        while (guess != compGuess)
        {
            if (Math.abs(guess - compGuess) < 5)
            {
                if (guess > compGuess)
                    guess = Input.getInt("Too high BURNING");
                else
                    guess = Input.getInt("Too low BURNING");
            }
            else if (Math.abs(guess - compGuess) > 20)
            {
                if (guess > compGuess)
                    guess = Input.getInt("Too high Freezing");
                else
                    guess = Input.getInt("Too low Freezing");
            }
            else if (Math.abs(guess - compGuess) > 10)
            {
                if (guess > compGuess)
                    guess = Input.getInt("Too high Lukewarm");
                else
                    guess = Input.getInt("Too low Lukewarm");
            }
            else
            {
                if (guess > compGuess)
                    guess = Input.getInt("Too high getting there");
                else
                    guess = Input.getInt("Too low getting there");
            }
        }
        Input.show("YAY The number is indeed " + compGuess);
    }

    private static void problem4c()
    {
        String[] options = {"Too High", "Just Right", "Too Low"};
        String range = Input.getString("Range ex. 1-10");
        String[] rangeNum = (range.split("-"));
//        String[] rangeNum = ("1-100000000".split("-"));

        int min = Integer.parseInt(rangeNum[0]);
        int max = Integer.parseInt(rangeNum[1]);
        int guesses = 1;

        while (true)
        {
            int compGuess = (int)(Math.random() * (max - min)) + min;
            int choice = Input.option("How does " + String.valueOf(compGuess) + " sound??", "Guess # " + String.valueOf(guesses), options);
            if (min == max)
            {
                choice = 10;
                Input.show("WOW. I am dumb. It took " + guesses + " guesses There are no more numbers other than " + compGuess + " that satisfies your conditions");
            }
            if (choice == 2)
                min = compGuess + 1;
            else if (choice == 0)
                max = compGuess - 1;
            else
            {
                Input.show("WOW. I got your ugly number in " + guesses + " guesses");
                break;
            }

            guesses++;
        }
    }

}
