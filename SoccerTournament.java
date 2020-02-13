package soccer;


	import java.util.Scanner;
	import java.util.Random;
	public class SoccerTournament{
		public static void main(String[] args) {

			System.out.println("-----------------------------------------------------\n"+"Welcome to Tournament Outcome Predictor Program\n"+"-----------------------------------------------------");
			String response;
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a name for the soccer tournament");
			String tournament= keyboard.nextLine();

	 
			System.out.println("Please enter the 8 participating teams");
				String[] teams=new String [8];
					teams[0]=keyboard.nextLine();
					teams[1]=keyboard.nextLine();
					teams[2]=keyboard.nextLine();
					teams[3]=keyboard.nextLine();
					teams[4]=keyboard.nextLine();
					teams[5]=keyboard.nextLine();
					teams[6]=keyboard.nextLine();
					teams[7]=keyboard.nextLine();

			System.out.println("----- " +tournament+ " Outcome Predictions -----\n");
			
			do
			{
				int length = teams.length;
				String[] t = new String[length];

				Random random= new Random();
				int number = 0;
				int randomNumber=0;
				while(number<length)
				{
					randomNumber = random.nextInt(length);
					if (t[randomNumber] == null)
					{
						t[randomNumber]=teams[number];
						number++;
					}
				}
				for(int i = 0 ; i<8;++i)
				{
					teams[i] = t[i];
				}
				

				//Quarter Final No. 1 
				String[] QF1 = new String[2];
				String[] semiFinal = new String [4];
				int j = 0;
				for(int i = 0 ; i<QF1.length ; ++i)
				{
					QF1[i] = teams[j++];
				}
				System.out.println("Quarter Final 1 : ");
				System.out.println(QF1[0]+" VS "+QF1[1]); 
				String winner = null;
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = QF1[randomNumber-1];
				System.out.println(winner +" wins!!!");
				semiFinal[0]=winner;
				System.out.println();

				//Quarter Final No. 2 
				String[] QF2 = new String[2];

				for(int i = 0 ; i<QF2 .length ; ++i) 
				{
					QF2 [i] = teams[j++];
				}
				System.out.println("Quarter Final 2 : ");
				System.out.println(QF2 [0]+" VS "+QF2[1]);
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = QF2[randomNumber-1];
				System.out.println(winner +" wins!!!");
				semiFinal[1]=winner;
				System.out.println();

				//Quarter Final No. 3 
				String[] QF3 = new String[2];

				for(int i = 0 ; i<QF3 .length ; ++i)
				{
					QF3[i] = teams[j++];
				}
				System.out.println("Quarter Final 3 : ");
				System.out.println(QF3[0]+" VS "+QF3[1]);
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = QF3[randomNumber-1];
				System.out.println(winner +" wins!!!");
				semiFinal[2]=winner;
				System.out.println();

				//Quarter Final No. 4 
				String[] QF4 = new String[2];

				for(int i = 0 ; i<QF4.length ; ++i)
				{
					QF4[i] = teams[j++];
				}
				System.out.println("Quarter Final 4 : ");
				System.out.println(QF4[0]+" VS "+QF4[1]);
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = QF4[randomNumber-1];
				System.out.println(winner +" wins!!!");
				semiFinal[3]=winner;
				System.out.println();
				
				t = new String[semiFinal.length];
				random= new Random();
				number = 0;
				while(number<semiFinal.length)
				{
					randomNumber = random.nextInt(semiFinal.length);
					if (t[randomNumber] == null)
					{
						t[randomNumber]=semiFinal[number];
						number++;
					}
				}
				for(int i = 0 ; i<semiFinal.length;++i)
				{
					semiFinal[i] = t[i];
				}
				String Final[]=new String[2]; //lastTry
			   System.out.println("Semi-Final 1 : ");
				String[] SF1 = {semiFinal[0], semiFinal[1]};
				//for (int i = 0 ; i<SF1.length ; ++i)
				//{
					System.out.println(SF1[0]+" VS "+SF1[1]);
				//}
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = SF1[randomNumber-1];
				System.out.println(winner +" wins!!!");
				Final[0]=winner;
				System.out.println();
				
				System.out.println("Semi-Final 2 : ");
				String[] SF2 = {semiFinal[2], semiFinal[3]};
				System.out.println(SF2[0]+" VS "+SF2[1]);
				random = new Random();
				randomNumber = random.nextInt(2)+1;
				winner = SF2[randomNumber-1];
				System.out.println(winner +" wins!!!");
				Final[1]=winner;
				System.out.println();
		
				System.out.println("Final");
				System.out.println(Final[0]+" VS "+Final[1]);
				System.out.println();
				System.out.print("Final winner: ");
				System.out.println(winner+ "\n");
				
	 
				System.out.println("Do you want a different outcome? y or n");
				response = keyboard.nextLine();
				
			}while ( (response.toUpperCase()).compareTo("Y") == 0 );  
			
			keyboard.close();
			
		System.out.println("Thank you for using the JAVA Tournament Winner Predictor Program"); 
		}
	}


