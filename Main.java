import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PatientDAO dao = new PatientDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("  HOSPITAL PATIENT RECORD SYSTEM");
        System.out.println("====================================");

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Update Medical History");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int ch = Integer.parseInt(sc.nextLine());

            switch (ch) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();
                    System.out.print("Medical History: ");
                    String history = sc.nextLine();
                    dao.addPatient(name, age, gender, contact, history);
                    break;

                case 2:
                    dao.viewPatients();
                    break;

                case 3:
                    System.out.print("Patient ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.print("New Medical History: ");
                    String newHistory = sc.nextLine();
                    dao.updateMedicalHistory(id, newHistory);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid Choice");
            }
        }
    }
}
