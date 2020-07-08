/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<Integer> ob=new TreeSet<>();
		ob.add(10);
		ob.add(5);
		ob.add(20);
		ob.add(2);
		ob.add(40);
		ob.add(7);
		System.out.println(ob);
		
		for(Integer x:ob){
		    System.out.println(x);
		}
	}
}
