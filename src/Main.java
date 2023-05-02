public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Event-Driven Application!");

        EventDispatcher eventDispatcher = new EventDispatcher();

        eventDispatcher.registerEventHandler(OrderPlacedEvent.class, new InventoryManagementService());
        eventDispatcher.registerEventHandler(OrderPlacedEvent.class, new EmailNotificationService());

        OrderPlacedEvent orderPlacedEvent = new OrderPlacedEvent("12345", "customer123");
        eventDispatcher.dispatchEvent(orderPlacedEvent);
    }
}