package game;

import java.util.Scanner;
//import java.util.Hashtable;
//import java.util.Arrays;

import fixtures.Fixture;
import fixtures.Room;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	//Hashtable<String, Integer> directions;
	static Player player = new Player();
	
	
	public static void main(String[] args) {
		//Greeting
		System.out.println("Hello Gamer, welcome to Home Tour.");
		RoomManager house = new RoomManager();
		house.init();
		player.setRoom(house.getStartingRoom()); //getStartingRoom undefined for type RoomManager
		do {
			System.out.println(player.getRoom().getShortDescription());
			//Pass in RoomManager's list of rooms as the second argument to parse
			parse(collectInput(), house, player);
		} while (true);
		
	}
	/*public static void printRoom(Player player) {
		System.out.println(player.getRoom().getShortDescription());

	}
	*/

	private static String[] collectInput() {
		System.out.println("What would you like to do?");
		String input = scanner.nextLine();
		return input.split(" ");
		
		//user says: go left 
		//then {"go", "left"}
		//if the user says no
		//{"no"}
	}
		
	private static boolean parse(String[] command,  RoomManager rooms, Player player) {
		//System.out.println(house);
		//Make sure your command array is long enough
		if (command.length != 2) {
			System.out.println("invalid input" + "/n"
						+ "[command] [target]");
	    } else if(command[0].equalsIgnoreCase("go")) {
			player.move(command[1], rooms);	
		} else if(command[0].equalsIgnoreCase("examine")) {
			System.out.println(player.currentRoom.getLongDescription());
		} else if(command[0].equalsIgnoreCase("quit")) {
			//quit game
			//Goodbye message
			System.out.println("Goodbye, Gamer.");
			System.exit(0);
			return false;
	}
		return true;
}
}