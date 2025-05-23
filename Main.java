import java.util.Scanner;
public class Main{
  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the amount of water you drink per day in Litre:");
	  double ml = sc.nextInt();
	  if(ml>=4.0){
	     System.out.println("Too Much");
	  } else if(ml<=4.0){
		System.out.println("Not Much");
	    } else {
		   System.out.println("Good");
	      }
	sc.close();
  }
}