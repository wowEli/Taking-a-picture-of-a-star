package day04;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("입력: ");
			int num=sc.nextInt();
			if(num>0) {
				for(int a=1;a<=num;a++) {
					for(int i=1;i<=num;i++) {
						if(a+i<=num) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;
			}
			else {
				System.out.println("다시!");
			}
		}
	}

}
