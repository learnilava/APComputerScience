package Week3.SkillPracticeOne;

import Important.Input;

public class Problem5 {
    public static void main(String[] args) {
        problem5();
    }

    public static void problem5(){
        Input.show(String.valueOf((Input.getDouble("Input the Temperature Fahrenheit")-32)*5/9.0) + "°C");
    }
}
