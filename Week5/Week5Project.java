package Week5;

import Important.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Week5Project
{
    public static void main(String[] args)
    {
        //Static
        HashMap<Character, Integer> letterToNumber = new HashMap<Character, Integer>();
        char[] numberToLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //Init Hashmap to letter/num assignments

        for (int i = 0; i < 26; i++)
        {
            letterToNumber.put(numberToLetter[i], i);
        }

        //Non-Static
        ArrayList<String> originalText = textListMaker();
        String[] finalGameOptions = {"New scramble from the same list", "New game with new words", "I am done and want my mommy"};
        String chosenText, cypheredText;

        int shift, shiftDirection, tempLetterIndex, finalGameOptionChoice;


        while (true)
        {
            //Want to add shift guess so not redundant
            shift = (int) (Math.random() * 14);
            shiftDirection = (int) (Math.random() * 2);
            chosenText = originalText.get((int) (Math.random() * originalText.size()));

            cypheredText = "";
            for (int i = 0; i < chosenText.length(); i++)
            {
                tempLetterIndex = letterToNumber.get(chosenText.charAt(i));
                cypheredText += (String.valueOf(numberToLetter[shiftCalculator(shiftDirection, shift, tempLetterIndex)]));
            }

            Input.show(cypheredText);

            if (Input.segmentedOption("", "", originalText.toArray(new String[0]), "").equals(chosenText))
            {
                finalGameOptionChoice = Input.option("WOW End of the Game.", "", finalGameOptions);
            }
            else
            {
                finalGameOptionChoice = Input.option("Ehh", "End of the Game.", finalGameOptions);
            }

            switch (finalGameOptionChoice)
            {
                case 1 -> originalText = textListMaker();
                case 2 -> System.exit(0);
                default -> System.out.println();
            }

        }


    }



    private static ArrayList<String> textListMaker() //Creating List of words to scramble
    {
        ArrayList<String> originalText = new ArrayList<String>();
        int textCounter = 1;
        while (true)
        {
            originalText.add(Input.getString("Add some text for text " + textCounter + "\nPut a blank line when done.").toUpperCase());

            if (originalText.get(textCounter - 1).equals(""))
            {
                originalText.remove(textCounter - 1);
                return originalText;
            }
            textCounter++;
        }
    }

    private static Integer shiftCalculator(int direction, int shift, int index)
    {
        if (direction == 0)
        {
            return Math.abs(26 - shift - index);
        }
        else
        {
            if (index + shift > 26)
            {
                return index + shift - 26;
            }
            else
            {
                return index + shift;
            }

        }
    }
}
