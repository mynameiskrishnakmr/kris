package com.bookstore;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Solution {
public static void main(String[] args) throws Exception{
SessionFactory sf = new Configuration().configure().buildSessionFactory();
Session session = sf.openSession();
session.beginTransaction();
Author chetan=new Author();
chetan.setName("chetan bhagat");
chetan.setEmailId("chetan@gmail.com");
chetan.setGender("male");
chetan.setUrl("www.chetanbhagat.com");
Author kalki=new Author();
kalki.setName("kalki");
kalki.setEmailId("kalki@gmail.com");
kalki.setGender("male");
kalki.setUrl("www.kkl.com");
System.out.println("1.ebook 2.paperbook");
Scanner in=new Scanner(System.in);
int ch=in.nextInt();
switch(ch){
case 1:
	Ebook e1 = new Ebook();
e1.setTitle("ponniyinselvan");
e1.setPrice(200);
e1.setIsbn("232jsdf");
e1.setPublisher("penguin");
e1.setEdition("2nd");
e1.setDownloadUrl("www.ebooks.com");
e1.setSizeInMb(23);
Ebook e2 = new Ebook();
e2.setTitle("five point someone");
e2.setPrice(150);
e2.setIsbn("232rer");
e2.setPublisher("macmilan");
e2.setEdition("1st");
e2.setDownloadUrl("www.chetanbhagat.fivepts.com");
e2.setSizeInMb(4);
e1.setProfile(kalki);
e2.setProfile(chetan);
kalki.setBook(e1);
chetan.setBook(e2);
session.save(chetan);
session.save(kalki);
session.save(e1);
session.save(e2);
session.getTransaction().commit();
session.close();
sf.close();
break;
case 2:
PaperBook p1 = new PaperBook();
p1.setTitle("ponniyin selvan");
p1.setPrice(300);
p1.setIsbn("232323fdf");
p1.setPublisher("penguin");
p1.setEdition("2nd");
p1.setShippingWeight(50);
p1.setInStock(43);
PaperBook p2 = new PaperBook();
p2.setTitle("five point someone");
p2.setPrice(201);
p2.setIsbn("rer34f");
p2.setPublisher("macmillan");
p2.setEdition("2nd");
p2.setShippingWeight(50);
p2.setInStock(35);
kalki.setBook(p1);
chetan.setBook(p2);
p1.setProfile(kalki);
p2.setProfile(chetan);
session.save(chetan);
session.save(kalki);
session.save(p1);
session.save(p2);
session.getTransaction().commit();
session.close();sf.close();
}
}
}