package azc.uam.iterator.controller;

import azc.uam.iterator.model.contact.Contact;
import azc.uam.iterator.model.contact.Contactiterator;
import azc.uam.iterator.model.schedule.Schedule;
import azc.uam.iterator.view.ConsoleView;

public class ScheduleController {
    private Schedule schedule;
    private ConsoleView view;

    public ScheduleController(Schedule schedule, ConsoleView view){
        this.schedule = schedule;
        this.view = view;
    }

    public void showSchedule(){
        view.showHeader();
        Contactiterator contactiterator = schedule.createIterator();
        while(contactiterator.hasNext()){
            Contact contact = contactiterator.next();
            view.showContact(contact);
        }
        view.getLineSeparator(15);
    }
}
