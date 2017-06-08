package com.wangjue.myjava;

/**
 * Created by wangjue on 17-6-8.
 */
public class SpecialStudent extends Student {
    private int additionalScore;

    public SpecialStudent(String strname, String strno, double nscore, double escore, int addscore) {
        name = strname;
        no = strno;
        normScore = nscore;
        examScore = escore;
        additionalScore = addscore;
    }

    @Override
    public double getScore() {
        return normScore * 0.3 + examScore * 0.7 + additionalScore;
    }
}
