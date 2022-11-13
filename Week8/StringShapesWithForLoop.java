package Week8;

import Important.Input;

public class StringShapesWithForLoop
{
    public static void main(String[] args)
    {
        int row = 5;
        int column = 5;
        int challengeRow = 6;
        int challengeColumn = 6;

        System.out.println(one(row, column));
        System.out.println(two(row, column));
        System.out.println(three(row, column));

        String[] characters= {"+", "O", "X"};
        System.out.println(challenge(challengeRow, challengeColumn, characters));

        String[] news= {"+", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        System.out.println(challenge(19, 19, news));
    }

    private static String charGrid()
    {
        int col = Input.getInt("How many columns?");
        int rows = Input.getInt("How many rows?");
        String finals = "";
        for (int i = 0; i < rows; i++)
        {
            if (i % 2 == 0)
            {
                for (int e = 0; e < col; e++)
                {
                    if (e % 2 == 0)
                    {
                        finals += "*";
                    } else
                    {
                        finals += "|";
                    }
                }
                finals += "\n";
            }
            else
            {
                for (int e = 0; e < col; e++)
                {
                    if (e % 2 == 0)
                    {
                        finals += ("-");
                    } else
                    {
                        finals += "+";
                    }
                }
                finals += "\n";
            }
        }
        return finals;
    }

    public static String  one(int row, int col)
    {
        String finalShape = "";
        for (int currentRow = 0; currentRow < row; currentRow++)
        {
            finalShape += "*";
            for (int currentColumn = 0; currentColumn < col - 2; currentColumn++)
                if (currentRow == 0||currentRow == col-1)
                    finalShape += "*";
                else
                    finalShape += " ";
            finalShape += "*\n";
        }
        return finalShape;
    }

    public static String two(int row, int col)
    {
        String finalShape = "";
        for (int currentRow = 0; currentRow < row; currentRow++)
        {
            for (int currentColumn = 0; currentColumn < col; currentColumn++)
            {
                if (currentColumn%2 == 0)
                    finalShape += "X";
                else
                    finalShape += "O";
            }
            finalShape += "\n";
        }
        return finalShape;
    }

    public static String three(int row, int col)
    {
        String finalShape = "";
        int count = 0;
        for (int currentRow = 0; currentRow < row; currentRow++)
        {
            for (int currentColumn = 0; currentColumn < col; currentColumn++)
            {
                if (count%2 == 0)
                    finalShape += "S";
                else
                    finalShape += "O";
                count ++;
            }
            finalShape += "\n";
        }
        return finalShape;
    }

    public static String challenge(int row, int col, String[] chars)
    {
        if (chars.length < row/2)
            throw new IllegalArgumentException("Please match the number of items in array to the number of rows");

        String finalShape = "";
        int uniqueRows = (int)Math.round(((double)row)/2);

        for (int currentRow = 0; currentRow < uniqueRows; currentRow++)
        {
            int maxIndex = (chars.length - 1);
            int currentIndex = 0;
            int minimumSubtractionIndex = col - 2;
            for (int currentColumn = 0; currentColumn < col; currentColumn++)
            {
                finalShape += chars[currentIndex];

                if (currentColumn > minimumSubtractionIndex)
                    currentIndex--;
                else if (currentIndex < maxIndex && currentIndex < currentRow)
                {
                    currentIndex++;
                    minimumSubtractionIndex--;
                }
            }
            finalShape += "\n";
        }

        String[] xSplit = finalShape.split("\n");
        if (row%2 == 1)
            uniqueRows --;

        for (int i = uniqueRows-1; i > -1; i--)
            finalShape += xSplit[i] + "\n";

        return finalShape;
    }
}