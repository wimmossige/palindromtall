/*
* 
* Wim Felix Mossige
* Modul 6
* Palindromtall
* 
 */
import java.util.Scanner;
public class palindromtall {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.print(" | Skriv inn et tall: ");
		int userNum = input.nextInt();
		int userNumRev = nummerReversert(userNum);

		if (userNum == userNumRev) {
			System.out.println(" | Tallet: " + userNum + " er et Palindromtall");
		}else 
		System.out.println(" | Tallet: " + userNum + " er ikke et Palindromtall");
	}
	public static int nummerReversert(int num) {	
		int reverseNum = 0;			
		while( num != 0 ) {
        reverseNum = reverseNum * 10;
        reverseNum = reverseNum + num%10;
        num = num/10;
      	}
		return reverseNum;
	}	
}