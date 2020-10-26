/**
   Custom class Playlist fro creating a playlist
   object. Again, I just followed and completed 
   the template given by Dr. Chuang in the lab 
   assignment page.
*/

public class Playlist 
{		  
   private Song first;
   
   public  Playlist()
   {
      // Constructor
	   first = null;
	}
		  
   public void addSong(Song s)
   {
      this.first = s;
      return;
	}
   
   public Song listenToSong()
   {
	   // Retrieves the next song to listen to
		return first;
	}
}