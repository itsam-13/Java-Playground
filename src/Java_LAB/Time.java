package Java_LAB;

class timeee{
    int hour;
    int minute;
    int second;
    void print(){
        System.out.println("hour:"+hour+" minute:"+minute+" second:"+second);

    }
    void sum(timeee t1,timeee t2){
        second=t1.second+t2.second;
        minute=t1.minute+t2.minute+second/60;
        second = second%60;
        hour=t1.hour+t2.hour+minute/60;
        minute=minute%60;
        hour = hour%24;

        String meridian;
        if(hour>12 && minute == 0 && second == 0){
            meridian = "PM";
        }
        else {
            meridian = "AM";
        }

        System.out.println("hour:"+hour+" minute:"+minute+" second:"+second +" "+meridian);
    }
}
public class Time {
    public static void main(String[] args) {

        timeee t1 =  new timeee();
        timeee t2 =  new timeee();
        timeee t3 =  new timeee();
        timeee t4 =  new timeee();

        t1.hour = 13;
        t1.minute = 9;
        t1.second = 50;

        t2.hour = 12;
        t2.minute = 59;
        t2.second = 59;

        t3.hour = 12;
        t3.minute = 50;
        t3.second = 11;

        t1.print();
        t4.sum(t1,t2);
    }
}
