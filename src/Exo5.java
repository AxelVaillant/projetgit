import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,y=0,s1=12,signe=-1;
Scanner scan= new Scanner(System.in);
System.out.println("Saisir n : ");
n=scan.nextInt();
//S1
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		y=y-i;
	}
	else {
		y=y+i;
	}
}
System.out.println("S1 = "+y);
//S2
int s2=0,s3=0;
for(int j=1;j<=n;j++) {
s2=(s1*signe)+((j-1)*signe*20);
System.out.print(" "+s2);
		s3=s2+s3;
signe=signe*-1;

}
System.out.println(" Le résultat est  "+s3);
	}

}
