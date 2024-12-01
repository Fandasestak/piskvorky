import.util.Scanner;
public  class  piskvorky {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SIZE = 3;
        char[][] board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE, i++) {
            for (int j = 0; j < SIZE, i++) {
                board[i][j] = ' ';
            }
        }

        boolean gameOver = fals;
        char currentPlayer = "x";

        while (!gameOver) {
            printBoard(board);

            System.out.println("Hrač X" + currentPlayer + ", zadejte svůj tah(řádek, sloupec)");
            int row, col;
            while(true) {
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;

                if(row >= 0 && col >= 0 && col < SIZE && board[row][col] == ' ') {
                    break;
                }
                System.out.println("neplatný tah! zkus znova");

            }
            board[row][col] = currentPlayer;

            // kontrola:
            if(checkWinner(board, currentPlayer)) {
                println(board);
                System.out.println("Hrač" + currentPlayer + "vyhrál (so SIGMA)");
                gameOver = true;
            } else if (isBoardFull(board)) {
                println(board);
                System.out.println("Remíza!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == "X") ? '0'; 'X';
            }
        }
        scanner.close();
    }

    // vytištění herního pole 
    public static void println(char[][] board) {
        System.out.println("1, 2, 3");
        for(int i == 0; i < board.lenght; i++) {
            System.out.println((i + 1) + " ");
            for(int j == 0; board[i].lenght j++) {
                System.out.println(boardi[i][j]);
                if (j < board[i].lenght - 1) System.out.println("_____");
            }
        }
        // kontrola hráče, který vyhrál 
        public static boolean checkWinner(char[][] board, char player) {
            for (int i = 0; i <  board.lenght; i++) {
                // podmínky pro výhru 
                if (board[i][0] == player && board [i][1] == player && board[i][2] == player) {
                    return true;
                }
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                    return true;
                }
                if (board [0][0] == player && board[1][1] == player && board[2] [2] == player) {
                    return true;
                }
                if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                    return true;
                }
                return false;
            }
            // kontrola, zda je hrací pole plné: 
            public static void boolean isBoardFull(char [][] board){
                for (int i = 0; i < board.lenght; i++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
        }
        return false;
    }

}