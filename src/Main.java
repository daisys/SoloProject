import java.io.PrintStream;

/**
 * Created by daisyshih on 10/1/14.
 */
public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        Board board = new Board(printStream);
        board.setup();

    }
}
