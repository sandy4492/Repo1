package mouseHover;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class NewDemo {
	@Test
	public void test() throws EmailException {

		System.out.println("Email process started");
		sendEmail();

		System.out.println("Email sent");

	}

	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("sandeepgameboy@gmail.com", "Sandy_007#"));
		email.setSSLOnConnect(true);
		email.setFrom("sandeepgame@gmail.com");
		email.setSubject("Tes Report");
		email.setMsg("This is a test mail from selenium");
		email.addTo("sandy1purnea@gmail.com");
		email.send();
	}

}
