import java.util.*;

class Employee implements Comparable<Employee> {
    int ID;
    int experience;
    int nleaves;

    public Employee(int i, int e, int l) {

        ID = i;
        experience = e;
        nleaves = l;
    }
    
    public boolean equals(Employee o) {
        
        // Employee o = (Employee) o;
    	if (this.ID == o.ID){
            return true;
        }
        return false;
    }
   
    public int compareTo(Employee obj) {
        if ((obj.experience <= this.experience) && (obj.nleaves >= this.nleaves) ){
            return 1;
        }
        // else if ((obj.experience <= this.experience) && (obj.nleaves < this.nleaves) ){
        //     return -1;
        // }
        // else if (obj.experience > this.experience){
        //     return -1;
        // }
        // else if (obj.nleaves > this.nleaves){
        //     return -1;
        // }
        return -1;
        // else{
        // return 0;}
        
    }
    // Override equals(Object o) here
    // Override compareTo(Object o) here
}

public class Company {
    public static int displayID(Employee[] emp) {
        int max = 0;
        int n = 0;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (!emp[i].equals(emp[j])) {
                    count = count + emp[i].compareTo(emp[j]);
                }
            }
            if (count > max) {
                max = count;
                n = emp[i].ID;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Employee[] e = new Employee[4];
            e[0] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
            e[1] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
            e[2] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
            e[3] = new Employee(sc.nextInt(), sc.nextInt(), sc.nextInt());
            int id = displayID(e);
            System.out.println(id);
        }
    }
}
