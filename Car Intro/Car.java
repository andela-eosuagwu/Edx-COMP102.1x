import comp102x.IO;

/**
 * A class of Car objects that can move forward, backward and turn
 */
public class Car
{
    
    int odometer;
    String owner = "No name";
    
    public Car(){}
    
    public void getName (String name)
    {
        owner = name;
    }
    
    
    public void moveCar (int dist)
    {
        odometer = odometer + Math.abs(dist);
    }

   public int getOdometer ()
   {
       return odometer;
   }
}