import java.io.*; // I/O import statement
import java.util.Scanner; // Needed for the Scanner class
import java.util.ArrayList; // Needed for the Array class

/**
   This program demonstrates the Lab2 class and displays
   the top streamed artists from spotify.
*/
public class Lab2Demo 
{
   public static void main(String[] args) 
   {
      String csvFile = "Regional_Global_Daily_Latest.csv";
      BufferedReader buff = null;
      String cut = "";
      String splitter = ",";
      ArrayList<String> names = new ArrayList<String>();
   try 
   {
      buff = new BufferedReader(new FileReader("Regional_Global_Daily_Latest.csv"));
      while ((cut = buff.readLine()) != null) 
      {
      // Segment cut
      String[] songInfo = cut.split(splitter);

      // Handles edge case
      if (songInfo[2].replace("\"", "").trim().equals("Robbery (with Juice WRLD)")) 
      {
         names.add("Lucid + Dreams");
      } 
      else if (songInfo[2].replace("\"", "").trim().equals("tusa")) 
      {
         names.add("Karol G");
      } 
      else if (songInfo[2].replace("\"", "").trim().equals("")) 
      {
      } 
      else if (!songInfo[2].replace("\"", "").trim().equals("Artist")) 
      {
         names.add(songInfo[2].replace("\"", "").trim());
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
      if (buff != null) 
      {
         try 
         {
            buff.close();
         } 
         catch (IOException error) 
         {
            error.printStackTrace();
         }
      }
   }
   }
}