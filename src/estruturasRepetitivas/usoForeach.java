package estruturasRepetitivas;

public class usoForeach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("::::Com foreach::::");
		
		for (String string : vect) {
			System.out.println(string);
		}

	}
}
