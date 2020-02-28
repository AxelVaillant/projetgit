import java.util.Scanner;

public class Pt2Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x;
		int voy=0,chif=0,autre=0;
Scanner scan= new Scanner(System.in);
do {
	System.out.println("Saisir chaine de caractères");
	x= scan.nextLine();
	x=x.toLowerCase();
	for(int i=0;i<x.length();i++) {
		
		
	if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'||x.charAt(i)=='y') {
	voy=voy+1;
		}
	else if(x.charAt(i)=='0'||x.charAt(i)=='1'||x.charAt(i)=='2'||x.charAt(i)=='3'||x.charAt(i)=='4'||x.charAt(i)=='5'||x.charAt(i)=='6'||x.charAt(i)=='7'||x.charAt(i)=='8'||x.charAt(i)=='9') {
		chif=chif+1;
	}
	else {
		autre=autre+1;
	}
	}
}
while(x.charAt(x.length()-1)!='.');
System.out.println("Il y a "+voy+" voyelles");
System.out.println("Il y a "+chif+" chiffres");
System.out.println("Il y a "+autre+" autres caractères");
	}

}
