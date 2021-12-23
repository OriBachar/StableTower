//Name: Ori Bachar ID: 208254516
//Nitzan Miranda ID:316591759

package Algo2;

import java.lang.reflect.Array;
import java.util.*;


public class Algo
{
    static int maxHeight(Cube arr[])
    {
        for (int i = 0; i < arr.length; i++)
            arr[i].setArea();

        Arrays.sort(arr);

        int max_height[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            max_height[i] = arr[i].getHeight();

        for (int i = 0; i < arr.length; i++)
        {

            Cube cube = arr[i];

            int sumMaxHeight = 0;

            for (int j = 0; j < i; j++)
            {
                Cube pervCube = arr[j];

                if(cube.getWidth() < pervCube.getWidth() && cube.getLength() < pervCube.getLength())
                    sumMaxHeight = Math.max(sumMaxHeight, max_height[j]);
            }

            max_height[i] += sumMaxHeight;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++)
            max = Math.max(max, max_height[i]);

        return max;
    }
}
