import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // GameConsole gameConsole = new GameConsole("FlightSimple 20\nR R U R U R R U D D L D L L L L L L L L");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input\n>>");
        GameConsole gameConsole = new GameConsole(scanner.nextLine());


        if (gameConsole.gameName.equals("FlightSimple")) {
            FlightSimple gameInstance = new FlightSimple(gameConsole.gameName, gameConsole.numKeys, gameConsole.keys);
            gameInstance.start();
        } else if (gameConsole.gameName.equals("RandomWalk")) {
            RandomWalk gameInstance = new RandomWalk(gameConsole.gameName, gameConsole.numKeys, gameConsole.keys);
            gameInstance.start();
        }
    }
}
