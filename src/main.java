import sharabiani.model.SudokuModel;
import sharabiani.model.SudokuPuzzle;
import sharabiani.view.MainView;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class main {

    /**
     * Entry point of the application.
     * @param args command line arguments.
     */
    public static void main(String args[]){


        MainView frame = new MainView();
        SudokuPuzzle test = new SudokuPuzzle(1);
        frame.showWindow(test.getPuzzle(), SudokuModel.BOARD_SIZE);
    }
}
