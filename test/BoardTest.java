import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BoardTest {


    private PrintStream printStream = mock(PrintStream.class);
    private BufferedReader bufferedReader = mock(BufferedReader.class);
    private Board board = new Board(printStream, bufferedReader);


    @Test
    public void testPrintBoard() {
        board.printBoard(0);

        verify(printStream).println("   |   |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");


    }

    @Test
    public void shouldDrawBoardLocation1XWhenPlayerEnter1() throws IOException {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = new Board(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");

        board.drawPlayerInput(bufferedReader);
        verify(printStream).println("Enter number between 1-9:");
        verify(printStream).println(" X |   |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");


    }

    @Test
    public void shouldDrawBoardLocation2XWhenPlayerEnter2() throws IOException {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = new Board(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("2");

        board.drawPlayerInput(bufferedReader);
        verify(printStream).println("Enter number between 1-9:");
        verify(printStream).println("   | X |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");


    }

}