import java.util.Scanner;

class customer_details {
    String name;
    String dob;
    int age;
    int room_no;

    void cust_details() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name:");
        name = sc.nextLine();
        System.out.print("Enter Customer DOB:");
        dob = sc.nextLine();
        System.out.print("Enter Customer Age:");
        age = sc.nextInt();
        System.out.print("Enter Customer Room_Id:");
        room_no = sc.nextInt();
        System.out.println();
    }

    public static void main(String args[]) {
        int i;

        System.out.println("---Employee Details---");
        System.out.println();
        customer_details a = new customer_details();
        a.cust_details();

    }
}