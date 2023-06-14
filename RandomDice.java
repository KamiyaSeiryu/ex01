import java.util.Random;
class RandomDice{
public static void main(String args[]){
int x;
int num = 0;
Random Ran = new Random();
System.out.println("Rolling dice...");
for(int i=1; i<3; i++){
x = Ran.nextInt(6) +1;
System.out.println("Die "+i+": "+x);
num += x;
}
System.out.println("Total value: "+num);
}
}
