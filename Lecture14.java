public class Lecture14 {
    public static void main(String[] args) {
        //polymorphism continued

        EmailService emailService = new EmailService("email.com", 25);
        Notification notification = new Notification(emailService);

        //Notification notification = new Notification("email.com", 25, "360-123-4567"); old code without implementation and polymorphism
        //notification.notifyUser("Your order has been shipped!");

    }
}
