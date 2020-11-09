/**
   The SongPlayList implementation. I just tried to follow
   and completed the templategiven by Dr. Chuang in the lab 
   assignment page.
*/

import java.io.*;

/* The SongPlayList implementation */
public class SongPlayList 
{
   private Song root;
   
   public Song getRoot()
   {
      return root;
   }
   
   public void setRoot(Song song)
   {
      root = song;
   }
   
   public void addSong(String songTitle, int streamsAverageCount, String artistName, int artistAverage)
   {
      Song newSong = new Song(songTitle, streamsAverageCount, artistName, artistAverage);
      if (root == null) 
      {
         root = newSong;
      }
      else 
      {
         Song tempSong = root;
         Song parent;
      while (true) 
      {
         parent = tempSong;
         if (songTitle.compareToIgnoreCase(tempSong.getSongTitle) < 0) 
         {
            tempSong = tempSong.getLeftChild();
            if (tempSong == null) 
            {
               parent.setLeftChild(newSong);
               return;
            }
         }
         else 
         {
            tempSong = tempSong.getRightChild;
            if (tempSong == null) 
            {
               parent.setRightChild(newSong);
               return;
                      
            }
         }
       }
       }
   }
   
   public void printTree(Song tempSong, PrintWriter out) 
   {		
		if (tempSong != null) 
      {
			printTree(tempSong.getLeftChild(),out);
			out.println(tempSong);
			printTree(tempSong.getRightChild(),out);
			
		}	
	}
	
}