import java.util.ArrayList;

class FlightSimple extends Game {
    int speed = 0;
    int height = 0;

    FlightSimple(String gameName, int numKeys, ArrayList<String> keys) {
        super(gameName, numKeys, keys);
    }

    @Override
    public String upKey() {
        if (height == 0 && speed > 2) height++;
        else if (height > 0) height++;
        return evaluateKeystate();
    }

    @Override
    public String downKey() {
        height--;
        return evaluateKeystate();
    }

    @Override
    public String leftKey() {
        if (speed > 0) speed--;
        return evaluateKeystate();
    }

    @Override
    public String rightKey() {
        speed++;
        return evaluateKeystate();
    }

    public String evaluateKeystate() {
        // DEBUGGING: System.out.println("key: " + currKey + "\nspeed: " + speed + "\nheight: " + height + "\n");
        if (height < 0) return "Lost";
        if (height > 0 && speed == 0) return "Lost";
        if (height == 0 && speed == 0) return "Won";
        return "None";
    }
}