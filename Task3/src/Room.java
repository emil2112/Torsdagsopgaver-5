public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }
    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
        return numberOfLamps;
    }

    public int setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
        return numberOfWindows;
    }
}
