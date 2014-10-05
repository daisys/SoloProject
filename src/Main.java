import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by daisyshih on 10/1/14.
 */
public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] playerChoices = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

        Board board = new Board(printStream, bufferedReader,playerChoices );
        board.printBoard(playerChoices);

        try {
            board.injectPlayerChoice(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
