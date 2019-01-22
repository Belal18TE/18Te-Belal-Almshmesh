import java.util.Random;

public class InsultOne{

	public static void main(String[] args){

		Random r = new Random();

		//column 1
		String [] firstResponse = {"artless ", "bawdy ", "beslubbering ",
                "bootless ", "churlish ", "cockered ", "clouted ", "clouted ", "craven ", "currish "};
                
                int choice1 = r.nextInt(firstResponse.length);

                String response1 = firstResponse[choice1];
                
		//column2
		String [] secondResponse = {"base-court ", "bat-fowling ", "beef-witted ",
                "beetle-headed ", "clapper-clawed ", "clapper-clawed ", "clay-brained ", "crook-pated ", "dismal-dreaming ", "dizzy-eyed "};

		int choice2 = r.nextInt(secondResponse.length);
                
                String response2 = secondResponse[choice2];

		//column 3
		String [] thirdResponse = {"apple-john", "baggage", "barnacle",
                "bladder", "boar-pig", "bugbear", "bum-bailey", "canker-blossom", "clack-dish", "clotpole"};
                
                int choice3 = r.nextInt(thirdResponse.length);
                
                String response3 = thirdResponse[choice3];


		System.out.println("Thou " + response1 + response2 + response3 + "!");
	}
}