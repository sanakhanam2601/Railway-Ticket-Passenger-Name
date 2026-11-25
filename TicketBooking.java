import java.util.Scanner;

class TicketBooking {
    String passengerName = "Rahul";

    public static void main(String[] args) {
        TicketBooking t = new TicketBooking();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character position:");
        int position = sc.nextInt();

        try {
            System.out.println("Character: " + t.passengerName.charAt(position));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid character position");
        }
    }
}