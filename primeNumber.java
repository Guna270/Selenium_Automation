package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2;i < (input/2); i++) {
			if (input%i ==0) {
				flag = true;
				break;
			}
			
		}
		if (flag == true) {
			System.out.println( input +" is Not a Prime Number");
		}
		else {
			System.out.println(input +" is a Prime Number");
		}

	}

}
	 