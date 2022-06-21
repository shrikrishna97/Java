import java.util.*;

abstract class Voter implements Comparable<Voter> {
    String voter_id;
    int age;

    public Voter(String id, int a) {
        voter_id = id;
        age = a;
    }

    public int hashCode() {
        // overriding hashCode to generate the object’s id/hash code only
        // on the basis of voter_id
        return Integer.parseInt(voter_id);
        // return this.voter_id.hashCode();
    }

    // override compareTo method here
    public int compareTo(Voter o) {

        if (this.age < o.age) {
            return 1;
        } else if (this.age > o.age) {
            return -1;
        }
        return 1;
    }

    // override equals method here
    public boolean equals(Object o) {
        Voter o1 = (Voter) o;
        return this.voter_id.equals(o1.voter_id);
        // if (this==ob)
        // return true;
        // if (ob instanceof Account){
        // Account a = (Account)ob;
        // return this.acc_no.equals(a.acc_no);
        // }
        // return false;
    }
}

class FemaleVoter extends Voter {
    public FemaleVoter(String voter_id, int age) {
        super(voter_id, age);
    }

    public String toString() {
        return "Female Voter:" + voter_id + ", age:" + age;

    }
}

class MaleVoter extends Voter {
    public MaleVoter(String voter_id, int age) {
        super(voter_id, age);
    }

    public String toString() {
        return "Male Voter:" + voter_id + ", age:" + age;
    }
}

public class Exam4 {
    // Define voterChart method here
    public static void voterChart(ArrayList<Voter> reg) {
        LinkedHashSet<Voter> u = new LinkedHashSet<>(reg);
        TreeSet<Voter> s = new TreeSet<>(u);
        for (Voter a : s)
            System.out.println(a);
    }

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            ArrayList<Voter> registrations = new ArrayList<Voter>();
            // reading the number of Female voters
            int female_voters = s.nextInt();
            for (int i = 1; i <= female_voters; i++) {
                // reading voter_id
                String id = s.next();
                // reading age
                int age = s.nextInt();
                FemaleVoter f1 = new FemaleVoter(id, age);
                registrations.add(f1);
            }
            // reading the number of Female voters
            int male_voters = s.nextInt();
            for (int i = 1; i <= male_voters; i++) {
                // reading voter_id
                String id = s.next();
                // reading age
                int age = s.nextInt();
                MaleVoter m1 = new MaleVoter(id, age);
                registrations.add(m1);
            }
            voterChart(registrations);
        }
    }
}
