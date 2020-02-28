import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
Scanner scan= new Scanner(System.in);
System.out.println("Saisir nombre entier : ");
x=scan.nextInt();

for(int i=1;i<=x;i++) {
	if(x%i==0) {
		System.out.println(+i+" est un diviseur de "+x);
		}
	else {} 
}

	}

}
