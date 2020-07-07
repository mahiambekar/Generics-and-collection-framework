/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Test<T> {

    T i;

    Test(T i) {
        this.i = i;
    }

    void show() {
        System.out.println(i);
        System.out.println(i.getClass().getTypeName());
    }
}
public class Main
{
	public static void main(String[] args) {
        Test<String> t1 = new Test<>("abc");
        Test<Integer> t2 = new Test<>(100);
        t1.show();
        t2.show();
	}
}
