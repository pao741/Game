package Level;

public abstract class Room {

    private static boolean isCleared = false;

    public void setRoomClear(){
        isCleared = true;
    }
    public abstract String getName();

    public abstract void getRoomInfo();

    public void roomState(){
        if (isCleared){
            System.out.print("< Cleared >");
        }else{
            System.out.print("< Not cleared >");
        }
    }
}
