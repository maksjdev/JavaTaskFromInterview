import jdk.internal.util.xml.impl.Input;

public class Menu {
    public static void showMenu(){
        int N;
        while (true){
            N = input.inputNum();
            if (N == -1)
                break;
            System.out.println(Task.sumofDigits(N));
        }
    }
}
