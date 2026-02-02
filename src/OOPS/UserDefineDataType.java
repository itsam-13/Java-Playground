package OOPS;

import java.util.Scanner;

class Students{      // we made our own datatype.
    String name;
    int rno;
    double cgpa;

}
public class UserDefineDataType {

    static void main() {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students(); //declaration
        s1.name="John";
        s1.rno=12345;
        s1.cgpa=4.5;

        Students s2 = new Students();
        s2.name="Johnny";
        s2.rno=sc.nextInt();
        s2.cgpa=8.5;

        //s1,s2 are objects
        //objects are real life entities and class are blueprint

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);


    }
}
