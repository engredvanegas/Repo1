/**
   This program contains the PassFailActivity class
   which demonstrates the GradedActivity class.
*/

public class PassFailActivity extends GradedActivity
{
   // Declares variables
   private double minPassingScore; // Minimum passing score 
   
   // Constructor arguments
   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }
   
   /**
      The getGrade method returns the letter grade and
      ovverrides the superclass method.
      @return The value in the letterGrade field
   */
   @Override
   public char getGrade()
   {
      // Declare Variables
      char letterGrade;
      
      // Checks score to get letter grade 
      if (super.getMid1Score() >= minPassingScore || super.getMid2Score() >= minPassingScore || super.getPpScore() >= minPassingScore || super.getLabsScore() >= minPassingScore || super.getScoreTotal() >= minPassingScore)
      {
         letterGrade = 'P';
      }
      else
      {
         letterGrade = 'F';
      }
      return letterGrade;
   }
}

         