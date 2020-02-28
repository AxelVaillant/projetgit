import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,y=0,Scar=0,Spair=0;
Scanner scan= new Scanner(System.in);
System.out.println("Saisir nombre entier A : ");
a=scan.nextInt();
System.out.println("Saisir nombre entier B : ");
b=scan.nextInt();

if (a>b){
	for(int i=b+1;i<a;i++) {
		y=y+i;
		Scar=Scar+i*i;
		if(i%2==0) {
			Spair=Spair+i;
		}
	}
System.out.println("La somme des nombres entiers entre A et B est "+y);
System.out.println("La somme des carrés des nombres entiers entre A et B est "+Scar);
System.out.println("La somme des entiers pairs entre A et B est "+Spair);
}
else {
	for(int i=a+1;i<b;i++) {
		y=y+i;
		Scar=Scar+i*i;
		if(i%2==0) {
			Spair=Spair+i;
		}
}
	System.out.println("La somme des nombres entiers entre A et B est "+y);
	System.out.println("La somme des carrés des nombres entiers ente A et B est "+Scar);
	System.out.println("La somme des entiers pairs entre A et B est "+Spair);
	}
}
}
