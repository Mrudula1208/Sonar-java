package Misc;
import java.util.*;
public class matrixTranspose {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Take input for forming a matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix before transpose:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrix after transpose:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) 
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}	
	}
}