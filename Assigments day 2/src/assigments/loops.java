package assigments;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For loop");
		for (int i=25; i>10;i--) {
			System.out.println("i is " + i);
		}
		System.out.println("While loop");
		int x = 25;
		while(x != 33) {
			System.out.println(x);
			x++;
		}
		System.out.println("Do While loop");
		x = 25;
		do{
			System.out.println("print inside a  do while loop");
		}while (x!=25);
		
		
		x = 3;
		switch(x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default :
			System.out.println("Other numbers");
			break;
	}

}
}
