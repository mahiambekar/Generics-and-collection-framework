/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayDeque<Integer> ob=new ArrayDeque<>();
		ob.addLast(10);
		ob.addLast(20);
		ob.addLast(30);
		ob.addLast(40);
		System.out.println(ob.removeFirst());
	}
}
