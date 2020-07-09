/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	       TreeMap<Integer,String> ob=new TreeMap<>();
	       ob.put(80,"A");
	       ob.put(50,"B");
	       ob.put(20,"C");
	       ob.put(10,"D");
	       System.out.println(ob);
	       System.out.println("keys");
	       Set<Integer> keys=ob.keySet();
	       for(Integer key:keys){
	           System.out.println(key);
	       }
	       System.out.println("values");
	       Collection<String> values =ob.values();
	       for(String value:values){
	           System.out.println(value);
	       }
	       System.out.println("keys and values");
	       Set<Map.Entry<Integer,String>> kv=ob.entrySet();
	       System.out.println(entry.getKey()+","+entry.getValue());
	}
}
