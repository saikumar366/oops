abstract class arithmatic{
	public void sum(int x, int y) {
		System.out.println(x+y);
	}
	public void sub(int x, int y) {
		System.out.println(x-y);
	}
	public abstract void mul(int x, int y);
	public abstract void div(int x, int y);
}
class demo extends arithmatic{
	
	public void mul(int x , int y) {
		System.out.println(x*y);
	}
	
	
	public void div(int x, int y) {
		System.out.println(x/y);
	}
}
public class Abstractclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo r1 = new demo();
		r1.sum(20,30);
		r1.sub(30,3);
		r1.mul(2,3);
		r1.div(20,2);

	}

}
