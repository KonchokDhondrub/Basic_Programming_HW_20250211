import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MailDeliveryService[] senders = {
                new DHL(),
                new Email(),
                new Pigeon()
        };
        Sender sendOperator = new Sender();

        Sender result = (Sender) sendOperator.menu(senders, scanner);
        System.out.printf(result.send());
    }
}