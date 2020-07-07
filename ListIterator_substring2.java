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
	    ob.add("E");
	    ob.add("F");
	    List<String>list1=ob.subList(1,s);
	    for(String s:list1){
	        System.out.println(s);
	    }
	    
	    
	}
}
