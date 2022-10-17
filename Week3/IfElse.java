package Week3;

import Important.Input;

public class IfElse {
    public static void main(String[] args)
    {
        String choice = Input.getString("You are Stuck. Do something\n(A) ");

        switch (choice)
    {
        case "Please":
            Input.show("Alright I will let you out");
            break;
        case "please":
            Input.show("Soft but firm. I like it. \n+20 Oz of goLd");
            break;
    }
    }
}