/**
   The PlayList implementation. Again,
   I just followed and completed the template
   given by Dr. Chuang in the lab assignment
   page.
*/ 

public class Song 
{
   private String track;
	private Song next;

   // Constructors	
	public Song (String track) 
   {
		this.track = track;
      this.next = null;
	}
   
   public String getTrack()
   {
      return track;
   }
   
   public Song getNextSong()
   {
      return next;
   }
}