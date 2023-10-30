//Write a Java Program to print as below. (All details to be stored in variable)

package Homework;

public class Que16 {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        // stored in variables
        String border = "+-----------------------------+";
        String emptySpace = "|                             |";
        String storeName = "|        EXPRESS STOP         |";
        String dateTime = "|     31/10/2023  12:07PM     |";
        String gallons = "|       Gallons: 10.870       |";
        String pricePerGallon = "|     Price/gallon:  £2.79    |";
        String fuelTotal = "|     Fuel total:  £22.71     |";

        // Printing details
        System.out.println(border);
        System.out.println(emptySpace);
        System.out.println(storeName);
        System.out.println(emptySpace);
        System.out.println(dateTime);
        System.out.println(emptySpace);
        System.out.println(gallons);
        System.out.println(pricePerGallon);
        System.out.println(emptySpace);
        System.out.println(fuelTotal);
        System.out.println(emptySpace);
        System.out.println(border);
    }
}
