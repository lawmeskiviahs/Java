import java.util.*;
public class quickSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("Hello World");
		int x = sc.nextInt();
		if(x==0)
			System.out.println("0 is neither prime nor composite.");
		else if (x==1) {
			System.out.println("0 is neither prime nor composite.");
			System.out.println("1 is a prime number.");
		else {
		    System.out.println("0 is neither prime nor composite.");
		    System.out.println("1 is a prime number.");
			}
			for(int i=2;i<=x;i++) {
      		int flag=0;
		    	for(int j=1;j<=i;j++)
		        	if((i%j)==0)
		            	flag++;
		    if(flag==2)
		        System.out.println(i+" is a prime number");
			}
		}
	}
}
