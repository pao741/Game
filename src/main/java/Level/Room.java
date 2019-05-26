package Level;

public abstract class Room {

    private static boolean isCleared = false;
    public void setRoomClear(){
        isCleared = true;
    }
    public abstract String getName();
}
