package Week7;

import Important.Input;

public class StringAdv
{
    public static void main(String[] args)
    {

        String firstName = Input.getString("Fname");
        String lastName = Input.getString("Lname");
        String finalResult = "";

        int fNameLength = firstName.length();
        int lNameLength = lastName.length();

        finalResult = "Your names combined have " + String.valueOf(fNameLength + lNameLength) + " Characters\n";

        if (firstName.charAt(0) == lastName.charAt(0))
            finalResult += "Your first name both begin with " + firstName.charAt(0) + "\n";

        if (firstName.charAt(fNameLength - 1) == lastName.charAt(lNameLength - 1))
            finalResult += "Your first name both end with " + firstName.charAt(0) + "\n";

        if (fNameLength > lNameLength)
            finalResult += "Your first name is longer than your last name \n";
        else
            finalResult += "Your last name is longer than your first name \n";

        Input.show(finalResult);
    }
}
