import java.io.*; // I/O import statement

/**
   This program demonstrates the CourseGrade class and
   also creates the objects for the GradedActivity, 
   PassFailActivity, PassFailMidterm1, PassFailMiterm2, 
   Midterm1, Midterm2, PracticeProblems, and Labs. These 
   objects are then inserted by calling the setPassfailMidterm1, 
   setPassFailMidterm2, setActivity, setPracticeProblems and setLabs. 
   Which will ultimately print both the numeric scores and
   letter grades for each of the five elements in the
   array in order to give the overall grade of the class so far.
*/

public class CourseGradeDemo
{
   public static void main(String[] args) throws IOException
   {
      // Creates GradedActivity class object
      GradedActivity gActivity = new GradedActivity();
      
      // Set GradedActivity score
      gActivity.setScoreTotal(57.5);
      
      // Creates PassFailExam class object
      PassFailMidterm1 pFailMid1 = new PassFailMidterm1(19, 0, 60);
      
      // Creates PassFailExam class object
      PassFailMidterm2 pFailMid2 = new PassFailMidterm2(10, 4, 60);
      
      // Creates practice problems class object
      PracticeProblems pp = new PracticeProblems(2, 6, 6, 6, 6, 6);
      
      // Creates labs class object
      Labs labs = new Labs(1, 2, 2, 2, 2);
      
      // Create FinalExam class object
      Midterm1 mid1 = new Midterm1(19, 0);
      
      // Create FinalExam class object
      Midterm2 mid2 = new Midterm2(10, 4);
      
      // Create CourseGrades class object
      CourseGrades cGrade = new CourseGrades();
      
      // call setLab method
      cGrade.setActivity(gActivity);
      
      // call setPassFailExam method
      cGrade.setPassFailMidterm1(pFailMid1);
      
      // call setPassFailExam method
      cGrade.setPassFailMidterm2(pFailMid2);
      
      // Call setEssay method
      cGrade.setPracticeProblems(pp);

      // Call setEssay method
      cGrade.setLabs(labs);
      
      // Prints to output file
      PrintWriter out = new PrintWriter(new FileWriter("CourseGrades.txt"));
            
      // Print title
      out.println("___________________________");
      out.println("\t\tCISC. 3130 Grades");
      out.println("___________________________");
      
      // Call toString method
      out.println(cGrade);
   out.close();
   }
   
}

