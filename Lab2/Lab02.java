import comp102x.IO;

public class Lab02
{
    public static void main (String[] args)
    {
        multiply();
        quadraticEquation();
        areaOfTriangle();
    }

    public static void multiply()
    {
        int x, y, Answer;

        IO.output("Enter an Integer x: ");
        x = IO.inputInteger();

        IO.output("Enter an Integer y: ");
        y = IO.inputInteger();

        Answer = (x + y);
        IO.output("the answer of X and Y in " + Answer);
    }

    public static void areaOfTriangle()
    {

        int width, height, area;
        
        IO.output("Enter width of a Triangle:");
        width = IO.inputInteger();
        
        IO.output("Enter height of Triangle: ");
        height = IO.inputInteger();
        
        area = width * height / 2;
        IO.output("The Triangle area is " + area);
    }

    public static void quadraticEquation()
    {

        int a, b, c;
        double x1, x2;

        IO.output("Enter a: ");
        a = IO.inputInteger();

        IO.output("Enter b: ");
        b = IO.inputInteger();

        IO.output("Enter c: ");
        c = IO.inputInteger();

        x1 = ( -b + Math.sqrt( b * b - 4 * a * c )) / ( 2 * a);
        x2 = ( -b - Math.sqrt( b * b - 4 * a * c )) / ( 2 * a);
        
        IO.outputln("First solution for x = " + x1);
        IO.outputln("Second solution for x = " + x2);
    }


}
