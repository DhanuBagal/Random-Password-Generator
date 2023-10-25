import java.util.*;

public class Main {
    static String generate_password(int size) {
            String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-/.,<>?;':\"[]{}\\|`~";

            String password = "";
            Random rnd = new Random();
            while (password.length() < size) {
                int index = (int) (rnd.nextFloat() * chars.length());
                password += chars.charAt(index);
            }
            return password;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of password: ");
            int size = sc.nextInt();
            sc.close();

            String password = generate_password(size);
            System.out.println(password);
        }
}