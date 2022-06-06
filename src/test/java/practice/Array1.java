package practice;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int i[];
		i=new int [5];
		
		i[0]=52;
		i[1]=23;
		i[2]=11;
		i[3]=45;
		i[4]=63;
    
		System.out.println("for normal printing");
		for (int j=0; j<5; j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("for ascending order");
		Arrays.sort(i);
		
		try {
		for(int k=0; k<=i.length; k++) {
			System.out.println(i[k]);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("for descending order");
		for (int l=4; l>=0;l--) {
			System.out.println(i[l]);
		}
	}

}
