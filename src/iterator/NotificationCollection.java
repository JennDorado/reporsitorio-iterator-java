package iterator;

public class NotificationCollection implements Collection {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationList;

    public NotificationCollection() {
        notificationList = new Notification[MAX_ITEMS];

        addItem("Notificacton 1 ");
        addItem("Notificacton 2 ");
        addItem("Notificacton 3 ");
        addItem("Notificacton 4 ");
        addItem("Notificacton 5 ");
    }

    public void addItem(String str) {
        Notification notification = new Notification(str);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Full");

        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }

}
