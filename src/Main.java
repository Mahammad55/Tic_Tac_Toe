public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Method.printBoard(gameBoard);

        System.out.print("Enter your position (1 -9)->");
        int playerPos=Method.getNum();
        System.out.println("Player choose: "+playerPos);
        Method.placePiece(gameBoard,playerPos,"player");

        int cpuPos=Method.rd.nextInt(1,9);
        System.out.println("Computer choose: "+cpuPos);
        Method.placePiece(gameBoard,cpuPos,"cpu");

        Method.printBoard(gameBoard);
    }
}