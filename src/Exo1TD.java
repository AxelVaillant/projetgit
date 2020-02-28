import java.util.Scanner;

public class Exo1TD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		long y=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Saisir nombre entier :");
		x=scan.nextInt();
		
		for(int i=1;i<=x;i++) {
			y=y*i;
		}
		System.out.println("Le produit factoriel de "+x+" est "+y);
	}

}
