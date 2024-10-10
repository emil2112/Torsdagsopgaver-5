import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Room> rooms = new ArrayList<>();
        Room room1 = new Room(2, 4);
        Room room2 = new Room(3, 2);
        Room room3 = new Room(1, 2);
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building b1 = new Building(rooms, 3);


    }
}
