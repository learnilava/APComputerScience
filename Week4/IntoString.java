package Week4;

import Important.Input;

public class IntoString {
    public static void main(String[] args) {
        String[] name = {"first", "middle", "last"};

        name[0] = Input.getString("What is your name");
        name[1] = Input.getString("What is your middle name");
        name[2] = Input.getString("What is your last name");
        System.out.println("Hi My name is " + name[0]);
        System.out.println("\nNice to meet you " + name[0]);
        System.out.println("your name is kool. ");
        System.out.println("\n/'m named after a floating piece of wood =(");
    }
}
