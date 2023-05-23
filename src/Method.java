import java.util.Scanner;

public class Method {
    static Scanner sc=new Scanner(System.in);
    public static void printBoard(char [][] gameBoard){
        for(char [] board: gameBoard){
            for(char c:board){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static int getNum(){
        boolean isHave=false;
        int num=Integer.MIN_VALUE;

        while (!isHave){
            try {
                num=Integer.parseInt(sc.nextLine());
                isHave=true;
            }catch (Exception ex){
                System.out.print("Enter correct input: ");
            }
        }
        return num;
    }
}
