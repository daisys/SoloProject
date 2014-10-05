import java.io.*;

/**
 * Created by daisyshih on 10/1/14.
 */
public class Board {
    private PrintStream printStream = new PrintStream(System.out);
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public Board(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void printBoard() {

        printStream.println("   |   |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");
    }

    public void interpretPlayerInput(BufferedReader bufferedReader) throws IOException {
        String input = bufferedReader.readLine();
        int result = Integer.parseInt(input);
        printStream.println(result);


    }


}
