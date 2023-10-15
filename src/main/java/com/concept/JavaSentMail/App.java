package com.concept.JavaSentMail;
import com.concept.JavaSentMail.email.GEmailSender;

public class App 
{
	 public static void main(String[] args) {

    GEmailSender gEmailSender = new GEmailSender();
    String to = "mamootykerala6@gmail.com";
    String from = "hackathon456@gmail.com";
    String subject = "Hello World 1";
    String text = "This is a example email send using gmail and java program with out less secure app";
    boolean b = gEmailSender.sendEmail(to, from, subject, text);
    if (b) {
        System.out.println("Email is sent successfully");
    } else {
        System.out.println("There is problem in sending email");
    }
}
}
