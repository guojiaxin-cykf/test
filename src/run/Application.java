package run;

import java.util.Arrays;
import java.util.Scanner;
import t0305.candle;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		candle cd = new candle();
		int candies,num_people;
		System.out.print("Candies:");
		candies=sc.nextInt();
		System.out.print("num_people:");
		num_people=sc.nextInt();
		System.out.println();
		int[] list = new int[num_people];
		list=cd.distributeCandies(candies, num_people);
		System.out.println(Arrays.toString(list));
	}
}
