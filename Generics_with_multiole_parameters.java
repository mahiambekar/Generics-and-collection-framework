/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test<T, V> {

    T i;
    V j;

    Test(T i, V j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println(i);
        System.out.println(i.getClass().getTypeName());
        System.out.println(j);
        System.out.println(j.getClass().getTypeName());
    }
}
public class Main
{
	public static void main(String[] args) {
		Test<String, Integer> t1 = new Test<>("abc", 100);
        t1.show();
	}
}
