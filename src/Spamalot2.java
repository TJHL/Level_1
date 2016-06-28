import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot2 implements ActionListener {
	static final String username = "leagueofamazing";
	static final String password = "code4life";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton buddon = new JButton();
	JTextField text = new JTextField("		");

	public static void main(String[] args) {
		Spamalot2 hi = new Spamalot2();
		hi.f();
	}

	public void f() {
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(buddon);
		button.setText("Bad");
		buddon.setText("Good");
		button.addActionListener(this);
		buddon.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		String a = text.getText();
		if (arg0.getSource() == button) {
			sendSpam(a, "", "");
		}
		if (arg0.getSource() == buddon) {
			sendSpam(a, "Puppy adoption",
					"You have won a free puppy!(Breed unknown. Puppy is not real in any way, its just in your head.)");
		}
	}

	private boolean sendSpam(String recipient, String subject, String content) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(username, password);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}
}