package studio3;

import java.util.Scanner;

public class seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to find prime numbers up to? ");
		int n = in.nextInt();

		int[] nArray = new int[n - 1];
		int numbers = 2;

		for (int i = 0; i < nArray.length; i++) {
			nArray[i]=numbers; //fill nArray with all the numbers from 2 to n
			numbers++;
		}

		numbers = 2;
		boolean[] cTpF = new boolean[n-1]; //automatically everything is filled as false

		
		while(numbers <= n/2) {

			for (int i1 = numbers + numbers; i1 <= n; i1 += numbers) {
				cTpF[i1-2]=true;
			
			}
         numbers++;
		}
       
		for (int i =0; i < cTpF.length; i++)
		{
			System.out.println(nArray[i] + String.valueOf(cTpF[i]));
			if (cTpF[i] = false) {
				System.out.println(nArray[i]);
			}
		}


	}

}
