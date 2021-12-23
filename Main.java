//Name: Ori Bachar ID: 208254516
//Nitzan Miranda ID:316591759

package Algo2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Cube[] arrCubes = new Cube[20];

        for (int i = 0; i < 20; i++)
        {
           Random random = new Random();

           int height = random.nextInt(200) + 1;

           int width = random.nextInt(200) + 1;

           int length = random.nextInt(200) + 1;

            arrCubes[i] = new Cube(height,width,length);
        }

        System.out.println("The max height is (20 cubes):" + Algo.maxHeight(arrCubes));
        System.out.println();

        arrCubes = new Cube[30];

        for (int i = 0; i < 30; i++)
        {
            Random random = new Random();

            int height = random.nextInt(200) + 1;

            int width = random.nextInt(200) + 1;

            int length = random.nextInt(200) + 1;

            arrCubes[i] = new Cube(height,width,length);
        }

        System.out.println("The max height is (30 cubes):" + Algo.maxHeight(arrCubes));
        System.out.println();




    }
}
