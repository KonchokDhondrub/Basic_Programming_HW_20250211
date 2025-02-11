import java.util.Scanner;

public class Sender implements MailDeliveryService{

    public String getOperationName(){
        return "";
    }
    public String send(){
        return "";
    }

    public MailDeliveryService menu(MailDeliveryService[] senders, Scanner scanner){
        System.out.println("Варианты доставки:" );
        for (int i = 0; i< senders.length;i++){
            System.out.printf("%d. %s \n", i+1, senders[i].getOperationName());
        }
        System.out.print("Выберите способ доставки: ");
        int select = 0;
        do {
            select = scanner.nextInt() - 1;
        } while (select < 0 || select >= senders.length);
        return senders[select];
    }
}
