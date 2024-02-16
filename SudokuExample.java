import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SudokuExample {

    private static final int SIZE = 9;
    private static final int SUBGRID_SIZE = 3;

    private int[][] board;

    public SudokuExample() {
        this.board = generateSudokuBoard();
    }

    private int[][] generateSudokuBoard() {
        int[][] newBoard = new int[SIZE][SIZE];

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(numbers);

        // Fill the main diagonal of the grid
        for (int i = 0; i < SIZE; i += SUBGRID_SIZE) {
            fillSubgrid(newBoard, i, i, numbers);
        }

        // Shuffle numbers for the entire grid
        Collections.shuffle(numbers);

        // Fill the rest of the grid
        fillRemaining(newBoard);

        return newBoard;
    }

    private void fillSubgrid(int[][] board, int row, int col, List<Integer> numbers) {
        int index = 0;
        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                board[row + i][col + j] = numbers.get(index++);
            }
        }
    }

    private void fillRemaining(int[][] board) {
        solveSudoku(board);
    }

    private boolean solveSudoku(int[][] board) {
        // Implementation of a Sudoku solver (not shown for simplicity)
        // This part would involve backtracking and recursion to fill in the numbers.

        // For the purpose of this example, we'll leave it as a placeholder.
        return false;
    }

    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SudokuExample sudokuGame = new SudokuExample();
        sudokuGame.displayBoard();
    }
}

