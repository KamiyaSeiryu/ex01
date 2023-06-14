import java.util.Random;
import java.util.Scanner;
class RandomDice{
    public static void main(String args[]){
	int x;
	int num = 0;
	Random Ran = new Random();

	Scanner Scan = new Scanner(System.in);
	System.out.println("What is your name?");
	System.out.print(">");
	String name = Scan.next();
	System.out.println("Hello, "+name+"!");
	
	
	System.out.println("Rolling dice...");
	for(int i =1; i<3;i++){
	    x = Ran.nextInt(6) + 1;
	    System.out.println("Die "+i+": "+x);
	    num += x;
	}
	System.out.println("Total value: "+num);

	if(num > 7){
	    System.out.println(name+" won");
	}
	else{
	    System.out.println(name+" lose");
	}
	    	//手順6でやることを手順5でやってしまったので、手順6の代わりにこのメッセージを追加//
    }
}
