package com.wangjue.myjava;

public abstract class Student {
    protected double normScore;
    protected double examScore;
    protected String name;
    protected String no;

    abstract public double getScore();
}