public class Email extends Sender implements MailDeliveryService {
    @Override
    public String getOperationName() {
        return "Email";
    }
    @Override
    public String send() {
        return "Отправить по Интернету";
    }
}
