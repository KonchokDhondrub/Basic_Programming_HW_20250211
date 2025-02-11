public class DHL extends Sender implements MailDeliveryService {

    @Override
    public String getOperationName() {
        return "DHL";
    }
    @Override
    public String send(){
        return "Положи письмо в конверт, приклей марку, положи в почтовый ящик.";
    }
}
