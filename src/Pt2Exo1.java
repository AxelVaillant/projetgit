import java.util.Scanner;

public class Pt2Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min=0,max=0;
int x;
double moy,n=0,som=0;
Scanner scan= new Scanner(System.in);
do {

	System.out.println("Saisir nombre entier : ");
	x=scan.nextInt();
	if(x!=0) {
	som=som+x;
	n=n+1;
	if(max<x) {
		max=x;
	}
	if(min>x) {
		min=x;
		
	}
}}
	while(x!=0);
moy=som/n;
System.out.println("Moyenne : "+moy);
System.out.println("Maximum : "+max);
System.out.println("Minimum : "+min);

	

}
}