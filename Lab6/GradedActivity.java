/**
   This program contains the GradedActivity
   class. It demonstrates the student's scores
   and calculates the student's letter grades
   that matches their numeric score values.
*/

public class GradedActivity
{
   // Declare variables
   private double mid1Score;
   private double mid2Score;
   public double ppScore;
   public double labsScore;
   private double scoreTotal;
   
   /**
      The setMid1Score method accepts a double object
      as a parameter and stores it in mid1Score
   */
   public void setMid1Score(double m1Score)
   {
      mid1Score = m1Score;
   }
   
   /**
      The getMid1Score method returns the mid1Score
      @return The value in the mid1Score field
   */
   public double getMid1Score()
   {
      mid1Score = (mid1Score / 10.0) * 100.0;
      return mid1Score;
   }
   
   /**
      The setMid2Score method accepts a double object
      as a parameter and stores it in mid2Score
   */
   public void setMid2Score(double m2Score)
   {
      mid2Score = m2Score;
   }
   
   /**
      The getMid2Score method returns the mid2Score
      @return The value in the mid2Score field
   */
   public double getMid2Score()
   {
      mid2Score = (mid2Score / 10.0) * 100.0;
      return mid2Score;
   }
   
   /**
      The setPpScore method accepts a double object
      as a parameter and stores it in ppScore
   */
   public void setPpScore(double ppScore)
   {
      ppScore = ppScore;
   }
   
   /**
      The getPpScore method returns the ppScore
      @return The value in the ppScore field
   */
   public double getPpScore()
   {
      ppScore = (ppScore / 32) * 100.0;
      return ppScore;
   }
   
   /**
      The setLabsScore method accepts a double object
      as a parameter and stores it in labsScore
   */
   public void setLabsScore(double labsScore)
   {
      labsScore = labsScore;
   }
   
   /**
      The getLabsScore method returns the labsScore
      @return The value in the labsScore field
   */
   public double getLabsScore()
   {
      labsScore = (labsScore / 8) * 100.0;
      return labsScore;
   }
  
   /**
      The setScoreTotal method accepts a double object
      as a parameter and stores it in the scoreTotal field
   */
   public void setScoreTotal(double sT)
   {
      scoreTotal = sT;
   }
   
   /**
      The getScoreTotal method returns the scoreTotal
      @return The value in the scoreTotal field
   */
   public double getScoreTotal()
   {
      scoreTotal = (scoreTotal / 61) * 100.0;
      return scoreTotal;
   }

   
   /**
      The getGrade method returns the letterGrade
      @return The value in the letterGrade field
   */
   public char getGrade()
   {
      // Declare variables
      char letterGrade;
      
      // Checks score to get a letter grade
      if (mid1Score >= 90 || mid2Score >= 90 || ppScore >= 90 || labsScore >= 90 || scoreTotal >= 90)
      {
         letterGrade = 'A';
      }
      else if (mid1Score >= 80 || mid2Score >= 80 || ppScore >= 80 || labsScore >= 80 || scoreTotal >= 80)
      {
         letterGrade = 'B';
      }
      else if (mid1Score >= 70 || mid2Score >= 70 || ppScore >= 70 || labsScore >= 70 || scoreTotal >= 70)
      {
         letterGrade = 'C';
      }
      else if (mid1Score >= 60 || mid2Score >= 60 || ppScore >= 60 || labsScore >= 60 || scoreTotal >= 60)
      {
         letterGrade = 'D';
      }
      else
      {
         letterGrade = 'F';
      }
      return letterGrade;
   }
}
        
   