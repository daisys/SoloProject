import java.io.*;

/**
 * Created by daisyshih on 10/1/14.
 */
public class Board {
    private PrintStream printStream = new PrintStream(System.out);
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String[] playerChoices = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public Board(PrintStream printStream, BufferedReader bufferedReader, String[] playerChoices) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.playerChoices = playerChoices;
    }


    public void printBoard(String[] playerChoice) {


        printStream.println(" " + playerChoice[0] + " | " + playerChoice[1] + " | " + playerChoice[2] + " \n" +
                "------------\n" +
                " " + playerChoice[3] + " | " + playerChoice[4] + " | " + playerChoice[5] + " \n" +
                "------------\n" +
                " " + playerChoice[6] + " | " + playerChoice[7] + " | " + playerChoice[8] + " \n");


    }

    public void injectPlayerChoice(BufferedReader bufferedReader) throws IOException {

        printStream.println("Enter number between 1-9:");
        this.bufferedReader = bufferedReader;
        String input = bufferedReader.readLine();
        int playerChoice = Integer.parseInt(input);
        this.playerChoices[playerChoice-1] = "X";

    }


}
