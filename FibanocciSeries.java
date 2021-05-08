package week1.day1;

public class FibanocciSeries {

	public static void main(String[] args) {
		int range = 8,firstNumber = 0,secondNumber = 1,sum = 0 ;
		System.out.print(firstNumber+" "+secondNumber);
		for (int i = 2; i < range; i++) {
			sum = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.print(" "+sum);
		}
	}

}
