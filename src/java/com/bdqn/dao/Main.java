public class Main {
public static void main(String[] args) {
String[][] countries = { { "United States", "New York" }, { "United Kingdom", "London" },
{ "Netherland", "Amsterdam" }, { "Japan", "Tokyo" }, { "France", "Paris" } };
Map countryCapitals = ArrayUtils.toMap(countries);
System.out.println("Capital of Japan is " + countryCapitals.get("Japan"));
System.out.println("Capital of France is " + countryCapitals.get("France"));
}
}
public void postMail( String recipients[ ], String subject, String message , String from) throws MessagingException
{
boolean debug = false;
Properties props = new Properties();
props.put("mail.smtp.host", "smtp.example.com");
Session session = Session.getDefaultInstance(props, null);
session.setDebug(debug);
Message msg = new MimeMessage(session);
InternetAddress addressFrom = new InternetAddress(from);
msg.setFrom(addressFrom);
InternetAddress[] addressTo = new InternetAddress[recipients.length];
for (int i = 0; i < recipients.length; i++)
{
addressTo[i] = new InternetAddress(recipients[i]);
}
msg.setRecipients(Message.RecipientType.TO, addressTo);
msg.addHeader("MyHeaderName", "myHeaderValue");
msg.setSubject(subject);
msg.setContent(message, "text/plain");
Transport.send(msg);
package com.bdqn.dao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
