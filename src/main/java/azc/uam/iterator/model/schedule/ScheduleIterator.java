package azc.uam.iterator.model.schedule;

import azc.uam.iterator.model.contact.Contact;
import azc.uam.iterator.model.contact.Contactiterator;

import java.util.List;

public class ScheduleIterator implements Contactiterator {
    private int index;
    private List<Contact> contacts;

    public ScheduleIterator(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean hasNext() {
        return index < contacts.size();
    }

    @Override
    public Contact next() {
        return contacts.get(index++);
    }
}
