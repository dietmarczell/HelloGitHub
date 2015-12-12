package fourwins;

public class DemoFourWins {

	public static void main(String[] args) {

		FourWins gewinnt = new FourWins(6,7);
		char win = ' ';
		do
		{
			gewinnt.playerA(0);
			win=gewinnt.winner();
			gewinnt.playerB(1);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(1);
			win=gewinnt.winner();
			gewinnt.playerB(2);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(3);
			win=gewinnt.winner();
			gewinnt.playerB(4);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(5);
			win=gewinnt.winner();
			gewinnt.playerB(4);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(5);
			win=gewinnt.winner();
			gewinnt.playerB(5);
			gewinnt.print();
			win=gewinnt.winner();
			gewinnt.playerA(3);
			win=gewinnt.winner();
			gewinnt.playerB(2);
			gewinnt.print();
			win=gewinnt.winner();
		}
		while(win != 'A' && win != 'B');
		System.out.println("The winner is "+win+" !!!");
		
	}

}
