/**
   This is the SongHistoryList implementation.
   I just followed and completed the template
   given by Dr. Chuang in the lab assignment
   page.
*/

public class SongHistoryList 
{
   private Song first;
   
	public void SongHistoryList()
   {
      first = null;
   }
	public void addSong(Song s)
   {
      this.first = s;
      return;
	}		
   public Song lastListened()
   {
         // Retrieves the next song to listen to
         return this.first;
              
   }   
}