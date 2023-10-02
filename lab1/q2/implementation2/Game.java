class Game {
    String gamestate;
    String[] key_strokes;

    Game(String[] key_strokes) {
        this.key_strokes = key_strokes;
    }

    String R() {
        return null;
    }
    String L() {
        return null;
    }
    String U() {
        return null;
    }
    String D() {
        return null;
    }
    void show_result() {
        System.out.println(gamestate);
    }
}