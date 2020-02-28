import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
Scanner scan= new Scanner(System.in);
System.out.println("Saisir le numéro du jour de la semaine :");
x=scan.nextInt();

switch(x) {
case 1: System.out.println("Lundi");
break;
case 2: System.out.println("Mardi");
break;
case 3: System.out.println("Mercredi");
break;
case 4: System.out.println("Jeudi");
break;
case 5: System.out.println("Vendredi"); 
break;
case 6: System.out.println("Samedi");
break;
case 7: System.out.println("Dimanche");
break;
default: System.out.println("Uniquement 7 jours dans la semaine");
}
	}

}
