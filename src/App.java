import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int a=0,b=1;

        System.out.print("Sınır değeri : ");
        int n = inp.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(a);
            a = a+b;
            b = a-b;
        }
    }
}