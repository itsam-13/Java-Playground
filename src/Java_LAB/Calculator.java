package Java_LAB;

class calc{
    void Sum(int a,int b){
        System.out.println(a+b);
    }
    void Sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void Sum(float a,float b){
        System.out.println(a+b);
    }
    void Sum(float a,int b){
        System.out.println(a+b);
    }
    void Sum(int a,float b){
        System.out.println(a+b);
    }
}

public class Calculator{
    static void main() {
        calc c = new calc();
        c.Sum(1,2);
        c.Sum(1,2,3);
        c.Sum(2,3.2f);
        c.Sum(2.2f,3.3f);
        c.Sum(2.3f,3);

    }
}
