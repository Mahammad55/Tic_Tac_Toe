import java.util.*;

public class Method {
    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();
    public static final List<Integer> playerPosition=new ArrayList<>();
    public static final List<Integer> cpuPosition=new ArrayList<>();

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

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> bottomRow = Arrays.asList(7, 8, 9);
        List<Integer> leftColm = Arrays.asList(1, 4, 7);
        List<Integer> midColm = Arrays.asList(2, 5, 8);
        List<Integer> rightColm = Arrays.asList(3, 6, 9);
        List<Integer> cross1 = Arrays.asList(7, 5, 3);
        List<Integer> cross2 = Arrays.asList(9, 5, 1);

        List<List<Integer>> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(bottomRow);
        winning.add(leftColm);
        winning.add(midColm);
        winning.add(rightColm);
        winning.add(cross1);
        winning.add(cross2);

        for (List<Integer> list : winning) {
            if (new HashSet<>(playerPosition).containsAll(list)) {
                return "\nCongrats you win ):";
            } else if (new HashSet<>(cpuPosition).containsAll(list)) {
                return "\nSorry ): CPU wins";
            } else if (playerPosition.size() + cpuPosition.size() == 9) {
                return "\nEqual..";
            }
        }
        return "";
    }
}
