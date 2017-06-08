package com.wangjue.myjava;

public class OldStudent extends Student {
    public OldStudent(String strname, String strno, double eScore) {
        name = strname;
        no = strno;
        normScore = 0;
        examScore = eScore;
    }

    @Override
    public double getScore() {
        return examScore;
    }
}
