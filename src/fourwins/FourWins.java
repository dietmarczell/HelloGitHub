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
		for (int i =0; i<sizeX;i++)
		{
			for (int j=0; j<sizeY;j++)
			{
				System.out.print(this.charArray[i][j]);
			}
			System.out.println();
		}
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
			return row;
		}
		else if (column == 'A' || column == 'B')
		{
			return column;
		}
		return '-';
	}

}
