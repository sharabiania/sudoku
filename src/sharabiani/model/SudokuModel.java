package sharabiani.model;

/**
 * Created by Ali Sharabiani on 2016-08-01.
 */
public class SudokuModel {

    /**
     * The sudoku board size.
     */
    public static final int BOARD_SIZE = 9;

    /**
     * The 2d array modeling the sudoku board.
     */
    private int[][] board;

    /**
     * Constructor.
     * Initializes a new instance of {@link SudokuModel}
     */
    public SudokuModel(){
        board = new int[BOARD_SIZE][BOARD_SIZE];
    }

    /**
     * Getter for the board.
     * @return the sudoku board.
     */
    public int[][] getBoard() {
        return board;
    }


}
