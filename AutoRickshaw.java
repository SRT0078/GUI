/**
 * The AutoRickshaw class has eight attributes: int engineDisplacement, String torque, int numberofSeats, int fuelTankCapacity, 
   String groundClearance, String groundClearance, int chargeAmount, String bookedDate and boolean isBooked
 * The constructor accepts nine parameters. The values of those parameter are assign the corresponding parameter values.
 * Each attribute has a corresponding accessor method and vehicle chargeAmount or numberofSeats are setter methods. When the Book is instance method.
 * Then finally display super class attributes and six attributes are this values. They are: engineDisplacement, torque, 
   fuelTankCapacity, groundClearance, bookedDate and numberofSeats
 * @author (NP01MA4S220003, SITA RAM THING, MAD) 
 * @version (1.66, 2022-04-18)
 */
public class AutoRickshaw extends Vehicle
{
   private int engineDisplacement;
   private String torque;
   private int numberofSeats;
   private int fuelTankCapacity;
   private String groundClearance;
   private int chargeAmount;
   private String bookedDate;
   private boolean isBooked;
   
   // The constructor accepts parameters
    
   public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, 
   int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance)
   {
       super(vehicleID, vehicleName, vehicleWeight, vehicleColor);
       this.engineDisplacement = engineDisplacement;
       this.torque = torque;
       this.fuelTankCapacity = fuelTankCapacity;
       this.groundClearance = groundClearance;
       super.setVehicleSpeed(vehicleSpeed);
       super.setVehicleColor(vehicleColor);
       this.isBooked = false;
    }
    
    // Create getter methods of all attributes
    
    public int getEngineDisplacement() // get the engineDisplacement value
    {
        return this.engineDisplacement;
    }
    
    public String getTorque() // get the torque value
    {
        return this.torque;
    }
    
    public int getNumberofSeats() // get the numberofSeats value
    {
        return this.numberofSeats;
    }
    
    public int getFuelTankCapacity() // get the fuelTankCapacity value
    {
        return this.fuelTankCapacity;
    }
    
    public String getGroundClearance() // get the groundClearance value
    {
        return this.groundClearance;
    }
    
    public int getChargeAmount() //get the chargeAmount value
    {
        return this.chargeAmount;
    }
    
    public String getBookedDate() // get the bookedDate value
    {
        return this.bookedDate;
    }
    
    public boolean getIsBooked() //get the isBooked value
    {
        return this.isBooked;
    }
    
    // Create Setter methods of chargeAmount and numberofSeats   
    public void setChargeAmount(int newChargeAmount)
    {
        this.chargeAmount = newChargeAmount;
    }
    
    public void setNumberofSeats(int newNumberofSeats)
    {
        this.numberofSeats = newNumberofSeats;
    }
    
    public void Book(String bookedDate, int chargeAmount, int numberofSeats)
    {
        if(this.isBooked == false)
        {
            this.bookedDate = bookedDate;
            this.chargeAmount = chargeAmount;
            this.numberofSeats = numberofSeats;
        
          if (this.isBooked == true)
          {
              System.out.println("Your AutoRickshaw: "+ super.getVehicleID() +"as now booked.");
          }
          else
          {
              System.out.println("Your AutoRickshaw: "+super.getVehicleID() +"as already booked.");
          }
        }
    }
    
     /* Create a instance methotd of name is Display() 
      * The method as print by engineDisplacement, torque, fuelCapacity, groundClearance, bookedDate, chargeAmount and numberofSeats
      */  
    public void Display()
    {
        super.display();
        if (this.isBooked == true)
        {
            System.out.println("Engine displacement: "+ this.engineDisplacement);
            System.out.println("Torque is: "+this.torque);
            System.out.println("Fuel tank capacity is: "+this.fuelTankCapacity);
            System.out.println("Ground clearance is: "+ this.groundClearance);
            System.out.println("Booked date is "+ this.bookedDate);
        }
        if(this.chargeAmount == 0)
        {
            System.out.println("Charge amount is not set.");
        }
        else
        {
            System.out.println("Charge amount is: "+ this.chargeAmount);
        }
        if(this.numberofSeats == 0)
        {
            System.out.println("The number of seats are not set.");
        }
        else
        {
            System.out.println("The number of seats is: "+ this.numberofSeats);
        }
    }     
}

