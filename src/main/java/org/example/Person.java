package org.example;


import java.util.*;

public class Person {

    private int id;
    private String firstName;
    private String lastname;
    private int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String firstName, String lastname, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }


    private static List<Person> generateRandomPeople(int i) {

        Random random = new Random();
        List<Person> people = new ArrayList<>();

        Set<Integer> usedIds = new HashSet<>();

         for ( i = 0; i < 100; i++) {
            int id;
            do {
                id = random.nextInt(100) + 1;
            } while (usedIds.contains(id));

            usedIds.add(id);

            String firstName = generateRandomName();
            String lastName = generateRandomName();
            int age = random.nextInt(100) + 1;

            Person person = new Person(id, firstName, lastName, age);
            people.add(person);
        }

        return people;
    }

    public static String generateRandomName() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        int length = random.nextInt(6) + 5;

        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            name.append(c);
        }

        return name.toString();
    }




    public static void main(String[] args) {
        {
            List<Person> personList = generateRandomPeople(100);
            System.out.println("All people");
            System.out.println(personList);

            System.out.println("People whose age > 60 are");
            for (Person person : personList) {
                if (person.getAge() > 60) {

                    System.out.println(person);
                }
            }

            System.out.println("People with odd number id's are");
            for (Person person : personList) {
                if (person.getId() % 2 == 1) {
                    System.out.println( person);
                }
            }
        }
    }
}

