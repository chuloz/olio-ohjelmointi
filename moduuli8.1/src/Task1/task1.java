package Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "San Francisco"));


        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age:");
        people.forEach(person -> System.out.println(person));


        String filterCity = "New York";
        people.removeIf(person -> !person.getCity().equals(filterCity));

        System.out.println("\nFiltered by city (" + filterCity + "):");
        people.forEach(person -> System.out.println(person));
    }


    public static class Person {
        private String name;
        private int age;
        private String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}