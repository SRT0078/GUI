/**
 * The vehicle class has five attributes: int vehicleID, String vehicleName, vehicleWeight, vehicleColor and vehicleSpeed
 * The constructor accepts four parameters. The value of those parameter are assign the corresponding parameter values.
 * Each attributes has a corresponding accessor method and vehicle speed or color are setter method.
 * Then finally display the all attributes values.
 * @author (NP01MA4S220003, SITA RAM THING, MAD) 
 * @version (1.66, 2022-04-18)
 */
public class Vehicle
 {
  private int vehicleID;
  private String vehicleName;
  private String vehicleWeight;
  private String vehicleColor;
  private String vehicleSpeed;
  
  // The constructor accept four parameters: int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor
   
   public Vehicle(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor)
   {
       this.vehicleID = vehicleID;
       this.vehicleName = vehicleName;
       this.vehicleWeight = vehicleWeight;
       this.vehicleColor = vehicleColor;
    }
    
    /* Create getter methods whic is int getVehicleID is integer data type or String getVehicleName, String 
       getVehicleWeight, String getVehicleColor and String getVehicleSpeed of string data type
     * When initaize the value of instance variable
     */
    public int getVehicleID()
    {
    return this.vehicleID;
    }
    
    public String getVehicleName()
    {
        return this.vehicleName;
    }
    
    public String getVehicleWeight()
    {
        return this.vehicleWeight;
    }
    
    public String getVehicleColor()
    {
        return this.vehicleColor;
    }
    
    public String getVehicleSpeed()
    {
        return this.vehicleSpeed;
    }
    
    // Create setter methods
    public void setVehicleSpeed(String vehicleSpeed)
    {
       this.vehicleSpeed = vehicleSpeed;
    }
    
    public void setVehicleColor(String vehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }
    
    // Create the instance method of Display which display the each attributes values
    
    public void display()
    {
        System.out.println("The vehicle id is: "+getVehicleID());
        System.out.println("Vehicle name is: "+getVehicleName());
        if(this.vehicleWeight.equals(this.vehicleWeight.isEmpty()))
        {
            System.out.println("Vehicle weight is not defined");
        }
        else
        {
            System.out.println("Vehicle weight is: "+ getVehicleWeight());
        }
        System.out.println("Vehicle color is: "+ this.vehicleColor);
        System.out.println("Vehicle speed is: "+ this.vehicleSpeed);
   } 
}

