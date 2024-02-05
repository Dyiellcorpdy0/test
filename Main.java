import java.util.Scanner;
import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Main {
    public static void main(String[] args) {
        int a = 6;
        int p = 23 ;
        double Zij,Zji;
        double A,B;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Секретное число первого пользователя");
        int Xi= scanner.nextInt();
        System.out.println("Секретное число второго пользователя");
        if(Xi<0){
            System.out.println("Ошибка, секретное число должно быть больше 0");
            return;
        }
        int Xj= scanner.nextInt();
        if(Xj<0) {
            System.out.println("Ошибка, секретное число должно быть больше 0");
            return;
        }
        A = pow( a, Xi ) % p;
        System.out.println("Публичное число первого пользователя " + A);
        B = pow( a, Xj ) % p;
        System.out.println("Публичное число второго пользователя " + B);
        Zij = pow(B, Xi) % p;
        System.out.println("Общий секретный ключ первого пользователя " + Zij);
        Zji = pow(A, Xj) % p;
        System.out.println("Общий секретный ключ второго пользователя " + Zji);
    }
}
