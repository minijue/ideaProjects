package com.wangjue;

import com.wangjue.myjava.NormStudent;
import com.wangjue.myjava.OldStudent;
import com.wangjue.myjava.SpecialStudent;
import com.wangjue.myjava.Student;

public class Main {
    static double avg(Student ss[]) {
        double sum = 0.0;
        for (Student s : ss) {
            sum += s.getScore();
        }
        return sum /= ss.length;
    }

    public static void main(String[] args) {
        Student ss[] = new Student[5];
        ss[0] = new NormStudent("zhang3", "001", 78, 89);
        ss[1] = new NormStudent("li4", "002", 99, 89);
        ss[2] = new SpecialStudent("wang5", "003", 60, 71, 10);
        ss[3] = new NormStudent("zhao6", "004", 68, 55);
        ss[4] = new OldStudent("qian7", "105", 63);

        System.out.println("average score is " + avg(ss));
    }
}
