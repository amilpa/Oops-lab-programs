import java.io.* ; 
import java.util.* ;


abstract class shape
{
    abstract int numberofsides();
}

class rectangle extends shape
{
    private static int sides = 4;
}