
public class Power {

	public static void main(String[] args) {
		int a = 2, b=3;
		//int pow = (int)Math.pow(a,b);
		int power = a;
		for(int i = 1; i < 5; i++)
			power = power * a;
		System.out.println("The value of power is: " + power);

	}

}
