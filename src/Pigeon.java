public class Pigeon extends Sender implements MailDeliveryService{
    @Override
    public String getOperationName() {
        return "Голубь";
    }
    @Override
    public String send() {
        return "Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Используй факс!.";
    }
}
