package azc.uam.iterator;

import azc.uam.iterator.controller.ScheduleController;
import azc.uam.iterator.model.contact.Contact;
import azc.uam.iterator.model.schedule.Schedule;
import azc.uam.iterator.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Aguilera Yamal - 2203032706
 */
public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<Contact>();
        Schedule schedule = new Schedule(contacts);

        //Just for injection
        schedule.add(new Contact("Ana", "222-222-222"));
        schedule.add(new Contact("Juan", "111-111-111"));
        schedule.add(new Contact("Paola", "333-333-333"));

        ConsoleView view = new ConsoleView();
        ScheduleController controller = new ScheduleController(schedule, view);
        controller.showSchedule();
    }
}