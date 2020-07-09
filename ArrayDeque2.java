/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayDeque<Integer> ob= new ArrayDeque<>();
		System.out.println("pushed item 10");
		ob.push(10);
		System.out.println("pushed item 20");
		ob.push(20);
		System.out.println("pushed item 30");
		ob.push(30);
		while(ob.peek()!=null){
		    System.out.println("popped item:"+ob.pop());
		}
	}
}
