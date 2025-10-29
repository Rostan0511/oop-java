package introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 num
        int[] numbers = {1,2,3,4,5};
        // store 5 names
        String[] names = new String[5];

        Student[] students = new Student[5];
        //Student rostan; // declaration (not yet initialized till then it will be shown as null)
        //System.out.println(Arrays.toString(students));
        Student student1 = new Student();
        student1.roll = 13;
        student1.marks = 93.22f;
        student1.name = "rostan lobo";
        System.out.println(student1.marks);
        System.out.println(student1.name);
        System.out.println(student1.roll);

    }
    static class Student {
        int roll;
        String name;
        float marks;
    }
}
