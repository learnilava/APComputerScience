package Week7;

import Important.Input;

import javax.swing.*;
import java.util.TreeMap;
import java.util.concurrent.LinkedTransferQueue;

public class SkillPractice2
{

    public static void main(String[] args)
    {

//        problem4c();
        charGrid();
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
        while (guess != compGuess)
            guess = Input.getInt("Invalid try again");
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
                guess = Input.getInt("Burning");
            else if (Math.abs(guess - compGuess) <= 10)
                guess = Input.getInt("Getting there");
            else if (Math.abs(guess - compGuess) > 10)
                guess = Input.getInt("Lukewarm");
            else if (Math.abs(guess - compGuess) > 20)
                guess = Input.getInt("Freezing");

        }
        Input.show("YAY The number is indeed " + compGuess);
    }

    private static void problem4c()
    {
        String range = Input.getString("Range ex. 1-10");
        String[] rangeNum = (range.split("-"));
        int[] numberRange = {Integer.parseInt(rangeNum[0]), Integer.parseInt(rangeNum[1])};
        int compGuess = (int)(Math.random() * (numberRange[1] - numberRange[0])) + numberRange[0];
        boolean guess = true;
        int guessNum;
        System.out.println(compGuess);
        while (guess)
        {
            guessNum = Input.getInt("Input Guess");
            if (guessNum == compGuess)
            {
                Input.show("GREAT");
                break;
            }
//            else if (Math.abs(guess - compGuess) <= 10)
//                guessNum = Input.getInt("Getting there");
//            else if (Math.abs(guess - compGuess) > 10)
//                guessNum = Input.getInt("Lukewarm");
//            else if (Math.abs(guess - compGuess) > 20)
//                guessNum = Input.getInt("Freezing");
        }
    }

    private static void charGrid()
    {
        int col = Input.getInt("How many columns?");
        int rows = Input.getInt("How many rows?");
        String finals = "";
        for (int i = 0; i < rows; i++)
        {
            if (i % 2 == 0)
            {
                for (int e = 0; e < col; e++)
                {
                    if (e % 2 == 0)
                    {
                        finals += "*";
                    } else
                    {
                        finals += "|";
                    }
                }
                finals += "\n";
            }
            else
            {
                for (int e = 0; e < col; e++)
                {
                    if (e % 2 == 0)
                    {
                        finals += ("-");
                    } else
                    {
                        finals += "+";
                    }
                }
                finals += "\n";
            }
        }
        System.out.println(finals);
    }
}
