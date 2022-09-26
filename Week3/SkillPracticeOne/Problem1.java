package Week3.SkillPracticeOne;

import Important.Input;

public class Problem1 {
    public static void main(String[] args) {
        problem1();
    }
    public static void problem1(){
        boolean incompatible = true;
        String[] quiz = {"", "", ""};
        double[] quizTotal = {0, 0};
        int[] lengthResult = {0, 0};

        while (incompatible){
            incompatible = false;

            quiz[0] = Input.getString("Enter the result of Quiz 1, result/total\n ex. 10/10");
            quiz[1] = Input.getString("Enter the result of Quiz 2, result/total\n ex. 10/10");
            quiz[2] = Input.getString("Enter the result of Quiz 3, result/total\n ex. 10/10");


            for (int i = 0; i < 3; i++) {
                try{
                    String[] x = quiz[i].split("/");
                    quizTotal[0] += Double.parseDouble(x[0]);
                    quizTotal[1] += Double.parseDouble(x[1]);
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    incompatible = true;
                }
            }
            lengthResult[0] = String.valueOf(quizTotal[0]).split("\\.")[0].length();
            lengthResult[1] = String.valueOf(quizTotal[1]).split("\\.")[1].length();
        }
        String[] total = {String.valueOf(quizTotal[0]).substring(0, lengthResult[0] + 2), String.valueOf(quizTotal[1]).substring(0, lengthResult[1] + 2)};
        String percent = (String.valueOf(Double.parseDouble(total[0])/Double.parseDouble(total[1]) * 100.000) + "000").substring(0, 6);

        Input.show(percent + "%");
    }
}
