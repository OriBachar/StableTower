//Name: Ori Bachar ID: 208254516
//Nitzan Miranda ID:316591759

package Algo2;

import java.util.*;

public class Cube implements Comparable<Cube>
{
    int height;

    int width;

    int length;

    int area;

    public Cube(int height, int width, int length)
    {
        this.height = height;

        this.width = width;

        this.length = length;
    }

    public int getHeight()
    {
        return this.height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getLength()
    {
        return this.length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getArea()
    {
        return area;
    }

    public void setArea()
    {
        this.area = this.getLength() * this.getWidth();
    }

    @Override
    public int compareTo(Cube cube)
    {
        return cube.getArea() - this.getArea();
    }


}
