import java.util.InputMismatchException;
import java.util.Scanner;

public class input {

    public static int inputNum(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Введите число или  -1 для выхода");
            try {
                int N = scan.nextInt();
                if (N < -1) {
                    System.out.println("Число введено неверно!");
                }
                else
                    return N;
            }catch (InputMismatchException ex){
                System.out.println("Wrong num");
                scan.next();
            }
        }
    }
}
