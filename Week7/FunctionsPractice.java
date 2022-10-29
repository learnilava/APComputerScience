package Week7;

import Important.Input;

public class FunctionsPractice
{

    public static void addition()
    {
        int num1, num2;

        num1 = Input.getInt("Enter Number 1");
        num2 = Input.getInt("Enter Number 2");
        System.out.println(num1 + " plus " + num2+ " = " + (num1+num2));
    }
 

    public static int subtraction()
    {
        int num1, num2;
        num1 = Input.getInt("Enter Number 1");
        num2 = Input.getInt("EnterNumber2");
        return (num1 - num2);
    }

    public static int multiplication(int integer1, int integer2)
    {
        return(integer1 * integer2);
    }

    public static double division(int num1, int num2)
    {
        if (num2 == 0)
        {
            return 0;
        }
        return num1/num2;
    }

    public static String name(String Salutation)
    {
        String name;
        System.out.println(Salutation);
        name = Input.getString("What's your name");
        return (name);
    }

    public static void main(String[] args)
    {


    }
}
