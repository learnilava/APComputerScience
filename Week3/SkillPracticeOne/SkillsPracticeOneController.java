package Week3.SkillPracticeOne;

public class SkillsPracticeOneController {
    public static void main(String[] args) {
        String[] options = {"Problem 1", "Problem 2", "Problem 3", "Problem 4", "Problem 5", "Problem 6", "Problem 7"};
        while (true){
//            String selection = Input.optionDialog("Selection", "Select an option", options, "Problem 1");
            String selection = "Problem 8";
            switch (selection) {
                case "Problem 1" -> Problem1.problem1();
                case "Problem 2" -> Problem2.problem2();
                case "Problem 3" -> Problem3.problem3();
                case "Problem 4" -> Problem4.problem4();
                case "Problem 5" -> Problem5.problem5();
                case "Problem 6" -> Problem6.problem6();
                case "Problem 7" -> Problem7.problem7();
                case "Problem 8" -> Problem8.problem8();
            }
        }
    }
}
