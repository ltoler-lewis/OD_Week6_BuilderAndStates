
import java.util.*;

public class Popsicle {
	String name;
	List<String> flavors;
	
	void addFlavors(List<String> flavors) {
		this.flavors = flavors;
	}
 
	void prepare() {
		System.out.println("Preparing a " + name);
		System.out.println("which contains the following flavors: ");
		for (String flavor : flavors) {
			System.out.println(" *  " + flavor);
		}
	}
  
	void freeze() {
		System.out.println("Flash Freezing");
	}
 
	void wrap() {
		System.out.println("Wrapping");
	}
  
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		return display.toString();
	}
}
