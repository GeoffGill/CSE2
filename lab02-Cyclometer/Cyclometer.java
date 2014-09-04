/* Geoff Gill
    Lab 2
*/

public class Cyclometer{
    
    public static void main(String[] args) {
        int secsTrip1=480;      //Number of seconds the first trip took
        int secsTrip2=3220;     //Number of seconds the second trip took
        int countsTrip1=1561;   //Number of rotations in the first trip
        int countsTrip2=9037;   //Number of rotations int eh second trip
        
        double wheelDiameter=27.0;  // Width of the wheel in inches
        double PI=3.14159;          //Accepted rounded value of PI
        double feetPerMile= 5280;   //Number of feet in a mile
        double inchesPerFoot=12;    //Number of inches in a foot
        double secondsPerMinute=60; //Number of seconds in a minute
        double distanceTrip1;       //Distance in trip 1
        double distanceTrip2;       //Distance in trip 2
        double totalDistance;       //Total distance of Trip 1 and 2
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute) + " minutes and had "+countsTrip1+" counts.");
        //Prints out the timespan and rotation count of trip 1
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute) + 
        " minutes and had "+countsTrip2+" counts. ");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
       //Converts the the counts into wheel span
        distanceTrip1/=inchesPerFoot*feetPerMile;    
        //Defines the length of Trip 1 if miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //Defines the distance of trip 2
        totalDistance=distanceTrip1+distanceTrip2;
        //Defines the total Distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        //Prints out the distance of Trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        //Prints out the distance fo Trip 2
        System.out.println("The total distance was "+totalDistance+" miles");
        //Prints out the total distance cycled
    }
        
}

