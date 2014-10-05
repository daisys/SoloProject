import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class BoardTest {


    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private String[] playerChoices = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    private Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);

        board = new Board(printStream, bufferedReader, playerChoices);
    }

    @Test
    public void shouldDrawEmptyBoard() {
        board.printBoard(new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " "});

        verify(printStream).println("   |   |   \n" +
                "------------\n" +
                "   |   |   \n" +
                "------------\n" +
                "   |   |   \n");


    }

    @Test
    public void shouldMarkedLocation1OnBoardWhenPlayerChoose1() {
        board.printBoard(new String[]{"X", " ", " ", " ", " ", " ", " ", " ", " "});

        verify(printStream).println(" X |   |   \n" +
                "------------\n" +
                "   |   |   \n" +
                "------------\n" +
                "   |   |   \n");


    }

    @Test
    public void shouldGiveLocation1XWhenPlayerEnter1() throws IOException {

        when(bufferedReader.readLine()).thenReturn("1");

        board.injectPlayerChoice(bufferedReader);

        assertThat(playerChoices, is(new String[]{"X", " ", " ", " ", " ", " ", " ", " ", " "}));

    }

    @Test
    public void shouldDrawBoardLocation2XWhenPlayerEnter2() throws IOException {

        when(bufferedReader.readLine()).thenReturn("2");

        board.injectPlayerChoice(bufferedReader);

        assertThat(playerChoices, is(new String[]{" ", "X", " ", " ", " ", " ", " ", " ", " "}));


    }

    @Test
    public void shouldDrawBoardLocation1OWhenPlayer2Enter1() {


    }

}