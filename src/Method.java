import java.util.Scanner;

public class Method {
    static Scanner sc = new Scanner(System.in);

    public static void printBoard(char[][] gameBoard) {
        for (char[] board : gameBoard) {
            for (char c : board) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int getNum() {
        boolean isHave = false;
        int num = Integer.MIN_VALUE;

        while (!isHave) {
            try {
                num = Integer.parseInt(sc.nextLine());
                isHave = true;
            } catch (Exception ex) {
                System.out.print("Enter correct input: ");
            }
        }
        return num;
    }

    public static void placePiece(char[][] gameBoard, int position, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }
        switch (position) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
            default -> System.out.println("Enter correct position");
        }
    }
}
