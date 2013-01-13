package ${package};

import ${package}.schemas.Person;

/**
 * @author $Author$
 * @version $Rev$
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Your Name");
        person.setAge(100);
        System.out.println("Hello World!");
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}