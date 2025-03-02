import java.util.Scanner;
public class Hello{
  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	int m=16;
	if (n<=0){
	   System.out.println("Invalid input!");
	}else{
	System.out.println(m+n);
	}
  }
}