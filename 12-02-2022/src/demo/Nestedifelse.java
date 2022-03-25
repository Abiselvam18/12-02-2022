package demo;

public class Nestedifelse {

	public static void main(String[] args) {
		
		int num=18;
		if (num>0){
		{
			System.out.println(num+" is positive number");
		}
			if (num%2==0)
			{
				System.out.println("Entered Number is Even");
			}
			else
				{
					System.out.println("Entered Number is Odd");
				}
	    }
			else
			{
					System.out.println(num+" is negative number");
			}
		
	}

}
