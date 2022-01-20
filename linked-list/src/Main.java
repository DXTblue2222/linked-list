import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete a student");
            System.out.println("3. Find a student");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ql.addStudent();

                    break;
                case 2:
                    ql.deleteStudent();

                    break;
                case 3:
                    ql.findStudent();
                    break;
                case 4:
                    System.out.println("Exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
}