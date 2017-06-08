package com.wangjue.myjava;

public class NormStudent extends Student {
    public NormStudent(String strname, String strno, double nScore, double eScore) {
        name = strname;
        no = strno;
        normScore = nScore;
        examScore = eScore;
    }

    @Override
    public double getScore() {
        return normScore * 0.3 + examScore * 0.7;
    }
}
