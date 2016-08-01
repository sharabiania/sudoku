package sharabiani;
import javax.swing.*;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class MainView extends JFrame {

    /**
     * Size of the main window.
     */
    private static final int WindowSize = 400;

    /**
     * Constructor.
     * Creates a new instance of {@link MainView}.
     */
    public MainView()
    {
        setTitle("SUDOKU");
        setSize(WindowSize, WindowSize);
        setLocationRelativeTo(null);
    }

    /**
     * Shows the windows.
     */
    public void showWindow()
    {
        setVisible(true);
    }

    /**
     * Closes the window.
     */
    public void closeWindow() {
        setVisible(false);
    }
}
