public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Method.printBoard(gameBoard);

        int position=Method.getNum();
        System.out.println(position);
    }
}