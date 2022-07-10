package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=11;
int firstnum=0,secnum=1,sum=0;
System.out.print(firstnum + ",");
System.out.print(secnum + ",");
for (int i = 1; i<=n; i++) {
sum=firstnum+secnum;
firstnum=secnum;
secnum=sum;
System.out.print(sum + ",");
}
	}

}


