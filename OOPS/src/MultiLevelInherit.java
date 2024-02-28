class Classa1{
	public void show() {
		System.out.println("This a Grand-Parent");
	}
}
class Classa2 extends Classa1{
	public void display() {
		System.out.println("This is Parent");
	}
}
class Classa3 extends Classa2{
	public void print() {
		System.out.println("This is a Child");
	}
}
public class MultiLevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classa3 c3 = new Classa3();    
		c3.show();
		c3.display();
		c3.print();

	}

}
