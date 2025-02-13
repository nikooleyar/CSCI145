interface MessageService {
	public void sendMessage(String message); //anything that implements "sendMessage" interface must have a sendMessage method
}											// then use implements keyword next to class

class EmailService implements MessageService{
	String domain;
	int port;

	public EmailService(String domain, int port) {
		this.domain = domain;
		this.port = port;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Connecting to server: " + domain);
		System.out.println("Email sent with message: " + message);
		//sending email logic
	}

}

class SMSService implements MessageService{
	private String phone;

	public SMSService(String phone) {
		this.phone = phone;
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending to: " + phone);
		System.out.println("Text sent with message: " + message);
		//sending text logic here
	}
}

public class Notification {
	private MessageService messageService;

	public Notification(MessageService messageService) {
		this.messageService = messageService;
	}

	public void notifyUser(String message) {
		messageService.sendMessage(message);
	}
}
