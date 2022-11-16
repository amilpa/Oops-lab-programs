import java.io.* ; 
import java.util.* ;

import javax.sound.sampled.SourceDataLine;


abstract class Shape
{
    abstract void numberofsides();
}

class Rectangle extends Shape
{
    int sides = 4;
    void numberofsides()
    {
        System.out.println("Rectangle");
        System.out.println("Number of sides: "+sides);
    }
}


class Triangle extends Shape
{
    int sides = 3;
    void numberofsides()
    {
        System.out.println("Triangle");
        System.out.println("Number of sides: "+sides);
    }
}

class Hexagon extends Shape
{
    int sides = 6;
    void numberofsides()
    {
        System.out.println("Hexagon");
        System.out.println("Number of sides: "+sides);
    }
}

class shape
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();        
        rect.numberofsides();
        Triangle tri = new Triangle();        
        tri.numberofsides();
        Hexagon hex = new Hexagon();        
        hex.numberofsides();
    }
}
