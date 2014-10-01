import java.io.*;

/**
 * Created by daisyshih on 10/1/14.
 */
public class Board {
    private PrintStream printStream = new PrintStream(System.out);

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void setup() {

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
