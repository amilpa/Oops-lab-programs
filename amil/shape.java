import java.io.* ; 
import java.util.* ;

import javax.sound.sampled.SourceDataLine;


abstract class Shape
{
    abstract int numberofsides();
}

class Rectangle extends Shape
{
    int sides = 4;
}