package session9_assignment1;
import java.util.*;

public class HDTV {              //Creating class HDTV with two properties
private String Brandname;
private int Size;

HDTV(String Brandname,int Size){       //Comparator of HDTV accepting two values
	this.Brandname=Brandname;
	this.Size = Size;
	
}
// get and set method for private variables of class HDTV
public String getBrandname() {
	return Brandname;
}

public void setBrandname(String brandname) {
	Brandname = brandname;
}

public int getSize() {
	return Size;
}

public void setSize(int size) {
	Size = size;
}
public String toString(){               //to get values in HDTV 
	return this.Brandname+" "+this.Size;
	
	
}

}


