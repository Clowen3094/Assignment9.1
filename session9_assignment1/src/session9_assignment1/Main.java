package session9_assignment1;
import java.util.*;
//Main program to sort the list according to the size of the HDTV
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<HDTV> obj = new ArrayList<HDTV>();  //creating arraylist and adding three objects ofHDTV
         obj.add(new HDTV("Samsung",48));
         obj.add(new HDTV("Sony",52));
         obj.add(new HDTV("LG",55));
         
         Collections.sort(obj,new SizeComparator()); //using Collection class and sort method to compare
         for (HDTV hdtv : obj){
        	 System.out.println(hdtv);
         }
         
	}

}
