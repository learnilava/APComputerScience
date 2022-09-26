package Week3.SkillPracticeOne;

import Important.Input;

public class Problem3 {
    public static void main(String[] args) {
        problem3();
    }

    public static void problem3(){
        boolean incompatible = true;
        String[] quiz = {"", "", "", ""};
        String weight = "";
        double[] quizTotal = {0, 0};
        double[] weights = {0, 0};
        int[] lengthResult = {0, 0};


        while (incompatible){
            incompatible = false;

            quiz[0] = Input.getString("Enter the result of Quiz 1, result/total\n ex. 10/10");
            quiz[1] = Input.getString("Enter the result of Quiz 2, result/total\n ex. 10/10");
            quiz[2] = Input.getString("Enter the result of Quiz 3, result/total\n ex. 10/10");
            quiz[3] = Input.getString("Enter the result of the Test, result/total\n ex. 10/10");
            weight = Input.getString("Enter the weight of the quiz and test\nQuiz, Test % form ex, 50, 50");


            try{
                weights[0] = Double.parseDouble(weight.split(", ")[0]);
                weights[1] = Double.parseDouble(weight.split(", ")[1]);

                if ((weights[0] + weights[1]) - 1 < 0.001){
                    throw new NumberFormatException();
                }

                weights[0] /= 100.0;
                weights[1] /= 100.00;


                for (int i = 0; i < 4; i++) {
                    String[] x = quiz[i].split("/");
                    if (i == 4){
                        quizTotal[0] += Double.parseDouble(x[0]) * weights[1];
                        quizTotal[1] += Double.parseDouble(x[1]) * weights[1];
                    } else {
                        quizTotal[0] += Double.parseDouble(x[0]) * weights[0];
                        quizTotal[1] += Double.parseDouble(x[1]) * weights[0];
                    }
                }


            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                incompatible = true;
            }
            lengthResult[0] = String.valueOf(quizTotal[0]).split("\\.")[0].length();
            lengthResult[1] = String.valueOf(quizTotal[1]).split("\\.")[1].length();
        }
        String[] total = {String.valueOf(quizTotal[0]).substring(0, lengthResult[0] + 2), String.valueOf(quizTotal[1]).substring(0, lengthResult[1] + 2)};
        String percent = (String.valueOf(Double.parseDouble(total[0])/Double.parseDouble(total[1]) * 100.000) + "000").substring(0, 6);

        Input.show(percent + "% or " + (Double.parseDouble(total[0])/4.0) + "/" + Double.parseDouble(total[1])/4.0);
    }
}
