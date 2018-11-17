import stanford.karel.Karel;

public class RightTurns extends Karel {
    public void run(){
        turnRight();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnRight();
        move();
        //add or remove commands as required
    }

    void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
