/**
   The MyQueue implementation. Again,
   I just followed and completed the template
   given by Dr. Chuang in the lab assignment
   page.
*/

import java.io.*; // I/O import statement
import java.util.*; // Needed for the Util class

public class MyQueue extends LinkedList
{ 		
	public MyQueue(String filename) throws IOException 
   {
      // filename for queue 
      LinkedList<String> queueList = new LinkedList<String>();
          
		// Reads and sorts CSV files
		FileReader fr = new FileReader();
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		while ((line = br.readLine()) != null) 
      {
         queueList.add(line);
		   line = br.readLine();       
		}

		br.close(); // Closes buffered reader
	}
	
	// This function takes two queues and returns one into one 
	public MyQueue mergingFunction(MyQueue q1, MyQueue q2)
   {
      MyQueue myList = new MyQueue(); 
	}
}
