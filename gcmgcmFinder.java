import java.util.Scanner;
public class gcmgcmFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 2 numbers: ");
		int n1 =input.nextInt();
		int n2 =input.nextInt();
		if(n1<n2) {
			 max=n2;
		}
		else {
			max=n1;
		}
		int i = 1 ;
		int gcd=0 ;
		int lcm = max;
		while (i<=n1 && i<=n2) {
			if(n1%i==0 && n2%i==0) {
				gcd=i ;
				
			}
			i++;
		}
		
		i=max;
		while(i<=n1*n2) {
			if(i%n1==0 && i%n2==0) {
				lcm=i;
				break;
			}
			i++;
			
		}
		
		System.out.println("Greatest common divisor is "+gcd);
		System.out.print("Lowest common multiple is "+lcm);
		
		
		
		
		
		
	}

}
