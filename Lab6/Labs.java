/**
   This program contains the Labs class which
   demonstrates the GradedActivity class.
*/

public class Labs extends GradedActivity
{
   // Declare variables
   private double lab1;
   private double lab2;
   private double lab3;
   private double lab4;
   private double lab5;

   
   // Constructor arguments
   public Labs(double lab11, double lab2, double lab3, double lab4, double lab5)
   {
      lab1 = lab1;
      lab2 = lab2;
      lab3 = lab3;
      lab4 = lab4;
      lab5 = lab5;

      
      // Calculates scores for labs
      labsScore = (lab1 + lab2 + lab3 + lab4 + lab5);
      
      // Call superclass setScore method
      setLabsScore(labsScore);
   }
   
   /**
      The getLab1 method returns the number of
      lab 1 points
      @return The value in the lab1 field
   */
   public double getLab1()
   {
      return lab1;
   }
   
   /**
      The getLab2 method returns the number of
      lab 2 points
      @return The value in the lab2 field
   */
   public double getLab2()
   {
      return lab2;
   }
   
   /**
      The getLab3 method returns the number of
      lab 3 points
      @return The value in the lab3 field
   */

   public double getLab3()
   {
      return lab3;
   }
   
   /**
      The getLab4 method returns the number of
      lab 4 points
      @return The value in the lab4 field
   */

   public double getLab4()
   {
      return lab4;
   }
   
   /**
      The getLab5 method returns the number of
      lab 5 points
      @return The value in the lab5 field
   */
   public double getLab5()
   {
      return lab5;
   }
}  

   
   