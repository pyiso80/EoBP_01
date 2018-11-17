import stanford.karel.Karel;

public class HelloKarel extends Karel {
    public void run(){
        move();
        move();
        pickBeeper();
        turnLeft();
        move();
        move();

        turnLeft();
        turnLeft();
        turnLeft();

        move();
        putBeeper();

        //add or remove commands as required
    }
}
