import org.junit.Test;

import java.io.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BoardTest {
    private PrintStream printStream = mock(PrintStream.class);
    private Board board = new Board(printStream);
    private BufferedReader bufferReader;


    @Test
    public void testSetup() {
        board.setup();

        verify(printStream).println("   |   |\n" +
                "------------\n" +
                "   |   |\n" +
                "------------\n" +
                "   |   |\n");


    }

    @Test
    public void testInterpretPlayerInput() throws IOException {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Board board = new Board(printStream);
        when(bufferedReader.readLine()).thenReturn("1");
        board.interpretPlayerInput(bufferedReader);
        verify(printStream).println(1);


    }

    //        verify(printStream).println(" x |   |\n" +
//                "------------\n" +
//                "   |   |\n" +
//                "------------\n" +
//                "   |   |\n");

}