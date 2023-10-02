import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

class Console {
    Console() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        String[] command_tokens = command.replace("\n", " ").split(" ");
        String[] key_strokes = new String[Integer.parseInt(command_tokens[1])];

        System.arraycopy(command_tokens, 2, key_strokes, 0, command_tokens.length - 2);
        Class<?> cls = Class.forName(command_tokens[0]);
        Game game = (Game) cls.getDeclaredConstructor(String[].class).newInstance(new Object[] {key_strokes});
        game.show_result();
    }
}