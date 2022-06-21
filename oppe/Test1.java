import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private boolean comorbidity;

    public Person(String n, int a, boolean b) {
        this.name = n;
        this.age = a;
        this.comorbidity = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getComorbidity() {
        return comorbidity;
    }

    // Define compareTo() here
    public int compareTo(Person p1) {
        // Person p1 = (Person) p;
        if ((this.comorbidity == true) && (p1.comorbidity == true) && (this.age < p1.age)) {
            return 1;
        }

        else if ((this.comorbidity == true) && (p1.comorbidity == false)) {
            return 1;
        }

        return -1;
    }

    // Override equals() here
    public boolean equals(Person p) {
        if (this.name == p.name) {
            return true;
        }
        return false;
        // Person obj = (Person) p;
        // return this.name.equals(obj.name);
    }
}

public class Test1 {
    public static void displayPerson(ArrayList<Person> l) {
        String name = "";
        int max = 0;
        for (Person p1 : l) {
            int count = 0;
            for (Person p2 : l) {
                if (!p1.equals(p2)) {
                    count = count + p1.compareTo(p2);
                }
            }
            if (count > max) {
                max = count;
                name = p1.getName();
            }
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Person p1 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());
            Person p2 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());
            Person p3 = new Person(sc.next(), sc.nextInt(), sc.nextBoolean());

            ArrayList<Person> l1 = new ArrayList<Person>();
            l1.add(p1);
            l1.add(p2);
            l1.add(p3);
            displayPerson(l1);
        }
    }
}
