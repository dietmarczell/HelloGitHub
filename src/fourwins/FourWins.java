package fourwins;

public class FourWins {
	private int sizeX;
	private int sizeY;
	private char[][] charArray;
	
	public FourWins(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.charArray = new char[sizeX][sizeY];
		
		for (int i =0; i<sizeX;i++)
		{
			for (int j=0; j<sizeY;j++)
			{
				this.charArray[i][j]=' ';
			}
		}
	}
	
	public void print()
	{
		System.out.print("y^");
		for (int i=sizeY-1; i>=0;i--)
		{
			if (i<sizeY-1)
			{
				System.out.print(" |");
			}
			for (int j=0; j<sizeX;j++)
			{
				System.out.print(this.charArray[j][i]);
			}
			System.out.println();
		}
		System.out.println("  ---------->x");
		System.out.println("");
	}

	public int getSizeX() {
		return sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}
	
	public boolean playerA(int x, int y)
	{
		if (this.charArray[x][y] == ' ')
		{
			this.charArray[x][y] = 'A';
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean playerB(int x, int y)
	{
		if (this.charArray[x][y] == ' ')
		{
			this.charArray[x][y] = 'B';
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean playerA(int x)
	{
		for (int i = 0; i < charArray.length; i++) {
			if (this.charArray[x][i] == ' ')
			{
				this.charArray[x][i] = 'A';
				return true;
			}
		}
		return false;
	}
	
	public boolean playerB(int x)
	{
		for (int i = 0; i < charArray.length; i++) {
			if (this.charArray[x][i] == ' ')
			{
				this.charArray[x][i] = 'B';
				return true;
			}
		}
		return false;
	}
	
	private char fourInRow()
	{
		int counterA = 0;
		int counterB = 0;
		for (int i =0; i<sizeX;i++)
		{
			counterA=0;
			counterB=0;
			for (int j=0; j<sizeY;j++)
			{
				if (this.charArray[i][j] == 'A')
				{
					counterA++;
					counterB=0;
				}
				else if (this.charArray[i][j] == 'B')
				{
					counterB++;
					counterA=0;
				}
				else if (this.charArray[i][j] == ' ')
				{
					counterA=0;
					counterB=0;					
				}
				if (counterA == 4)
				{
					return 'A';
				}
				else if (counterB == 4)
				{
					return 'B';
				}
			}
		}
		return '-';
	}
	
	private char fourInColumn()
	{
		int counterA = 0;
		int counterB = 0;
		for (int j =0; j<sizeY;j++)
		{
			counterA=0;
			counterB=0;
			for (int i=0; i<sizeX;i++)
			{
				if (this.charArray[i][j] == 'A')
				{
					counterA++;
					counterB=0;
				}
				else if (this.charArray[i][j] == 'B')
				{
					counterB++;
					counterA=0;
				}
				else if (this.charArray[i][j] == ' ')
				{
					counterA=0;
					counterB=0;					
				}
				if (counterA == 4)
				{
					return 'A';
				}
				else if (counterB == 4)
				{
					return 'B';
				}
			}
		}
		return '-';
	}
	
	
	
	public char winner()
	{
		char row = fourInRow();
		char column = fourInColumn();
		if (row == 'A' || row == 'B')
		{
			System.out.println("The winner is "+row+" !!!");
			return row;
		}
		else if (column == 'A' || column == 'B')
		{
			System.out.println("The winner is "+column+" !!!");
			return column;
		}
		
		return '-';
	}

}
