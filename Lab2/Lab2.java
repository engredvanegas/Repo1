import java.io.*; // I/O import statement
import java.util.*; // Needed for the Util class

/**
   This lab's objective is to create a report of who
   appears on spotify's top streamed list.
*/

public class Lab2 
{
   private Node head;
   
   // Artist represented by Node
   public class Node 
   {
      private String data;
      private Node next;
      public Node(String person) 
      {
         data = person;
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
      Node val = head;
      File out = new File("Lab2-TopStreamedArtists.csv ");
      StringBuilder build = new StringBuilder();
      build.append("Artist");
      build.append('\n');

      while (val != null) 
      {
         System.out.print(val.data + ", ");
         build.append(val.data);
         build.append('\n');
         val = val.next;
      }

   try (PrintWriter writer = new PrintWriter(out)) 
   {
      writer.write(build.toString());
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
   StringBuilder sb = new StringBuilder();
   sb.append("Artist");
   sb.append(',');
   sb.append("Count");
   sb.append('\n');

   Lab2 topStreamedArtists = new Lab2();
   
   // Array list Element occurence 
   for (Map.Entry<String, Integer> val : map.entrySet()) 
   {
      artistList.add(val.getKey());
      sb.append(val.getKey());
      sb.append(',');
      sb.append(val.getValue());
      sb.append('\n');
   }

   File csvOutputFile = new File("Number of times Artist appears.csv");
   try (PrintWriter writer= new PrintWriter(csvOutputFile)) 
   {
      writer.write(sb.toString());
   } 
   catch (FileNotFoundException error) 
   {
      System.out.println(error);
   }

   // Linked list insert 
   // Prints results  
   for (String s : artistList) 
   {
      topStreamedArtists.sortedInsert(topStreamedArtists.newNode(s));
   }
   System.out.println("Alphabetized Artist's Names");
   topStreamedArtists.printList();
   }
}

