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
        board.printBoard();

        verify(printStream).println("   |   |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");


    }

    @Test
    public void shouldFooWhenBoo() throws IOException {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = new Board(printStream, bufferedReader);
        when(bufferedReader.readLine()).thenReturn("1");
        board.interpretPlayerInput(bufferedReader);
        verify(printStream).println(1);


    }

}