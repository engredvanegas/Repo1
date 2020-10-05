import java.io.*; // I/O import statement
import java.util.*; // Needed for the Util class

/**
   The Artist class purpose is to create a report of who
   appears on spotify's top streamed list in alphabetical
   order.
*/

public class Artist 
{
   private Node head;
   
   // Artist represented by Node
   public class Node 
   {
      private String data;
      private Node next;
      public Node(String name) 
      {
         data = name;
         next = null;
      }
   }

   void sortedInsert(Node newNode) 
   {
      Node current;

      // Head node exception
      if (head == null || head.data.compareToIgnoreCase(newNode.data) > 0) 
      {
         newNode.next = head;
         head = newNode;
      }
      else 
      {
         current = head;
         while (current.next != null &&
         current.next.data.compareToIgnoreCase(newNode.data) < 0)
         current = current.next;
         newNode.next = current.next;
         current.next = newNode;
      }
   }

   // Creates new artist
   Node newNode(String data) 
   {
      Node node = new Node(data);
      return node;
   }

   // Prints linked list
   void printList() 
   {
      Node value = head;
      File out = new File("ArtistsSortedWeekOf09-25-2020.txt");
      StringBuilder strBuilder = new StringBuilder();
      strBuilder.append("Artist");
      strBuilder.append('\n');

      while (value != null) 
      {
         System.out.print(value.data + ", ");
         strBuilder.append(value.data);
         strBuilder.append('\n');
         value = value.next;
      }

   try (PrintWriter pWriter = new PrintWriter(out)) 
   {
      pWriter.write(strBuilder.toString());
   } 
   catch (FileNotFoundException error) 
   {
      System.out.println(error);
   }
   }
}

// Artists list contains artists names 
class Hash 
{
   public void countFrequencies(List<String> list) 
   {
   
   // Hash map stores element frequency
   Map<String, Integer> map = new HashMap<String, Integer>();

   for (String i : list) 
   {
      Integer j = map.get(i);
      map.put(i, (j == null) ? 1 : j + 1);
   }
   
   List<String> artistList = new ArrayList<String>();;
   StringBuilder sBuilder = new StringBuilder();
   sBuilder.append("Artist");
   sBuilder.append(",\t");
   sBuilder.append("# Of Appearances in Top Streamed List");
   sBuilder.append('\n');  
   
   Artist topStreamedArtists = new Artist();
   
   // Array list Element occurence 
   for (Map.Entry<String, Integer> value : map.entrySet()) 
   {
      artistList.add(value.getKey());
      sBuilder.append(value.getKey());
      sBuilder.append(",\t");
      sBuilder.append(value.getValue());
      sBuilder.append('\n');
   }
   
   File txtOutputFile = new File("ArtistsCountWeekOf09-25-2020.txt");
   try (PrintWriter pWriter= new PrintWriter(txtOutputFile)) 
   {
      pWriter.write(sBuilder.toString());
   } 
   catch (FileNotFoundException error) 
   {
      System.out.println(error);
   }

   // Linked list insert 
   // Prints results  
   for (String str : artistList) 
   {
      topStreamedArtists.sortedInsert(topStreamedArtists.newNode(str));
   }
   topStreamedArtists.printList();
   }
}

   