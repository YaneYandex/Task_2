import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите строку a: ");
            String a = reader.readLine();
            System.out.print("Введите строку b: ");
            String b = reader.readLine();
            if (a.equals(b)) {
                System.out.println("Строки идентичны");
            } else System.out.println("Строки неидентичны");
        }
    }
}