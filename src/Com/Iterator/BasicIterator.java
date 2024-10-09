package Com.Iterator;

import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator {
	
	public static void main(String[] args) {
		
		
ArrayList<Integer> al = new ArrayList<Integer>();

   al.add(1);
   al.add(2);
   al.add(3);
   al.add(4);
   al.add(5);
   al.add(6);
   
   System.out.println(al);
   
   Iterator<Integer> itr = al.iterator();
   
   while(itr.hasNext()) {
   Integer i = itr.next();
   
   if(i == 6) {
	   itr.remove();
	   
   }
   
	   }
   System.out.println(al);
   
	}
}

