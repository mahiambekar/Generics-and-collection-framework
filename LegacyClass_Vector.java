/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Vector <String> ob=new Vector<>();
		ob.addElement("A");
		ob.addElement("B");
		ob.addElement("C");
		ob.addElement("D");
		Enumeration<String>it=ob.elements();
		while(it.hasMoreElements()){
		    String n=it.nextElement();
		    System.out.println(n);
		}
		for(String s:ob){
		    System.out.println(s);
		}
		
	}
}
