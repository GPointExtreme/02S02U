package rekursion.ue.add;

public class AddDemo {

	public static void main(String[] args) {
		
		System.out.println(add(3, 5));
		System.out.println(mul(3, 5));

	}
	
	public static int add(int a, int b) {
		if(b==0) {
			return a;
		}
		return add(++a, --b);
	}
	
	public static int mul(int a, int b) {
		if (b==1) {
			return a;
		}
		return add(a, mul(a, b-1));	
	}

}
