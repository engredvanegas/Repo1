/**
   Once Again, I just followed and tried to complete
   the template given by Dr. Chuang in the lab 
   assignment page.
*/

import java.io.*;
import java.util.ArrayList;

public class Lab4 
{
   public static void main(String[] args)  throws IOException 
   { 
      // CSV files
      File week1 = new File("week1.csv");
		File week2 = new File("week2.csv");
		File week3 = new File("week3.csv");
		File week4 = new File("week4.csv");
		
      // CSV files to be read stored here to make it iterable
		File [] myFiles = {week1, week2, week3, week4};
	
	   ArrayList<MyQueue> allTheWeeks = new ArrayList<>();
      
	  // Iterate through myFiles to read in each of the files
	  for (int i = 0; i < myFiles.length - 1; i++)
     {
	      MyQueue dataExtract = new MyQueue(myFiles[i]);
	      allTheWeeks.add(dataExtract);
	  }
	  
	  // Playlist history 
	  Playlist list = new Playlist();
	  SongHistoryList historyList = new SongHistoryList();
	  
	  for(int i = 0; i < allTheWeeks.size(); i++) 
     {
         for(int j = 0; j < allTheWeeks.get(i).size(); j++) 
         {
            Song current = new Song(allTheWeeks.get(i).get(j).toString());
			   list.addSong(current);
			   historyList.addSong(list.listenToSong());
		   }
	  }
	  
	  // Merge Queues
	  allTheWeeks.get(0).mergingFunction(allTheWeeks.get(0), allTheWeeks.get(1));	  
	}
}