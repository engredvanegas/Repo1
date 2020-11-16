/**
   This program contains the PassFailMisterm2 class
   which displays the number of questions, points
   for each question, and the number of questions
   that the student missed.
*/

public class PassFailMidterm2 extends PassFailActivity
{
   // Declare variables
   private int numQuestions; // Number of questions
   private double pointsEach; // Points for each question
   private int numMissed; // Questions missed
   
   // Constructor arguments
   public PassFailMidterm2(int questions, int missed, double minPassing)
   {
      // Call superclass constructor
      super(minPassing);
      
      // Declare variables
      double numericScore; // Holds numeric score
      
      // Set the fields for numQuestions and numMissed
      numQuestions = questions;
      numMissed = missed;
      
      // Calculates each questions points and numeric score value for midterm2
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
      
      