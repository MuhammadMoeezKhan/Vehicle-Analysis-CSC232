public class Driver {
    
public static void main(String [] args){
        
// Testing the first method with car1 and car2
        Vehicle car1 = new Vehicle();
        System.out.println(car1.calculateAverageYearlyMiles(2021));

        Vehicle car2 = new Vehicle();
        System.out.println(car2.calculateAverageYearlyMiles(2012));

// Testing the second method with car3
        Vehicle car3 = new Vehicle();
        System.out.println(car3.calculateMilesPerGallon());


// Testing the third method with car4
        Vehicle car4 = new Vehicle();
        System.out.println(car4.calculateMilesRemaining());

// Testing the fourth method with car5
        Vehicle car5 = new Vehicle();
        car5.printMilesRemainingSummary();

// Testing the fifth method with car6
        Vehicle car6 = new Vehicle();
        car6.checkStatus();
    }
}
