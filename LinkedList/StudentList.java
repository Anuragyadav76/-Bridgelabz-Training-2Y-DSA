package LinkedList;

class Student {
    int roll, age;
    String name;
    char grade;
    Student next;

    Student(int r, String n, int a, char g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
    }
}

public class StudentList {

    Student head;

    void addStudent(int r, String n, int a, char g) {
        Student s = new Student(r, n, a, g);

        if (head == null) {
            head = s;
            return;
        }

        Student temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = s;
    }

    void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }

    void delete(int roll) {
        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        StudentList s = new StudentList();

        s.addStudent(1,"Rahul",20,'A');
        s.addStudent(2,"Amit",21,'B');

        s.display();

        s.delete(1);

        System.out.println("After Delete");

        s.display();
    }
}
