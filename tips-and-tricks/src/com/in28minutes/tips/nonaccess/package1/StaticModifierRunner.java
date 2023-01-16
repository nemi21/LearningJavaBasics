package com.in28minutes.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(count);
		this.name = name;
	}
	
	
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		
		Player player2 = new Player("Federer");
		System.out.println(Player.getCount());


	}

}
