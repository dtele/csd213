import java.util.ArrayList;
import java.util.Arrays;

class GameConsole {
    String gameName;
    int numKeys;
    ArrayList<String> keys = new ArrayList<>();

    GameConsole(String arg) {
        String[] args = arg.split("[ \n]");

        gameName = args[0];
        numKeys = Integer.parseInt(args[1]);
        keys.addAll(Arrays.asList(args).subList(2, args.length));
    }
}