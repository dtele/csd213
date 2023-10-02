import java.util.ArrayList;

class RandomWalk extends Game {
    int xPos = 10;
    int yPos = 10;

    RandomWalk(String gameName, int numKeys, ArrayList<String> keys) {
        super(gameName, numKeys, keys);
    }

    @Override
    public String upKey() {
        yPos++;
        return evaluateKeystate();
    }

    @Override
    public String downKey() {
        yPos--;
        return evaluateKeystate();
    }

    @Override
    public String leftKey() {
        if (xPos > 0) xPos--;
        return evaluateKeystate();
    }

    @Override
    public String rightKey() {
        xPos++;
        return evaluateKeystate();
    }

    public String evaluateKeystate() {
        // DEBUGGING: System.out.println("key: " + currKey + "\nx position: " + xPos + "\ny position: " + yPos + "\n");
        if (xPos >= 19 || yPos >= 19) return "Lost";
        if (yPos == 0) return "Won";
        return "None";
    }
}