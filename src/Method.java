public class Method {
    public static void printBoard(char [][] gameBoard){
        for(char [] board: gameBoard){
            for(char c:board){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
