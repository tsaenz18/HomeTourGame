package game;

import fixtures.Room;

public class RoomManager {
	public static Room[][] rooms = new Room[2][2]; //{{"Kitchen", "Dungeon"}, {"Foyer", "Lava Room"}};
	Room startingRoom;
	
	
	public void init() {
		//Initializes rooms of the house
		Room kitchen = new Room("Kitchen", 
				"an eerie looking kitchen" + "\n"
				+ "[South Exit] > Dungeon"+ "\n"
				+"[East Exit] > Foyer",
				"The kitchen is dirty. It smells faintly of mold, and the air is damp.");
				this.rooms[0][0] = kitchen;
				 //pseudo
			//this.startingRoom = kitchen;
		Room foyer = new Room("Foyer",
					"a large foyer" + "\n"
					+ "[West] > kitchen"+ "\n"
					+ "[South] > Lava Room",
					"There is too much space here. It feels uncomfrotable, like someone is watching.");
				this.rooms[1][0] = foyer;
				//foyer.exits = {kitchen, lavaRoom}; //pseudo
		Room dungeon = new Room("Dungeon",
					"...a dungeon?.."+ "\n"
					+ "[North] > Kitchen"+ "\n"
					+ "[East] > Lava Room",
					"An unnatural room. The air in this room is heavy, making it hard to breathe.");
				this.rooms[0][1] = dungeon;
				//dungeon.exits = {kithen, lavaRoom}; //pseudo
		Room lavaRoom = new Room("Lava Room",
					"Lava!" + "\n"
					+ "[North] > Foyer"+ "\n"
					+ "[West] > Dungeon",
					"There's lava in this room! Not sure what to make of this, but you should get out of here!");
				this.rooms[1][1] = lavaRoom;
				//lavaRoom.exits = {dungeon, foyer}; //pseudo
		startingRoom = kitchen;
		kitchen.setExits(foyer,dungeon);
		foyer.setExits(kitchen, lavaRoom);
		dungeon.setExits(kitchen, lavaRoom);
		lavaRoom.setExits(dungeon,  foyer);
	}
	public Room getStartingRoom() {
		//System.out.println(startingRoom);
		return startingRoom;
	}
}
