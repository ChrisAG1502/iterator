package azc.uam.iterator.view;

import azc.uam.iterator.model.contact.Contact;

public class ConsoleView {
    public void showHeader(){
        System.out.println("╔════════════════════════════╗");
        System.out.println("║          📁AGENDA          ║");
        System.out.println("╚════════════════════════════╝");
    }

    public void showContact(Contact contact){
        System.out.println("╔════════════════════════════╗");
        System.out.println("║ Nombre:" + contact.getName() + "               ║");
        System.out.println("║ Teléfono:" + contact.getPhone() + "       ║");
        System.out.println("╚════════════════════════════╝");
    }

    public void getLineSeparator(int size){
        for(int i = 0; i < size; i++){
            System.out.print("═");
        }
    }

}
