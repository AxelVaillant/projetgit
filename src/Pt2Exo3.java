import java.util.Scanner;

public class Pt2Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,n,compteur=0,multi=0;
String nbm=" ",p=" ";
Scanner scan=new Scanner(System.in);
System.out.println("N = ?");
n= scan.nextInt();

do {
	System.out.println("Saisir nombre entier : ");
	x=scan.nextInt();
	if(x%2==0) {
		compteur=compteur+1;
		p=p+" "+x;
		if(x%3==0) {
			multi=multi+1;
			nbm=nbm+" "+x;
		}

	}
}
while (compteur<n);
System.out.println("Le nombre d'entiers multiples de 3 est égal à "+multi);
System.out.print("Les nombres pairs lus sont "+p+"\n");
System.out.println("Les nombres multiples de 3 sont "+nbm+"\n");
	}

}
