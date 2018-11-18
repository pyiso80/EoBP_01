import stanford.karel.Karel;

public class CliffsAndBeepers extends Karel {
    public void run() {
        putBeeperOnCliff();
        putBeeperOnCliff();
    }

    void putBeeperOnCliff(){
        goToBase();
        pickBeeper();
        turnLeft();
        goUp();
        turnRight();
        move();
        putBeeper();
    }

    void goToBase(){
        move();
        move();
    }

    void goUp(){
        move();
        move();
    }

    void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}