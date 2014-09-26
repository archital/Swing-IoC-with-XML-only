package home.luxoft.myswingioc;

import java.util.List;


public interface ContactsDao {
     void addContact(Contact contact);
    void deleteContact(Contact contact);
    List<Contact> getAllContacts();
    void clearAll();
}
