import javax.sound.sampled.SourceDataLine;

import java.net.SocketTimeoutException;
import java.util.*;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void Color(){
        System.out.println(this.color);
    }
}
 class Student{
    String name;
    int age;
    String Interest[] = {"Android", "Ios", "Cross Platform", "Hybrid"};

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        
        for(int i = 0; i<Interest.length; i++){
            System.out.println(Interest[i]);
        }
    }

    Student(String name,  int age){
        this.name = name;
        this.age = age;

    }
}
public class OOPS{
    public static void main(String[] args) {
        // Pen pen1 = new Pen();

        // pen1.color = "Red";
        // pen1.type = "Gel";

        // pen1.write();
        // pen1.Color();

        // Pen pen2 = new Pen();

        // pen2.color = "Blue";
        // pen2.type = "BallPen";
        
        // pen2.Color();

        Student student = new Student("Sajjad", 24);

        // student.name = "Md Sajjad Hossin";
        // student.age = 24;

        student.studentInfo();
    }
}