/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Hashtable<Integer,String>ob=new Hashtable<>();
		ob.put(10,"A");
		ob.put(20,"B");
		ob.put(30,"C");
		Set<Map.Entry<Integer,String>> kv=ob.entrySet();
		for(Map.Entry<Integer,String>entry: kv){
		    System.out.println(entry.getKey()+","+entry.getValue());
		}
	}
}
