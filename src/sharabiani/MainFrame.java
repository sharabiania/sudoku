package sharabiani;
import javax.swing.*;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class MainFrame extends JFrame {

    /**
     * Constructor.
     * Creates a new instance of {@link MainFrame}.
     */
    public MainFrame()
    {
        setTitle("SUDOKU");
        setSize(400, 400);
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
