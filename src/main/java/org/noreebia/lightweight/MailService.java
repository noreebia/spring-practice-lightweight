package org.noreebia.lightweight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("");

        msg.setSubject("Another Test");
        msg.setText("Hello Again!\n Spring Boot Email");

        javaMailSender.send(msg);

    }
}
