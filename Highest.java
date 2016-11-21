import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highest=0;
		 Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");

		int x = in.nextInt();

		System.out.print("Enter second number: ");

		int y = in.nextInt();

		System.out.print("Enter third number: ");

		int z = in.nextInt();
		if((x>y)&&(x>z))
		{
			highest=x;
			System.out.println("Biggest no: "+highest);	
		}
		else if((y>z)&&(y>x))
		{
			highest=y;
			System.out.println("Biggest no: "+highest);
		}
		else if((z>x)&&(z>y))
		{
			highest=z;
			System.out.println("Biggest no: "+highest);
		}
		else
		{
			highest=0;
			System.out.println("Invalid");
		}
		
				
	

	}

}
