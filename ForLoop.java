public class ForLoop {

	public static void main(String args[]) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(", ");
			
			if(x==20)
				break;
		}
		System.out.print("\n");
		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for (String name : names) {
			System.out.print(name);
			System.out.print(", ");
		}
		outer:
			for (int i =0; i < names.length; i++){
			
				for(int x=0; x<10; x++)
			
					if(i==0)
						continue outer;
			
			System.out.println(names[i]);
		}
	}
}