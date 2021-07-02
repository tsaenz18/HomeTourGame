package fixtures;

public class Room extends Fixture {
	
	public Room[] exits;
	
			
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[2]; // size is your choice
	}
	public Room[] getExits() {
		return exits;
		
	}
	public void setExits(Room exit1, Room exit2) {
		exits[0] = exit1;
		exits[1] = exit2;
	}
		
	/*public Room getExit(String direction) {
		
		
		//if room in this.room.exits
		//player.move(direction)
		//
	}
*/
}
