package com.practice.week6.singleton_pattern;

public class LoggerMain {
    public static void main(String[] args) {
        Logger loggerObj1 = Logger.getInstance("Obj1");
        loggerObj1.printLog();

        Logger loggerObj2 = Logger.getInstance("Obj2");
        loggerObj2.printLog();

    }
}
