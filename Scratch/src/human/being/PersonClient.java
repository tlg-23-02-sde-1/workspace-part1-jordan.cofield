package human.being;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person(" Jordan", LocalDate.of(1991, 06, 28));
        System.out.println(p1); // toString automatically called
        System.out.println();
        // Jordan is 31 years old

        System.out.printf("%s is %s years old", p1.getName(), p1.getAge());
    }
}