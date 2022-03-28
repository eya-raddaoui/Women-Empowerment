package tn.esprit.eya.pidev.configuration;

public interface EmailService {
	
	public void sendSimpleMessage(
		      String to, String subject, String text);

}
