/**
   This program contains the PracticeProblems class which
   demonstrates the GradedActivity class.
*/

public class PracticeProblems extends GradedActivity
{
   // Declare variables
   private double practiceProblems1;
   private double practiceProblems2;
   private double practiceProblems3;
   private double practiceProblems4;
   private double practiceProblems5;
   private double practiceProblems6;
   
   // Constructor arguments
   public PracticeProblems(double pp1, double pp2, double pp3, double pp4, double pp5, double pp6)
   {
      practiceProblems1 = pp1;
      practiceProblems2 = pp2;
      practiceProblems3 = pp3;
      practiceProblems4 = pp4;
      practiceProblems5 = pp5;
      practiceProblems6 = pp6;
      
      // Calculates scores for practice problems 
      ppScore = (practiceProblems1 + practiceProblems2 + practiceProblems3 + practiceProblems4 + practiceProblems5 + practiceProblems6);
      
      // Call superclass setPpScore method
      setPpScore(ppScore);
   }
   
   /**
      The getPracticeProbems1 method returns the number of
      practice problem 1 points
      @return The value in the practiceProblems1 field
   */
   public double getPracticeProblems1()
   {
      return practiceProblems1;
   }
   
   /**
      The getPracticeProbems2 method returns the number of
      practice problem 2 points
      @return The value in the practiceProblems2 field
   */
   public double getPracticeProblems2()
   {
      return practiceProblems2;
   }
   
   /**
      The getPracticeProbems3 method returns the number of
      practice problem 3 points
      @return The value in the practiceProblems3 field
   */
   public double getPracticeProblems3()
   {
      return practiceProblems3;
   }
   
   /**
      The getPracticeProbems4 method returns the number of
      practice problem 4 points
      @return The value in the practiceProblems4 field
   */
   public double getPracticeProblems4()
   {
      return practiceProblems4;
   }
   
   /**
      The getPracticeProbems5 method returns the number of
      practice problem 5 points
      @return The value in the practiceProblems5 field
   */
   public double getPracticeProblems5()
   {
      return practiceProblems5;
   }
   
   /**
      The getPracticeProbems6 method returns the number of
      practice problem 6 points
      @return The value in the practiceProblems6 field
   */
   public double getPracticeProblems6()
   {
      return practiceProblems6;
   }
}  
