/**
   The The song node implementation. I just tried to follow
   and completed the templategiven by Dr. Chuang in the lab 
   assignment page.
*/

public class Song 
{
	
	  public String songTitle;
	  private int streamsAverageCount;
	  private String artistName;
     private int artistAverage;
     public Song leftChild;
     public Song rightChild;

	  public Song(String songTitle, int streamsAverageCount, String artistName, int artistAverage) 
     {
		  this.songTitle = songTitle;
		  this.streamsAverageCount = streamsAverageCount;
		  this.artistName = artistName;
        this.artistAverage = artistAverage;
        this.leftChild = null;
        this.rightChild = null;
	  }
     
     public Song() 
     {
         this.songTitle = null;
         this.streamsAverageCount = 0;
         this.artistName = null;
         this.artistAverage = 0;
         this.leftChild = null;
         this.rightChild = null;
    }
    
    public String toString() 
    {
         return this.artistName+"'"+ song +  this.songTitle " has streamed " + this.streamsAverageCount + " times., " The average number of times this song has been streamed is " + this.artistAverage;
    }
	       
	  public String getSongTitle() 
     {
		  return songTitle;
	  }
     
     public void setSongTitle(String songTitle) 
     {
         this.songTitle = songTitle;
     }
         	  
	  public int getStreamsAverageCount() 
     {
		  return streamsAverageCount;
	  }
     
     public void setStreamsAverageCount(int streams) 
     {
         this.streamsAverageCount = streams;
     }
     
     public String getArtistName() 
     {
         return artistName;
     }
     
     public void setArtistName(String artistName)
     {
         this.artistName = artistName;
     }
          
     public int getArtistAverage() 
     {
         return artistAverage; 
     }
     
     public void setArtistAverage(Song song) 
     {
         this.artistAverage = (this.streamsAverageCount + song.streamsAverageCount) / 2;
     }
     
     public void setLeftChild(Song newSong) 
     {
         leftChild = newSong;
     }
	
     public void setRightChild(Song newSong) 
     {
         rightChild = newSong;
     }
     
     public boolean equals(Song song) 
     {
        return (this.songTitle.equals(song.toString()) &&
                this.artistName.equals(song.getArtistName()));
     }
        
     public int compareTo(Song song) 
     {
         return this.songTitle.compareToIgnoreCase(song.songTitle);
     }
}