/**
   Custom class Playlist fro creating a playlist
   object. Again, I just followed and completed 
   the template given by Dr. Chuang in the lab 
   assignment page.
*/

import java.util.LinkedList;

public class Playlist 
{		  
   private Song first;
   
   LinkedList<Song> Playlist;
		  
   public  Playlist()
   {
      // Constructor
	   Playlist = new LinkedList<>();
	}
		  
   public void addSong(Song s)
   {
      Playlist.add(s);
	}
   
   public Song listenToSong()
   {
	   // Retrieves the next song to listen to
		return first;
	}
}