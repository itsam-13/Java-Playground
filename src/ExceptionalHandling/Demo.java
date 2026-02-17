package ExceptionalHandling;

public class Demo {
    static void main() {

        int []num = {2,4,6,8,10};
        int sum = 0;
        float count = 5;
        for(int a:num){
            sum += a;
        }
        float avg = sum/0; // exception div by zero
        System.out.println(avg);

        }
}
