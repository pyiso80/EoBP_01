import stanford.karel.Karel;

public class HelloKarel extends Karel {

    void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void run(){
        move();
        move();
        pickBeeper();
        turnLeft();
        move();
        move();

        turnRight();

        move();
        putBeeper();

        //add or remove commands as required
    }


}
