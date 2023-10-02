import java.lang.reflect.InvocationTargetException;

class FlightSimple extends Game {
    int speed, altitude;
    String R() {
        speed += 1;
        return "Game Over";
    }
    String L() {
        if (speed > 0) speed -= 1;
        if (altitude > 0 && speed == 0) return "Lost";
        return "Game Over";
    }
    String U() {
        if (speed > 2) altitude += 1;
        return "Game Over";
    }
    String D() {
        altitude -= 1;
        if (altitude < 0) return "Lost";
        return "Game Over";
    }
    FlightSimple(String[] key_strokes) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        super(key_strokes);

        speed = 0;
        altitude = 0;

        for (String key_stroke : key_strokes) {
            gamestate = (String) Class.forName(this.getClass().getName()).getDeclaredMethod(key_stroke).invoke(this);
            if (gamestate.equals("Lost")) break;
        }

        if (speed == 0 && altitude == 0) gamestate = "Won";
    }
}