import java.util.LinkedList;



// *******************************************************
  // LinkedList =  Nodes are in 2 parts (data + address)
  //                        Nodes are in non-consecutive memory locations
  //                        Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist
  // *******************************************************



public class _linkedLists {
    
    public static void main(String[] args) {


        //doubly linked list
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.push("Leon");
        linkedlist.push("Ada");
        linkedlist.push("Carlos");
        //most recent addition appears on the left hand side

        System.out.println(linkedlist);//[Carlos, Ada, Leon]

        linkedlist.pop();// carlosless world



        //treat it as a queue, use offer instead of push.   Push treats it as a stack
        linkedlist.offer("Jill");//addition on right hand side
    
        System.out.println(linkedlist);//[Ada, Leon, Jill]

        linkedlist.push("Nemesis");
        linkedlist.push("Ramon Salazar");
        linkedlist.poll();//removes head

        System.out.println(linkedlist);

        linkedlist.add(2, "Ashley");
        linkedlist.remove("Nemesis");

        System.out.println(linkedlist);

        System.out.println(linkedlist.indexOf("Leon"));
        System.out.println(linkedlist.peekFirst() + " " + linkedlist.peekLast());

        linkedlist.addFirst("Louis");
        linkedlist.addLast("Chris");

        String first = linkedlist.removeFirst();
    }
}
