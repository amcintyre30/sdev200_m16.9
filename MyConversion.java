/*
Author: Aubrie McIntyre
Date: 8/23/2024
Description: Program will generate a conversion table of Feet to Meters and Meters to Feet. The program uses methods to achieve this.
*/
public class MyConversion {
  /*Method for converting Feet to Meters*/
  public static double footToMeter(double feet) {
      double meters = 0.305 * feet;
      return meters;
  }
  /*Method for converting Meters to Feet*/
  public static double meterToFeet(double meters) {
      double feet = 3.279 * meters;
      return feet;
  }

  public static void main(String[] args) {
    double feet = 1.0;
    double meters = 20.0;
    //Main Header
    System.out.printf("-------------------------------------------%n");
    System.out.printf("| Aubrie McIntyre's Table                 |%n");
    System.out.printf("| SDEV200 M1 Pro Assignment 6.9           |%n");
    //Sub Header with Headings
    System.out.printf("-------------------------------------------%n");
    System.out.printf("| %-8s  %-8s | %-8s  %-8s |%n", "Feet", "Meters", "Meters", "Feet");
    System.out.printf("-------------------------------------------%n");
    /*While Loop will interate the rows of the table, providing new values using the footToMeter and meterToFeet methods*/
    while (feet <= 10) {
      System.out.printf("| %-8.1f  %-8.3f | %-8.1f  %-8.3f |%n", feet, footToMeter(feet), meters, meterToFeet(meters));
      feet+=1;
      meters+=5.0;
    }
    //Bottom line, end table
    System.out.printf("-------------------------------------------%n");
  }
}