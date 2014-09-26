
package home.luxoft.myswingioc;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {
    

    public static void main(String[] args) throws SQLException {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");
        ContactsService cts = (ContactsService) context.getBean("contactsServiceImplement");
        ContactsServiceImplement contactsServiceImplement = (ContactsServiceImplement) context.getBean("contactsServiceImplement");
        Contact contact = (Contact) context.getBean("contact3");
        
      int gettercontactlistprop = contactsServiceImplement.getConlistprop();
      List gettercontactlist = contactsServiceImplement.getAllContacts();
        System.out.println(contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)); //true - ���� �� ������ �������� �����
        if (contactsServiceImplement.checkMaxSize(gettercontactlistprop, gettercontactlist)==true){
      contactsServiceImplement.addContact(contact);   // ������� �������� ��� �������� ������ ������� � List<Contact>
        } else {System.out.println("Contact book is full!");}
        List li = contactsServiceImplement.getAllContacts();
        for (Iterator it = li.iterator(); it.hasNext();) {
            Object object = it.next();
            System.out.println(object.toString());
        }
        
          
            
    }  
}
