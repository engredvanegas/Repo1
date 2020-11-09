import java.io.*; // Needed for the I/O statement
import java.util.*; // Needed for collection classes 

public class SongDemo
{
   public static void main(String[] args) throws IOException 
   {
		// CSV Files
		File file = new File("week1.csv", "week2.csv", "week3.csv", "week4.csv");
		File outFile = new File("AssortedArtists.txt");
		PrintWriter pw = new PrintWriter(outFile);
		
		SongPlayList Song = new SongPlayList();
		pw.flush();
		readFiles(file, Song, pw);
		
		pw.println(Song.getRoot());
		pw.println("Full Song title list: ");
		Song.printTree(Song.getRoot(),pw);
		
		Song.printTree(Song.getRoot().getLeftChild(), pw);
		Song.printTree(Song.getRoot().getRightChild(), pw);
      pw.println("");
		
		
		pw.close();
	}

	public static void readFiles(File file, SongPlayList Song,PrintWriter pw) 
   {
	   String row;
	
		try 
      {
         // Reads csv files
			BufferedReader csvReader = new BufferedReader (new FileReader(file));
         
			// Limits the number of songs
			pw.println("Available songs: ");
			for (int x = 0; x < 800; x++) 
         {
				row = csvReader.readLine();
				StringTokenizer token = new StringTokenizer(row,",");
				token.nextToken();
				
				String songTitle;
				int streamsAverageCount;
				String[] streams = new String[800];
				
				// Breaks up the all the information in order to make it easier to read
				StringTokenizer songTitleToken = new StringTokenizer(token.nextToken(),"(");
				songTitle = songTitleToken.nextToken();
				streams = Integer.parseInt(songTitleToken.nextToken().replace(")", ""));
				artistAverage = token.nextToken().split("|");
				Song.addSong(songTitle, streamsAverageCount, artistName, artistAverage);
				pw.println(songTitle + " (" + streamsAverageCount + ")");
			}
			csvReader.close();
			return;
	}
	catch(Exception e) {
		System.out.println("Null Pointer " + e);
	}
	return;
	}
}
	
	