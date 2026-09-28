public class Main{

public static void main(String[] args){

Vehicle vehicle1 = new Vehicle();
vehicle1.brand = "BYD";
vehicle1.model = "Seagull";
vehicle1.year = 2023;

Vehicle vehicle2 = new Vehicle();
vehicle2.brand = "BYD";
vehicle2.model = "Dolphin";
vehicle2.year = 2021;

Vehicle vehicle3 = new Vehicle();
vehicle3.brand = "Hongqi";
vehicle3.model = "CA72";
vehicle3.year = 1958;

vehicle1.displayInfo();
   System.out.println(vehicle1.calculateAge());
   System.out.println(vehicle1.isVintage());
vehicle2.displayInfo();
   System.out.println(vehicle2.calculateAge());
   System.out.println(vehicle2.isVintage());
vehicle3.displayInfo();
   System.out.println(vehicle3.calculateAge());
   System.out.println(vehicle3.isVintage());
   
}
}