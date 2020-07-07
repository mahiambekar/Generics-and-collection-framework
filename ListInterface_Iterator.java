/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<>();
		System.out.println(ob.size());
		ob.add("A");
		ob.add("B");
		ob.add("C");
		ob.add("D");
	    List Iterator<String> it=ob.listIterator();
	    System.out.println("forward");
	    while(it.hasNext()){
	        String n= it.next();
	        System.out.println(n);
	    }
	    System.out.println("Backward");
	    While it.hasPrevious()){
	        String n=it.Previous(n);
	    }
	    
	}
}
