class Classc1{
	public void show() {
		System.out.println("This is Parent");
	}
}
class Classc2 extends Classc1{
	public void display() {
		System.out.println("This is a Child-1");
	}
	public void print() {
		System.out.println("This ia a Child-2");
	}
}
public class Hybridinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classc2 c3 = new Classc2();
		c3.show();
		c3.display();
		c3.print();

	}

}
