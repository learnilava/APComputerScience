import javax.swing.*;

public class FractionsCalculator {
    public static String add(String fraction1, String fraction2) {
        return "";
    }

    public static void main(String[] args) {
        int n2 = 1; //init Values
        int n1 = 1;
        int d1 = 1;
        int d2 = 1;

        int rd = 0; //result den
        int rn = 0; //result num

        String opChoice = "";
        while (true) {
            while (true) { // Fraction 1
                boolean done = false;
                try {
                    //String split and set frac 1 values
                    String[] f = JOptionPane.showInputDialog(null, "Enter Fraction 1").split("/");
                    n1 = Integer.parseInt(f[0]);
                    d1 = Integer.parseInt(f[1]);
                    done = true;
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException ignored) {
                } //Invoked will reset while loop
                if (done && d1 != 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "The Denominator can not be 0");
                }
            }
            while (true) { // Fraction 2
                boolean done = false;
                try {
                    //String split and set frac 1 values
                    String[] f = JOptionPane.showInputDialog(null, "Enter Fraction 1").split("/");
                    n1 = Integer.parseInt(f[0]);
                    d1 = Integer.parseInt(f[1]);
                    done = true;
                } catch (ArrayIndexOutOfBoundsException | NumberFormatException ignored) {}

                if (done && d1 != 0) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "The Denominator can not be 0");
                }
            }
            String[] op = {"+", "-", "*", "/"};
            opChoice = (String) JOptionPane.showInputDialog(null, "Select Operation", "000", JOptionPane.QUESTION_MESSAGE, null, op, "+");
            if (JOptionPane.showConfirmDialog(null, n2 + "/" + d1 + opChoice + n2 + "/" + d2) == 0) {
                break;
            }
        }

//        Computing
        if (opChoice.equals("+")) {
            rn = (n1 * d2) + (n2 * d1);
            rd = d1 * d2;
        } else if (opChoice.equals("-")) {
            rn = (n1 * d2) - (n2 * d1);
            rd = d1 * d2;
        } else if (opChoice.equals("*")) {
            rn = (n1 * n2);
            rd = d1 * d2;
        } else if (opChoice.equals("/")) {
            rn = (n1 * d2);
            rd = d1 * n2;
        }
        int[] results = fractionMaker(rn, rd);
        System.out.println(results[0] + "/" + results[4]);
        System.out.println(results[1] + "/" + results[5]);
        System.out.println(results[2] + "/" + results[4] + "   -->   " + results[6]);
//        System.out.println(results[] + "/" + results[]);
//        System.out.println(results[] + "/" + results[]);
//        System.out.println(results[] + "/" + results[]);
//        System.out.println(results[] + "/" + results[]);
//        System.out.println(results[] + "/" + results[]);
    }

    public static int[] fractionMaker(int n, int d) {
        int[] results = {n, 1, 1, 1, d, 1, 0, 0}; //n1, n2, n3, n4  d1, d2 || normal, simplified, n3: mixed normal, n4: mixed simplified
        // (the 0 is for the mixed number conversions and closest int calculations)

        //simplified
        int[] reduced = reducer(d, n);
        results[1] = reduced[0];
        results[5] = reduced[1];

        //Mixed number
        results[2] = n % d;
        results[6] = n / d;
        results[3] = n - (results[6] * results[5]);

        //Closest int
        results[7] = n % d;
        if (d <= n * 2) {
            results[7]++;
        }

        return results;
    }

    public static int[] reducer(int d1, int d2) {
        if (d1 == 0) {
            return new int[]{0, 0};
        }
        int gcf = GCF(d1, d2);
        d1 %= gcf;
        d2 %= gcf;

        if (d1 == 0) {
            d1 = 1;
        }
        if (d2 == 0) {
            d2 = 1;
        }

        return new int[]{d1, d2};
    }

    public static int GCF(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        if (b == 0) {
            return a;
        } else {
            return (GCF(b, a % b));
        }
    }
}
