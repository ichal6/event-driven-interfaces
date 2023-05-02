public class InventoryManagementService implements OrderPlacedEventHandler{
    @Override
    public void onOrderPlaced(OrderPlacedEvent event) {
        System.out.println("Processing order " + event.orderId() + " for customer " + event.customerId());
    }
}
