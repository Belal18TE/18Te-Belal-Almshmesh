import java.util.Scanner;
import java.util.Random;

public class CalculaterT{

	public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
                String Again;
                do {
		Random r = new Random();

		//column 1
		String [] firstResponse = {"noll ", "ett ", "två ", "tre ",
                "fyra ", "fem ", "six ", "sju ", "åtta ", "nio ", "tio ", "elva ", "tålv "};
                
                int choice1 = r.nextInt(firstResponse.length);

                String response1 = firstResponse[choice1];
                
			

		int choice2 = r.nextInt(firstResponse.length);

                String response2 = firstResponse[choice2];
                int produkt = choice1 * choice2;
                
                System.out.println("Vad är " + response1 + "gånger " + response2 + "?");
                
                Scanner keyboard = new Scanner(System.in);
                int svar = keyboard.nextInt();
                
                if (svar == produkt) {
                    System.out.println("Rätt!");
                } else {
                    System.out.println("Fel!");
                }
                
            System.out.println();
            System.out.println("Spela igen (J/N)?: ");
            Again = scan.next();
            System.out.println();
        } while (Again.equalsIgnoreCase("j"));
                
                }
                    
        }

                