public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Method.printBoard(gameBoard);

        System.out.println("Enter your position (1 -9)->");
        int playerPos=Method.getNum();
        Method.placePiece(gameBoard,playerPos,"player");

        Method.printBoard(gameBoard);
    }
}