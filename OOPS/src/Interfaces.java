class Sample implements Iarithematic{
	@Override
	public void sum(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x+y);
		
	}

	@Override
	public void sub(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x-y);
		
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iarithematic a1 = new Sample();
		a1.sum(2,25);
		a1.sub(30,3);
		

	}

}


