import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Queue<Person> personQueue = new LinkedList<>();
        Person person5 = new Person("Игорь", "Архипов", 5);
        Person person1 = new Person("Филипп", "Воронов", 8);
        Person person2 = new Person("Алёна", "Загрекова", 7);
        Person person3 = new Person("Георгий", "Власов", 6);
        Person person4 = new Person("Алексей", "Панфилов", 4);
        Person[] personList = {person5, person1, person2, person3, person4};
        Queue<Person> personQueue = (Queue<Person>) generateClients(personList);
        while (!personQueue.isEmpty()) {
            Person person = personQueue.poll();
            int ticket = person.getTicket();
            person.setTicket(ticket - 1);
            if (ticket > 0) {
                personQueue.add(person);
                System.out.println(person.getName() + " " + person.getSurname() + "  " + "прокатился на аттракционе");
            } else {
                System.out.println("\t" + person.getName() + " " + person.getSurname() + "  " + "закончил кататься на аттракционе");
                personQueue.remove(person);
            }
        }
    }

    public static List<Person> generateClients(Person[] people) {
        List<Person> list = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i]);
        }
        return list;
    }
}