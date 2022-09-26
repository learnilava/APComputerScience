package Week3.SkillPracticeOne;

import Important.Input;

public class Problem6 {
    public static void main(String[] args) {
        problem6();
    }

    public static void problem6(){
        Input.show(String.valueOf((Input.getDouble("Input the Temperature Celsius")*9/5.0) + 32) + "°F");
    }
}
