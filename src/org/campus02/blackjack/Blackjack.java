package org.campus02.blackjack;

import java.util.HashMap;
import java.util.Iterator;

public class Blackjack {
	
	private HashMap<player,Integer> players  = new HashMap<>();

	boolean add(player player)
	{
		if (players.containsKey(player))
			return false;
		else
		{		
			players.put(player, 0);
			return true;
		}
	}
	
	boolean addCard(player player, Integer cardValue)
	{
		if (players.containsKey(player)) 
		{
			int value = players.get(player);
			players.put(player, value+cardValue);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Integer getValue(player player)
	{
		return players.get(player);
	}
	
	public String toString()
	{
		String result = "";
		for (player p : players.keySet())
		{
			result += p.getName() + ", Kartenwert:" + players.get(p)+"\n";
		}
		return result;
	}
}
