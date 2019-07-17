package Level;

public abstract class Room {

    public abstract String getName();

    public abstract void getRoomInfo();

    public abstract boolean getRoomState();

    public void roomState(){
        if (getRoomState()){
            System.out.print("< Cleared >");
        }else{
            System.out.print("< Not cleared >");
        }
    }

    public abstract void checkIfCleared();

    public abstract void setIsCleared();
}
