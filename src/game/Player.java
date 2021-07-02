package game;

import fixtures.Room;

public class Player {
	fixtures.Room currentRoom;
	int i, j;
	
	public void setRoom(Room room) {
		currentRoom = room;
	}
	public void move(String direction, Room[][] rooms) {
		
		
		//convert case sensitivity with scanner invocation
		if(direction.toLowerCase() == "north") {
			j -= 1;
		}
		else if(direction.toLowerCase() == "south") {
			j += 1;
		}
		else if(direction.toLowerCase() == "west") {
			i -= 1;
		}
		else if(direction.toLowerCase() == "east") {
			i += 1;
		}
		currentRoom = rooms[i][j]; 
}
	public Room getRoom() {
		return currentRoom;
	}
}