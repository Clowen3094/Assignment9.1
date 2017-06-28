package session9_assignment1;

import java.util.Comparator;


	public class SizeComparator implements Comparator<HDTV>{
		public int compare(HDTV s1,HDTV s2){
			if (s1.getSize() < s2.getSize()){
				return -1;
			}
			else {
				return 1;
			}
		}
}
