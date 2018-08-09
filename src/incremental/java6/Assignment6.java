package incremental.java6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Create a generic, singly linked list class called SList, which, to keep things simple,
does not implement the List interface.
 Each Link object in the list should contain a reference to the next element in the list,
  but not the previous one (LinkedList, in contrast, is a doubly linked list,
  which means it maintains links in both directions). Create your own SListIterator which, again for simplicity,
  does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ),
  which produces an SListIterator. The only way to insert and remove elements from an SList is through SListIterator.
  Write code to demonstrate SList.
 */

public class Assignment6{
    public static void main(String[] args) {
        // First, show some use cases for SListIterator
        System.out.println("demonstrating SListIterator");
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slit = sl.iterator();
        slit.add("One");
        slit.add("Two");
        slit.add("Three");
        System.out.println(slit.hasNext());
        System.out.println(sl);
        slit = sl.iterator();
        slit.add("Four");
        for(; slit.hasNext();){
            System.out.println(slit.next());}
        System.out.println(sl);
        slit = sl.iterator();
        //System.out.println("1");
        System.out.println(slit.hasNext());
        System.out.println(slit.next());
        System.out.println(sl);
        // Now, show the same use cases for ListIterator, too
        System.out.println("Demonstrating list iterator");
        List<String> l = new ArrayList<String>();
        System.out.println(l);
        ListIterator<String> lit = l.listIterator();
        lit.add("One");
        lit.add("Two");
        lit.add("Three");
        System.out.println(lit.hasNext());
        System.out.println(l);
        lit = l.listIterator();
        lit.add("Four");
        for(; lit.hasNext();)
            System.out.println(lit.next());
        System.out.println(l);
        lit = l.listIterator();
        System.out.println(lit.next());
        lit.remove();
        System.out.println(lit.next());
        System.out.println(l);
    }
}