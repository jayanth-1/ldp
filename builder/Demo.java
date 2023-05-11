package builder;

public class Demo {
    public static void main(String[] args) {
        // Instantiating with builder
        Person person = new Person.Builder()
                .setFirstName("Jayanth")
                .setLastName("Apoor")
                .setAge(25)
                .setAddress("Makthal")
                .setEmail("apoorjayanth@gmail.com")
                .build();
        System.out.println("Person " + person.getFirstName() + " " + person.getLastName() + " " + person.getEmail());

        // Instantiating with setters
        PersonWithSetters personWithSetters = new PersonWithSetters();
        personWithSetters.setAddress("Makthal");
        System.out.println("Person with setters " + personWithSetters.getAddress());

        //Yes, my code is mutable if you want to make it immutable make all fields final in Person class, here we can see I updated name
        Person anotherPerson = new Person.Builder().setFirstName("Nikhil").setLastName("Apoor").build();
        System.out.println("Another Person " + anotherPerson.getFirstName() + " " + anotherPerson.getLastName());
    }
}
