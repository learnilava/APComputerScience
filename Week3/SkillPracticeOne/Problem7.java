package Week3.SkillPracticeOne;

import Important.Input;

public class Problem7 {
    public static void main(String[] args) {
        problem7();
    }

    public static void problem7(){
        int classSize = Input.getInt("Enter the number of players total");
        if (classSize%6 == 0){
            Input.show(classSize + " people make " + classSize/6 + " teams perfectly!");
        } else if (classSize%6 == 1){
            Input.show(classSize + " people make " + classSize/6 + " teams with 1 extra");
        } else {
            Input.show(classSize + " people make " + classSize/6 + " teams with " + classSize%6 + " extras");
        }
    }
}