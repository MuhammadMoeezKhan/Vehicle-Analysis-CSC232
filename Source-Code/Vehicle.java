public class Vehicle{

private String name;
private short year;
private int odometer;
private short tripMeter;
private byte gallonsRemaining;
private byte gallonsCapacity;

public Vehicle(){
    name="Nissan";
    year=2002;
    odometer=150000;
    tripMeter=2100;
    gallonsRemaining=16;
    gallonsCapacity=54;
}

public float calculateAverageYearlyMiles(int currentYear){
    float averageYearlyMiles=0.0f;
    if(currentYear>year){
            averageYearlyMiles = odometer / (currentYear - year);
        }
        if(currentYear == year){
            averageYearlyMiles = odometer;
        }
        if(currentYear<year){
            return 0.0f;
        }
        return averageYearlyMiles;
}


public float calculateMilesPerGallon(){
float milesPerGallon=0;
milesPerGallon = tripMeter / (gallonsCapacity - gallonsRemaining);
return milesPerGallon;
}


public float calculateMilesRemaining(){
float milesRemaining;
float milage = calculateMilesPerGallon();
milesRemaining = milage * gallonsRemaining;
return milesRemaining; 
}


public void printMilesRemainingSummary(){

    float milesRemain = calculateMilesRemaining();
    float milesPerGallon = calculateMilesPerGallon();

    while(gallonsRemaining>=0){
    System.out.println(gallonsRemaining + " gallons: " + milesRemain + " miles remaining" );
    gallonsRemaining--;
    milesRemain = milesRemain - milesPerGallon;
    }
}


public void checkStatus(){
    float efficiency = calculateMilesPerGallon();
    int percentCapacity = (gallonsCapacity / 10);

    if(odometer>100000){
System.out.println("High Mileage");
    }
    if( gallonsRemaining < percentCapacity){
        System.out.println("Low Fuel");
            }
     if(efficiency<10.0){
         System.out.println("Poor Fuel Efficiency");
     }   
     if(efficiency<40.0 && efficiency>30.0){
        System.out.println("High Fuel Efficiency");
    }      
}
}
