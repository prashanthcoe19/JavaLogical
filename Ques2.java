import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner s = new Scanner(System.in);
        String[] password = new String[3];
        int[] userID = new int[password.length];

        for (int i = 0; i < userID.length; i++) {
            System.out.println("Enter UserID");
            userID[i] = s.nextInt();
            s.nextLine();
            System.out.println("Enter password");
            password[i] = s.nextLine();
        }
        System.out.println("Input UserID ");
        int userid = s.nextInt();
        s.nextLine();
        System.out.println("Input Password ");
        String pass = s.nextLine();

        for (int i = 0; i < userID.length; i++) {
            if (userID[i] == userid) {
                while (true) {
                    if (password[i].equals(pass)) {
                        System.out.println("confirm");
                        break;
                    } else {
                        System.out.println("Input Password ");
                        pass = s.nextLine();
                    }
                }
            }
        }

        s.close();
    }
}
