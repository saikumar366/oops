class Bankv1{
	public void withdraw(int amount) {
		System.out.println("Withdraw using NetBanking");
	}
}
class Bankv2 extends Bankv1{
	public void withdraw(int amount) {
		System.out.println("Withdraw using UPI");
	}
}
public class DynamicPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankv1 v1 = new Bankv1();
		v1.withdraw(10000);
		
		Bankv2 v2 = new Bankv2();
		v2.withdraw(2000);

	}

}
