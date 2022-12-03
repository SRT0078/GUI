/**
 * The child class of ElectriScooter has eight attributes: int range, int batteryCapacity, int price, String chargingTime, String brand, 
   String mileage, boolean hasPurchased and  boolean hasSold
 * The constructor accepts six parameters: int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed and int batteryCapacity 
 * The value of those parameter are assign the corresponding parameter values.
 * Each attribute has a corresponding accessor method and TheBrand is a setter method. When the Purchase or Sell are instance methods.
 * Then finally display the super class value and six attributes values of this class. They are: brand, batteryCapacity, mileage, range and chargingTime
 * @author (NP01MA4S220003, SITA RAM THING, MAD) 
 * @version (1.66, 2022-04-18)
 */

public class ElectricScooter extends  Vehicle
 {
   private int range;  
   private int batteryCapacity;
   private int price;
   private String chargingTime;
   private String brand;
   private String mileage;
   private boolean hasPurchased;
   private boolean hasSold;  
   
   // create the constructor of ElectricScooter
   public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int batteryCapacity)
   {
       super(vehicleID, vehicleName, vehicleWeight, vehicleColor);
       this.range = range;
       this.batteryCapacity = batteryCapacity;
       this.price = price;
       this.chargingTime = chargingTime;
       this.brand = brand;
       this.mileage = mileage;
       this.hasPurchased = false;
       this.hasSold = false;
       super.setVehicleSpeed(vehicleSpeed);
       super.setVehicleColor(vehicleColor);
   }
   
   /* Create getter methods which as range, batteryCpacity, price are integer data type or chargeAmount, brand, mileage of string data type and 
      hasPurchase, hasSold are boolean data type
    * When initiaize the value of instance variable
    */
   public int getRange()
   {
       return this.range;
    }
   
    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    
    public String getBrand()
    {
        return this.brand;
    }
    
    public String getMileage()
    {
        return this.mileage;
    }
    
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    
    public boolean getHasSold()
    {
        return this.hasSold;
    }
    
    // Create the Setter methods
    public void setTheBrand(String newBrand)
    {
        this.brand = newBrand;
        if(this.hasPurchased == false)
        {
            System.out.println("The new brand entry: "+ this.brand);
        }
        else
        {
            System.out.println("The brand name is already entered.");
        }
    }
    
   public void Purchase(String newBrand, int newPrice, String newChargigTime, String newMileage, int newRange)
   {
       if(this.hasPurchased == false)
       {
           this.brand = newBrand;
           this.price = newPrice;
           this.chargingTime = newChargigTime;
           this.mileage = newMileage;
           this.range = newRange;
           this.hasPurchased = true;
           this.hasSold = false;
       }
        else
       {
          System.out.println("It has been already purchased.");
       }
    
 }
  // Create the selling method
  public void Sell(int newPrice)
  {
    this.price = newPrice;
    if(hasPurchased)
    {
        if(this.hasSold == false)
        {
            this.range = (0);
            this.chargingTime = ("");
            this.mileage = ("");
            this.batteryCapacity = (0);
            this.hasSold = (true);
            this.hasPurchased = (false);
        }
        else
        {
            System.out.println("The scooter has been already sold.");
        }
    }
    else    
    {
        System.out.println("The scooter has been already purchased."); 
        
    }
  }
  // Showing the Display method
  public void Display()
  {
      super.display();
      if(this.hasPurchased == true)
      {
         System.out.println("The brand is: "+ this.brand); 
         System.out.println("The battery capacity is: "+ this.batteryCapacity);
         System.out.println("The mileage is: "+ this.mileage);
         System.out.println("The range is: "+ this.range);
         System.out.println("The recharge is: "+ this.chargingTime);
      }
  }
}  
