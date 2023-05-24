public class Main {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '+', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        Method.printBoard(gameBoard);

        while (true) {
            System.out.print("Enter your placement (1 - 9) ->");
            int playerPos = Method.getNum();

            while (playerPos > 9 || Method.playerPosition.contains(playerPos) || Method.cpuPosition.contains(playerPos)) {
                System.out.print("Position taken ! Enter correct position: ");
                playerPos = Method.getNum();
            }

            System.out.println("---------------");
            System.out.println("Player choose: " + playerPos);

            Method.placePiece(gameBoard, playerPos, "player");

            if (Method.playerPosition.size() + Method.cpuPosition.size() != 9) {
                int cpuPos = Method.rd.nextInt(1, 9);
                while (Method.cpuPosition.contains(cpuPos) || Method.playerPosition.contains(cpuPos)) {
                    cpuPos = Method.rd.nextInt(1, 9);
                }
                System.out.println("Computer choose: " + cpuPos);
                System.out.println("---------------");
                Method.placePiece(gameBoard, cpuPos, "cpu");
            } else {
                System.out.println("---------------");
            }

            Method.printBoard(gameBoard);

            String result = Method.checkWinner();
            if (!result.equals("")) {
                System.out.println(result);
                System.exit(0);
            } else {
                System.out.println(result);
            }
        }
    }
}