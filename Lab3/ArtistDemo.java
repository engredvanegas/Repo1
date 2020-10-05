import java.io.*; // I/O import statement
import java.util.Scanner; // Needed for the Scanner class
import java.util.ArrayList; // Needed for the Array class

/**
   This program demonstrates the Artist class. It displays
   the top streamed artists from spotify in alphabetical
   order. It also displays the number of times that the 
   artist appears on the linked list on a separate text file.
*/

public class ArtistDemo
{
   public static void main(String[] args) 
   {
      String csvFile = "regional-global-weekly-2020-09-25--2020-10-02.csv";
      BufferedReader br = null;
      String cut = "";
      String splitter = ",";
      ArrayList<String> names = new ArrayList<String>();
 
   try 
   {
      br = new BufferedReader(new FileReader("regional-global-weekly-2020-09-25--2020-10-02.csv"));
      while ((cut = br.readLine()) != null) 
      {
      // Segment cut
      String[] song = cut.split(splitter);

      // Handles edge case
      if (song[2].replace("\"", "").trim().equals("For The Night (with DaBaby)")) 
      {
         names.add("Mood + Swings");
      }
      else if (song[2].replace("\"", "").trim().equals("next")) 
      {
         names.add("Pop Smoke");
      } 
      else if (song[2].replace("\"", "").trim().equals("")) 
      {
      } 
      else if (!song[2].replace("\"", "").trim().equals("Artist")) 
      {
         names.add(song[2].replace("\"", "").trim());
      }
      }

      Hash count = new Hash();
      count.countFrequencies(names);
   } 
   catch (FileNotFoundException error) 
   {
      error.printStackTrace();
   } 
   catch (IOException error) 
   {
      error.printStackTrace();
   } 
   finally 
   {
      if (br != null) 
      {
         try 
         {
            br.close();
         } 
         catch (IOException error) 
         {
            error.printStackTrace();
         }
      }
   }
   }
}