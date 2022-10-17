import Important.Input;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numString = String.valueOf(Input.getInt("Number Please"));

        String lastNum = numString.substring(numString.length()-1);

        if (lastNum.equals("4")){
            Input.show("Unlucky for Asians");
        }
        if (lastNum.equals("8")){
            Input.show("Unlucky for Asians");
        }
        if (numString.equals("13"))
            Input.show("Unlucky for Westerners");
        if (numString.equals("7"))
            Input.show("Lucky for Westerners");
    }
}
