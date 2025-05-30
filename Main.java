import java.util.Scanner;
public class Main{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the amount of water you drink per day in Litre:");
	  int ml = sc.nextInt();
	  if(ml==4){
		System.out.println("Good");
	  }else if(ml>4){
		System.out.println("Too Much");
	  }else{
		System.out.println("Drink Water");
	  }
		sc.close();
	  }
  }
