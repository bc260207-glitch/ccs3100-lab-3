import java.util.Scanner;

public class lab3program2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// item1
        System.out.print("Item 1: ");
        String item1 = input.next();
        System.out.print("Quantity: ");
        int q1 = input.nextInt();
        System.out.print("Unit Price");
        double p1 = input.nextDouble();

        // item2
        System.out.print("Item 2: ");
        String item2 = input.next();
        System.out.print("Quantity: ");
        int q2 = input.nextInt();
        System.out.print("Unit Price");
        double p2 = input.nextDouble();

        // calculate price
        double item1pay = q1 * p1;
        double item2pay = q2 * p2;
        double totalpay = item1pay + item2pay;
        double gtax = totalpay * 0.06;
        double servicecharge = totalpay * 0.1;

        // Receipt
        System.out.print("\nReceipt\n\n");
        System.out.print("Item 1:" + item1 + "\n");
        System.out.print("Quantity:" + q1 + "\n");
        System.out.printf("Unit Price: RM%.2f\n", p1);
        System.out.printf("Amount: RM%.2f\n", item1pay);

        System.out.print("\nItem 2:" + item2 + "\n");
        System.out.print("Quantity:" + q2 + "\n");
        System.out.printf("Unit Price: RM%.2f\n", p2);
        System.out.printf("Amount: RM%.2f\n", item2pay);

        System.out.printf("\nTotal: RM%.2f\n", totalpay);
        System.out.printf("Government Tax: RM%.2f\n", gtax);
        System.out.printf("Service Charge: RM%.2f\n", servicecharge);
	}

}
