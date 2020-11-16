/**
   This program contains the Midterm2 class which demonstrates
   the GradedActivity class.
*/

public class Midterm2 extends GradedActivity
{
   // Declare variables
   private int numQuestions; // Number of questions
   private double pointsEach; // Points for each question
   private int numMissed; // Questions missed
   
   // Constructor arguments
   public Midterm2(int questions, int missed)
   {
      // Declare variables
      double numericScore; // Holds numeric score
      
      // Sets numQuestions and numMissed questions
      numQuestions = questions;
      numMissed = missed;
      
      // Calculates each questions points and numeric score value for midterm1
      pointsEach = 10.0 / questions;
      numericScore = 10.0 - (missed * pointsEach);
      
      // Call superclass setMid2Score method
      setMid2Score(numericScore);
   }
   
   /**
      The getPointsEach Method returns the points earned for each 
      question
      @return The value in the pointsEach field
   */
   public double getPointsEach()
   {
      return pointsEach;
   }
   
   /**
      The getNumMissed method returns the amount of questions the
      student missed
      @return The value in the numMissed field
   */
   public int getNumMissed()
   {
      return numMissed;
   }
}
 
 