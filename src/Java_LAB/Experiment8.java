package Java_LAB;

public class Experiment8 {

    static class Person {
        String name;
        int age;


        void setPersonDetails(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayPersonDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }


    static class Student extends Person {
        int rollNo;
        String course;

        // Method to set student details
        void setStudentDetails(int rollNo, String course) {
            this.rollNo = rollNo;
            this.course = course;
        }

        // Method to display student details
        void displayStudentDetails() {
            // Calling inherited method
            displayPersonDetails();
            System.out.println("Roll No: " + rollNo);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

            Student s1 = new Student();

            s1.setPersonDetails("Xu Feng", 20);
            s1.setStudentDetails(101, "B.Tech CSE");

            System.out.println("Student Details:");
            s1.displayStudentDetails();
        }
    }


