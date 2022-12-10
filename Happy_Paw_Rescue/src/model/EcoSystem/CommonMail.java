/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EcoSystem;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiale Lyu
 */
public class CommonMail {
    
        public static void sendEmailMessage(String emailId, String subject, String text) {
            String to = emailId;
            String from = "jialelyu22@gmail.com";
            String password = "prpdwgxekyqgilmw";

            Properties properties = System.getProperties();

            properties.put("mail.smtp.auth", "true");   //Enable authentication
            properties.put("mail.smtp.starttls.enable", "true");   //Set TLS encryption enabled

            properties.put("mail.smtp.host", "smtp.gmail.com");  //set SMTP host
            properties.put("mail.smtp.user", from);
            properties.put("mail.smtp.port", "587");
            properties.put("mail.smtp.ssl.trust", "*");
            properties.put("mail.smtp.ssl.protocols","TLSv1.2"); 


            Session session = Session.getDefaultInstance(properties);

            try {
                MimeMessage message = new MimeMessage(session);
                //general setting for sending email
                message.setFrom(new InternetAddress(from));
                message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                message.setSubject(subject);
                message.setText(text);
                Transport transport = session.getTransport("smtp");
                transport.connect("smtp.gmail.com", from, password);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                System.out.println("Sent message successfully....");
            } catch (MessagingException mex) {
                mex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Invalid email id");
            }
    }
    
    
}
