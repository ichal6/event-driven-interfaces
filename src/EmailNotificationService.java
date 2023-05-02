public class EmailNotificationService implements OrderPlacedEventHandler{
    @Override
    public void onOrderPlaced(OrderPlacedEvent event) {
        System.out.println("Sending order confirmation email to customer " + event.customerId());
    }
}
