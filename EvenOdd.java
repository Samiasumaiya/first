package demojava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        
        int num=s.nextInt();
       
        if(num%2 == 0) {
        	System.out.println("Number is even:" +num);
        }
        else {
        	System.out.println("Odd number:" +num);
        }
	}

}
