/**
   This program contains the CourseGrades class
   which sets an array with five graded activity
   objects.
*/

public class CourseGrades
{
   /**
      Array named grades with five GradedActivity
      objects
   */
   private GradedActivity[] grades = new GradedActivity[5];
   
   /**
      The setActivity method accepts a GradedActivity object as a 
      parameter and stores it in the grades array.
   */
   public void setActivity(GradedActivity gActivity)
   {
      grades[0] = gActivity;
   }
   
   /**
      The setPassFailMidterm1 method accepts a PassFailMidterm1 object
      as a parameter and stores it in the grades array.
   */
   public void setPassFailMidterm1(PassFailMidterm1 pFailMid1)
   {
      grades[1] = pFailMid1;
   }
   
   /**
      The setPassFailMidterm2 method accepts a PassFailMidterm2 object
      as a parameter and stores it in the grades array.
   */
   public void setPassFailMidterm2(PassFailMidterm2 pFailMid2)
   {
      grades[2] = pFailMid2;
   }
   
   /**
      The setPracticeProblems method accepts a PracticeProblems object as a parameter
      and stores it in the grades array.
   */
   public void setPracticeProblems(PracticeProblems pp)
   {
      grades[3] = pp;
   }
   
   /**
      The setLabs method accepts a labs object as a parameter
      and stores it in the grades array.
   */
   public void setLabs(Labs labs)
   {
      grades[4] = labs;
   }

   
   /**
      The String toString method returns the numeric scores
      and grades of all the elements in the grades array.
   */
   public String toString()
   {
      return "Total:\n" + " Score: " + grades[0].getScoreTotal()
      + ", Grade: " + grades[0].getGrade()
      + "\n\nPass Fail Midterm 1:\n" + " Score: " + grades[1].getMid1Score()
      + ", Grade: " + grades[1].getGrade() + "\n\nPass Fail Midterm 2:\n" 
      + " Score: " + grades[2].getMid2Score() + ", Grade: " + grades[2].getGrade()
      + "\n\nPractice Problems:\n" + " Score: " + grades[3].getPpScore() 
      + ", Grade: " + grades[3].getGrade() + "\n\nLabs:\n" 
      + " Score: " + grades[4].getLabsScore() + ", Grade: " + grades[4].getGrade();
   }
}   
   
   