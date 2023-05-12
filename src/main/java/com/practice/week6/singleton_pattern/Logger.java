package com.practice.week6.singleton_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger {
    private static Logger instance;
    private String message;

    private Logger(String msg) {
        message = msg;
    }

    public synchronized static Logger getInstance(String msg) {
        if (instance == null) {
            instance = new Logger(msg);
        }
        return instance;
    }
    public void printLog() {

        log.info(message);
    }
}
