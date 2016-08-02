import sharabiani.model.SudokuModel;
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
        SudokuModel model = new SudokuModel();
        model.generatePuzzle();
        MainView frame = new MainView();

        frame.showWindow(model.getBoard(), SudokuModel.BOARD_SIZE);
    }
}
