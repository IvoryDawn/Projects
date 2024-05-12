import java.util.*;

public class TicTacToe {

    // Initialize the board
    public void initialize(char board[][]) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the board
    public void PrintBoard(char board[][]) {
        int n = board.length;
        System.out.println("-------------");
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check validity of the move
    public static boolean IsValid(int row, int col, int n, char board[][]) {
        return (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == '-');
    }

    // Make a move
    public void MakeMove(int row, int col, char board[][], char currPlayer) {
        board[row][col] = currPlayer;

    }

    // Check if the board is full
    public boolean IsBoardFull(char board[][]) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check row wise
    public boolean CheckRow(char board[][]) {
        int n = board.length;
        int flag = 0;

        int r = 0;
        for (int c = 0; c < n - 1; c++) {
            int d = c + 1;
            char curr = board[r][c];
            char next = board[r][d];
            if (curr == next && curr != '-' && next != '-') {
                flag++;
            }
        }
        if (flag == (n - 1)) {
            return true;
        }
        return false;
    }

    // Check column wise
    public boolean CheckCol(char board[][]) {
        int n = board.length;
        int flag = 0;

        int c = 0;
        for (int r = 0; r < n - 1; r++) {
            int d = c + 1;
            char curr = board[r][c];
            char next = board[d][c];
            if (curr == next && curr != '-' && next != '-') {
                flag++;
            }
        }
        if (flag == (n - 1)) {
            return true;
        }
        return false;
    }

    // Check Right Diagonal
    public boolean CheckRightDiagonal(char board[][]) {
        int n = board.length;
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            char curr = board[i][i];
            char next = board[j][j];

            if (curr == next && curr != '-' && next != '-') {
                flag++;
            }
        }

        if (flag == (n - 1)) {
            return true;
        }
        return false;
    }

    // Check left Diagonal
    public boolean CheckLeftDiagonal(char board[][]) {
        int n = board.length;
        int flag = 0;
        int r = 0;
        int c = n - 1;
        while (r < (n - 1) && c > 0) {
            char curr = board[r][c];
            char next = board[r++][c--];

            if (curr == next && curr != '-' && next != '-') {
                flag++;
            }
        }

        if (flag == (n - 1)) {
            return true;
        }
        return false;
    }

    // Check if the game is over
    public boolean IsGameOver(char board[][]) {
        return (CheckRow(board) || CheckCol(board) || CheckRightDiagonal(board) || CheckLeftDiagonal(board)
                || IsBoardFull(board));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the board : ");
        int n = sc.nextInt(); // User-input of the size of the board
        char board[][] = new char[n][n]; // Creation of a board of size n
        char currPlayer = 'X';

        TicTacToe game = new TicTacToe();
        game.initialize(board); // Intitializes the board for the players

        // Loop continues till the game is over
        while (!(game.IsGameOver(board))) {
            game.PrintBoard(board); // Prints the board
            System.out.println("Player " + currPlayer + "'s turn. ");
            System.out.println("Enter the row (0, 1, 2) : ");
            int row = sc.nextInt();
            System.out.println("Enter the column (0, 1, 2) : ");
            int col = sc.nextInt();

            // Check if the row and column is valid or not
            if (IsValid(row, col, n, board)) {
                // Make move when the space is valid
                game.MakeMove(row, col, board, currPlayer);
            } else {
                System.out.println("Inavlid move, Try again !");
            }
            // Switch Players
            if (currPlayer == 'X') {
                currPlayer = 'O';
            } else {
                currPlayer = 'X';
            }
        }
        game.PrintBoard(board);

        if (game.IsBoardFull(board)) {
            System.out.println("It is a draw.");
        } else {
            System.out.println("Player " + currPlayer + " is the winner .");
        }
    }
}