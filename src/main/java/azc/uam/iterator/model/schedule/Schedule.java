package azc.uam.iterator.model.schedule;

import azc.uam.iterator.model.contact.Contact;
import azc.uam.iterator.model.contact.Contactiterator;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements ContactCollector {
    private List<Contact> contacts;

    public Schedule(List<Contact> contacts) {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }


    @Override
    public Contactiterator createIterator() {
        return new ScheduleIterator(contacts);
    }
}
