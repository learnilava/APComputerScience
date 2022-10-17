package Important;
import javax.swing.*;

public class Input {
//    public UserInput(){
//        //this space for rent...
//    }

    public static int getInt(String text){
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(null, text));
        } catch (NumberFormatException e){
            return getInt("Not an integer\nTry again");
        }
    }

    public static int getInt(){
        return getInt("");
    }

    public static String getString(String text){
        return (JOptionPane.showInputDialog(null, text));
    }

    public static String getString(){
        return getString("");
    }

    public static double getDouble(String text){
        try {
            return Double.parseDouble(JOptionPane.showInputDialog(null, text));
        } catch (NumberFormatException e){
            return getDouble("Not a double\nTry again");
        }
    }

    public static double getDouble(){
        return getDouble("");
    }

    public static void show(String text){
        JOptionPane.showMessageDialog(null, text);
    }

    public static String segmentedOption(String title, String message, String[] options, String initialValue){
        return (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, initialValue);
    }

    public static int option(String message, String title, String[] responses){
        return JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }

}
