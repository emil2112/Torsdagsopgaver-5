import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;

    public Building(ArrayList<Room> rooms, int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
        this.rooms = rooms;
    }


    public String toString(){
        return numberOfFloors + " " + rooms;
    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors;
    }

    public int countLampsInBuilding(){
        
    }
}
