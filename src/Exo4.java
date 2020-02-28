import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,e=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Saisir n : ");
		n=scan.nextInt();
		
		for(double i=1;i<=n;i++) {
			e=e+1/i;

		}
		System.out.println("E(n) = "+e);
	}

}
