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

    public void printBoard(int playerChoice) {

        if(playerChoice == 1){
            printStream.println(" X |   |\n" +
                    "------------\n" +
                    "   |   |\n" +
                    "------------\n" +
                    "   |   |\n");

        }

        if(playerChoice == 2){
            printStream.println("   | X |\n" +
                    "------------\n" +
                    "   |   |\n" +
                    "------------\n" +
                    "   |   |\n");

        }else{
            printStream.println("   |   |\n" +
                    "------------\n" +
                    "   |   |\n" +
                    "------------\n" +
                    "   |   |\n");
        }

    }

    public void drawPlayerInput(BufferedReader bufferedReader) throws IOException {

        printStream.println("Enter number between 1-9:");
        this.bufferedReader = bufferedReader;
        String input = bufferedReader.readLine();
        int playerChoice = Integer.parseInt(input);
        printBoard(playerChoice);


    }


}
