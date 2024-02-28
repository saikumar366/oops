class Arithematic{
	public void sum(int x, int y) {
		System.out.println(x+y);
	}
	public void sum(int x, int y , int z) {
		System.out.println(x+y+z);
	}
	public void sum(double x, double y) {
		System.out.println(x+y);
	}
}
public class StaticPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithematic ar = new Arithematic();
		ar.sum(20,50);
		ar.sum(40,30,70);
		ar.sum(15.25,  26.35);

	}

}
