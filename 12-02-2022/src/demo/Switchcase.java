package demo;

public class Switchcase {

	public static void main(String[] args) {
		
		int num=10;
		char ch='a', spchar='@';
		switch(ch)
		{
		case 10:
			System.out.println("It is digit");
			break;
		case 'a':
			System.out.println("It is Character");
			break;
		case '@':
			System.out.println("It is Special Character");
			break;
		default:
			System.out.println("Invalid");
		
		}

	}

}
