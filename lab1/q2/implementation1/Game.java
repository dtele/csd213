import java.util.ArrayList;

class Game {
    boolean started = false;
    int numKeys;
    String gameName;
    String gameOutcome;
    String currKey;
    ArrayList<String> keys;

    Game(String gameName, int numKeys, ArrayList<String> keys) {
        this.gameName = gameName;
        this.numKeys = numKeys;
        this.keys = keys;
        this.currKey = keys.get(0);
    }

    public void start() {
        this.started = true;

        for (int i = 0; i < numKeys; i++) {
            currKey = keys.get(i);
            gameOutcome = processKey(keys.get(i));
            // If player loses or wins but keys are still left, skip them.
            if (gameOutcome.equals("Lost")) break;
        }
        if (gameOutcome.equals("None")) gameOutcome = "Game Over";
        System.out.print(gameOutcome);
    }

    public String processKey(String key) {
        switch (key) {
            case "U" -> {
                return upKey();
            }
            case "D" -> {
                return downKey();
            }
            case "L" -> {
                return leftKey();
            }
            case "R" -> {
                return rightKey();
            }
            default -> {
                return "None";
            }
        }
    }

    public String upKey() {
        return null;
    }

    public String downKey() {
        return null;
    }

    public String leftKey() {
        return null;
    }

    public String rightKey() {
        return null;
    }
}