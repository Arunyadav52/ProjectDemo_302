import java.util.Scanner;

public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s;
		s=new Scanner(System.in);
		System.out.println("What is 2+2 ");
		int x;
		x=s.nextInt();
		
		if(x==4)
			System.out.println("Correct Ans");
		else
			System.out.println("Wrong Ans");
			
	}

}
