package Important;
import javax.swing.*;

public class UserInput {
//    public UserInput(){
//        //this space for rent...
//    }

    public static int getInteger(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,""));
    }

    public static int getInteger(String text){
        return Integer.parseInt(JOptionPane.showInputDialog(null, text));
    }


    public static String getString(String text){
        return (JOptionPane.showInputDialog(null, text));
    }

    public static String getString(){
        return (JOptionPane.showInputDialog(null,""));
    }

    public static double getDouble(String text){
        return Double.parseDouble(JOptionPane.showInputDialog(null, text));
    }

    public static double getDouble(){
        return Double.parseDouble(JOptionPane.showInputDialog(null,""));
    }
    public static void show(String text){
        JOptionPane.showMessageDialog(null, text);
    }

    public static void main(String[] args) {
        show(getString());
    }
}
