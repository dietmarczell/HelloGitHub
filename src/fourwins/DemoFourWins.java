package fourwins;

public class DemoFourWins {

	public static void main(String[] args) {

		FourWins gewinnt = new FourWins(6,6);
		char win = ' ';
		int i = 0;
		int j = 0;
		do
		{
			gewinnt.playerA(0,j);
			win=gewinnt.winner();
			gewinnt.playerB(1,j);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(i,1);
			win=gewinnt.winner();
			gewinnt.playerB(i,2);
			gewinnt.print();
			win=gewinnt.winner();
			i++;
			j++;
		}
		while(win != 'A' && win != 'B');
		System.out.println("The winner is "+win+" !!!");
		
	}

}
