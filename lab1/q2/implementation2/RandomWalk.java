import java.lang.reflect.InvocationTargetException;

class RandomWalk extends Game {
    int x, y;

    String R() {
        x += 1;
        if (x > 18) return "Lost";
        return "Game Over";
    }
    String L() {
        if (x > 0) x -= 1;
        return "Game Over";
    }
    String U() {
        y += 1;
        if (y > 18) return "Lost";
        return "Game Over";
    }
    String D() {
        y -= 1;
        if (y == 0) return "Won";
        return "Game Over";
    }
    RandomWalk(String[] key_strokes) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        super(key_strokes);

        x = 10;
        y = 10;

        for (String key_stroke : key_strokes) {
            gamestate = (String) Class.forName(this.getClass().getName()).getDeclaredMethod(key_stroke).invoke(this);
            if (gamestate.equals("Lost") || gamestate.equals("Won")) break;
        }

    }
}
