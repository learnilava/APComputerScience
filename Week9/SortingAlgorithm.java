package Week9;

import Important.Input;

public class SortingAlgorithm
{

    public static void main(String[] args)
    {
        //Array maker

//        boolean x = true;
//        String xx = "{";
//        for (int i = 0;i < 20; i++)
//        {
//            xx += Input.getString() + ", ";
//
//        }
//        xx += "};";
//        System.out.println(xx);


        int[] array = {1, 4, 6, 45, 3, 5, 5, 8, 857, 534, 67, 13, 5, 56, 5, 78, 65, 4};

        for (int e = 0; e < array.length; e++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        Print(array);

    }

    public static void Print(int[] array)
    {
        for (int e = 0; e < array.length; e++)
        {
            System.out.println(array[e]);
        }
    }

}
