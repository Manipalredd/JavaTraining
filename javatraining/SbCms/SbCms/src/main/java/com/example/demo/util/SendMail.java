package com.example.demo.util;

import java.net.PasswordAuthentication;
import java.util.Properties;

public class SendMail {
	public static void mailSend(String toEmail, String subject, String body) {
		// Recipient's email ID needs to be mentioned.
//		String to = "aavesha5@gmail.com";
		// Sender's email ID needs to be mentioned
		String from = "prasanna.trainer@gmail.com";
		// Assuming you are sending email from through gmails smtp
		String host = "smtp.gmail.com";
		// Get system properties
		Properties properties = System.getProperties();
		// Setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		// Get the Session object.// and pass username and password
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication("prasanna.vsp80@gmail.com", "soqdhechjkcchkgl");
		}
		});
		// Used to debug SMTP issues
		session.setDebug(true);
		try {
		// Create a default MimeMessage object.
		MimeMessage  message = new MimeMessage(session);
		// Set From: header field of the header.
		message.setFrom(new InternetAddress(from));
		// Set To: header field of the header.
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
		// Set Subject: header field
		message.setSubject(subject);
		// Now set the actual message
		message.setText(body);
		System.out.println("sending...");
		// Send message
		Transport.send(message);
		System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
		mex.printStackTrace();
		}
	}
}